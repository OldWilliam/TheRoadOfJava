/*
2015-10-13 ����5:11:41
 */
package initialization;

/*
 * ��ʽ���þ�̬��ʼ��
 * 
 */

class Cup {
	public Cup(int maker) {
		System.out.println("Cup(" + maker + ")");
	}

	void f(int maker) {
		System.out.println("f(" + maker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
//	��̬��ʼ�����ڵı�����Ҳ����Ϊ��̬
//	��error Cup cup1;
//	��error Cup cup2;
	static {				//��̬��ʼ������δ���ִֻ��һ��
		cup1 = new Cup(1);	//(1)�״�����������һ������ʱ
		cup2 = new Cup(2);	//(2)�״η������������ľ�̬���ݳ�Աʱ�������δ���ɹ��Ǹ���Ķ���
	}						//
	public Cups() {
		System.out.println("Cups()");
	}
}

public class ExplictStatic {
	public static void main(String[] args) {
		Cups.cup1.f(99);
		/*	ouput:
		 * 	Cup(1)	//��Ȼû������cups���󣬵�Ҳִ����static���ڵ�����
		 * 	Cup(2)
		 * 	f(99)
		 */
		
		Cups cups = new Cups();
		//����Ҳ����о�̬��ʼ�������Ǿ�̬��ʼ������ֻ��ִ��һ�Σ���ΪCups.cup1.f(99)�Ѿ�ִ�й���so������
	}
}
