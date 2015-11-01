package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/*
 * 	����ӿ�
 * 	�������ӣ�
 * 		Scanner��Ĺ��������ܵľ���һ��Readable�ӿڣ���ʹ��Scanner���ؽ����������Ϊĳ���ض��࣬
 * 	����Scanner�Ϳ��������ڸ�������͡�����㴴����һ���ಢ������Scanner�����������Ǿ�Ӧ��������ΪReadable
 */
public class RandomWords implements Readable{
	private static Random rand = new Random(47);
	private static final char[] capitals =
			"QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
	private static final char[] lowers =
			"qwertyuiopasdfghjklzxcvbnm".toCharArray();
	private static final char[] vowels = 
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// Readable�ӿ��е�Ψһ����������ʵ��
		if (count-- == 0) {
			return -1;		//indicate(����) end of input
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(new RandomWords(5));//�������ʮ��
		Scanner s = new Scanner(new RandomWords(10));//�����ʮ��ʮ��
		while (s.hasNext()) {
			System.out.println(s.next());	
		}
	}
}


