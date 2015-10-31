/*
2015-10-13 下午5:11:41
 */
package initialization;

/*
 * 显式调用静态初始化
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
//	静态初始化块内的变量，也必须为静态
//	！error Cup cup1;
//	！error Cup cup2;
	static {				//静态初始化，这段代码只执行一次
		cup1 = new Cup(1);	//(1)首次生成这个类的一个对象时
		cup2 = new Cup(2);	//(2)首次访问属于这个类的静态数据成员时（即便从未生成过那个类的对象）
	}						//
	public Cups() {
		System.out.println("Cups()");
	}
}

public class ExplictStatic {
	public static void main(String[] args) {
		Cups.cup1.f(99);
		/*	ouput:
		 * 	Cup(1)	//虽然没有生成cups对象，但也执行了static块内的内容
		 * 	Cup(2)
		 * 	f(99)
		 */
		
		Cups cups = new Cups();
		//这里也会进行静态初始化，但是静态初始化代码只能执行一次，因为Cups.cup1.f(99)已经执行过，so。。。
	}
}
