/*
2015-10-12 ����8:41:15
 */
package operators;
/*
 * ���������еı�������
 * ���ݶ�������ù�ȥ����ı�������ֵ,���ܴﲻ������Ҫ�Ľ��
 */
class Letter{
	char c;
}
public class PassObject {
	static void f(Letter y){
		y.c = 'z';
	}
	public static void main(String[] args) {
		Letter l = new Letter();
		l.c = 'a';
		f(l);
		System.out.println(l.c);
	}
}