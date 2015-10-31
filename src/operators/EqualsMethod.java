/*
2015-10-12 下午8:51:26
 */
package operators;
/*
 * equals与==的不同
 * equals比较引用的对象的内容
 * == 比较比较引用本身
 */
class Dog{
	String name;
	String says;
	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
}

public class EqualsMethod {
	public static void main(String[] args) {
		Dog d1 = new Dog("spot", "Ruff!");
		Dog d2 = new Dog("scruffy", "Wurf!");
		System.out.format("%7s:%s\n", d1.name, d1.says);
		System.out.format("%7s:%s\n", d2.name, d2.says);
		Dog d3 = d1;
		System.out.println(d3 == d1);
		d3 = new Dog("spot", "Ruff!");
		System.out.println(d3 == d1);
		System.out.println(d3.equals(d1));
		
		
		Integer i1 = new Integer(38);
		Integer i2 = new Integer(38);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}
}


