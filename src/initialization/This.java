/*
2015-10-13 ����4:39:25
*/
package initialization;
/*
 * this�ļ����÷�
 */
public class This {
	String s;
	int counter;
	public This() {
		this("init");
	//	this("init", 0); //������this�������ι��캯�������캯�����봦�ڵ�һ�����
	}
	public This(String args){
		this(args, 0);
		s = args;
	}
	public This(String args, int counter){
		s = args;
		this.counter = counter;
	}
	
	private void func(String string) {
	}

	public static void main(String[] args) {
		This s1 = new This();
		This s2 = new This();
		s1.func("world");//�����������������һ��������java��Ĭ�ϴ�������ߵ�����
		s2.func("world");//������ʵ���������ģ�s1.func(s1, "world"); s2.func(s2, "world");
	}
	
}
