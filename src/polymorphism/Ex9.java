/*
2015-10-16 ����10:10:38
 */
package polymorphism;
/*
 * 	�����İ�
 */
public class Ex9 {

	public static void main(String[] args) {
		Father e = new Son();
		e.fun1();			
		Son s = new Son();
		s.fun1();
		s.fun2();
		new Father().fun2();
	}
}
class Father{
	public void fun1(){
		this.fun2();
	}

	public void fun2(){
		System.out.println("Father.fun2()");
	}
}
class Son extends Father{
	@Override
	public void fun2() {
//		super.fun1();  // ������ѭ������Ȼ���õ�����ķ������������ò�û�а󶨣�new Father().fun1() �Ծɵ��õ��ǣ�son��fun2()
	}
}
