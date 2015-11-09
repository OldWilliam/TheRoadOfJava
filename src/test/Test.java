/*
2015-11-2 ����8:15:02
 */
package test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

/**
 * ͼƬ�첽���ع�����
 * 
 * @version V1.0
 */
public class AsynImageLoader {

	// ͼƬ������
	private HashMap<String, SoftReference<Bitmap>> imageCache;
	// ��ʾͼƬ��ImageView
	private HashMap<String, ImageView> imageViews;

	public AsynImageLoader() {// ����
		imageCache = new HashMap<String, SoftReference<Bitmap>>();
		imageViews = new HashMap<String, ImageView>();
	}

	/**
	 * �������ϻ�ȡͼƬ
	 * 
	 * @param imageView
	 *            ��ʾͼƬ��ImageView
	 * @param imageUrl
	 *            ͼƬ�ĵ�ַ
	 * @return ͼƬ
	 */
	public Bitmap loadDrawableFromNet(final ImageView imageView,
			final String imageUrl) {
		return loadDrawable(imageView, imageUrl, new LoadCallBack() {
			public Bitmap load(String uri) {
				return loadImageFromNet(uri);
			}
		});
	}

	/**
	 * �ӱ��ػ�ȡͼƬ
	 * 
	 * @param imageView
	 *            ��ʾͼƬ��ImageView
	 * @param imageUrl
	 *            ͼƬ��·��
	 * @return ͼƬ
	 */
	public Bitmap loadDrawableFromLocal(final ImageView imageView,final String imageUrl) {
		return loadDrawable(imageView, imageUrl, new LoadCallBack() {
			public Bitmap load(String uri) {
				return loadImageFromLocal(uri);
			}
		});
	}

	/**
	 * ��ȡͼƬ
	 * 
	 * @param imageView
	 *            ��ʾͼƬ��ImageView
	 * @param imageUrl
	 *            ͼƬ·���������ַ
	 * @param load
	 *            �ص����� ���ر���ͼƬ���߼�������ͼƬ
	 * @return
	 */
	private Bitmap loadDrawable(final ImageView imageView, 
			final String imageUrl, final LoadCallBack load) {

		// �ж����������Ƿ���ͼƬ
		if (imageCache.containsKey(imageUrl)) {
			SoftReference<Bitmap> softReference = imageCache.get(imageUrl);
			Bitmap bitmap = softReference.get();
			if (bitmap != null) {
				return bitmap;// ���򷵻�
			}
		}

		// ��Ϊ��ӵ�ͼƬ��ʾ���ϵ� ImageViwe ���뵽����
		if (!imageViews.containsKey(imageUrl)) {
			imageViews.put(imageUrl, imageView);
		}

		final Handler handler = new Handler() {
			public void handleMessage(Message message) {
				imageViews.get(imageUrl).setImageBitmap((Bitmap) message.obj);
			}
		};

		// �����̻߳�ȡͼƬ
		new Thread() {
			public void run() {
				Bitmap bitmap = load.load(imageUrl);// ִ�лص�
				imageCache.put(imageUrl, new SoftReference<Bitmap>(bitmap));
				Message message = handler.obtainMessage(0, bitmap);
				handler.sendMessage(message);
			}
		}.start();
		return null;
	}

	private interface LoadCallBack {
		public Bitmap load(String uri);
	}

	/**
	 * ���������ͼƬ
	 * 
	 * @param url
	 * @return
	 */
	public Bitmap loadImageFromNet(String url) {
		URL m;
		InputStream i = null;
		try {
			m = new URL(url);
			i = (InputStream) m.getContent();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return BitmapFactory.decodeStream(i);
	}

	/**
	 * �ӱ��ؼ���ͼƬ
	 * 
	 * @param path
	 * @return
	 */
	public Bitmap loadImageFromLocal(String path) {
		return BitmapFactory.decodeFile(path);
	}
}