/*
2015-10-27 下午3:58:19
*/
package polymorphism;
/*
 * 	组合、继承和多态的构造顺序
 * 	1、调用基类构造器，调用最基类的构造器
 * 	2、按声明顺序调用成员的初始化方法
 * 	3、调用导出类构造器的主体
 */
class Meal{
	public Meal() {
		System.out.println("Meal()");
	}
}

class Bread{
	public Bread() {
		System.out.println("Bread()");
	}
}

class Cheese{
	public Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce{
	public Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal{
	public Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch{
	public PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

public class Sandwich extends PortableLunch{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	public static void main(String[] args) {
		new Sandwich();
	}
}
