/*
2015-10-16 下午10:10:38
 */
package polymorphism;
/*
 * 	方法的绑定
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
//		super.fun1();  // 陷入死循环，虽然调用到基类的方法，但是引用并没有绑定，new Father().fun1() 仍旧调用的是，son的fun2()
	}
}
