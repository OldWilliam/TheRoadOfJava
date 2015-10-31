/*
2015-10-16 下午10:30:48
 */
package polymorphism;

/**
 * 覆盖私有方法()
 * 
 */
public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}
	public void g(){
		System.out.println("public g()");
	}
	public static void main(String[] args) {
		PrivateOverride p = new Derived();
		p.f();							//这里虽然进行了向上转型，但是因为f()是私有的，被默认为final的，静态前期绑定的,所以导出类的f()其实是一个全新的方法
		p.g();							//这里向上转型，但是后期动态绑定到导出类的方法g()，不会执行基类的g()。这里想起来那个乐器类，基类定一个发声方法tune(),
		Derived d = new Derived();		//导出类向上转型会各自执行自己的发生方法，继承的好处，可以向上转型，但又绑定自己的方法，基类提供了统一接口。
		d.f();							//那个intrument乐器类
										//static void tune(instrument i){
										//		i.play();				//导出类各自实现了自己的play()方法。
                                        //}
	}
}

class Derived extends PrivateOverride{
	public void f(){
		System.out.println("public f()");
	}
	
	public void g() {
		System.out.println("Derived.g()");
	}
}