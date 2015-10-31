/*
2015-10-16 下午8:06:16
*/
/*
 * 
 */
/*
 * 
 */
package reusing;
/*
 * 	继承与初始化
 * 	The full process of initialization
 * 
 * 	初始化顺序：编译器访问Beetle.main(),一个静态方法，加载器开始启动并寻找Beetle类的编译代码，在对它进行加载的过程中，编译器注意到它有一个基类(由extends得知)
 * 	于是它进行加载基类，无论你打不打算产生该基类对象，这都要发生（就算你不创建Beetle对象也会发生，即注释掉new Beetle(),Insect的static域也会进行初始化）。
 * 
 * 	也就是说加载类的时候就会就会进行static域的初始化，就是编译器一找到你的类就会进行初始化static域。
 * 
 * 	加载完基类后，会继续加载导出类，初始化导出类的static域。全部加载完成后，对象就可以被创建了。
 * 	首先，对象中的所有基本类型设为默认值，对象引用设为null;
 * 	然后，基类的（是基类）构造器会被调用，基类构造器完成后，实例变量按照其次序进行被初始化，最后构造器其余部分被执行。
 */	

class Insect{
	private int i = 9;
	protected int j;
	public Insect() {
		System.out.println("i = " + i + ", j = " + j);						//4
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");		//1
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");						//5
	public Beetle() {
		System.out.println("k = "+ k);										//6
		System.out.println("j = "+ j);
	}
	private static int x2 = printInit("Beetle.x2 intialized");				//2
	public static void main(String[] args) {
		System.out.println("Beetle constructor");							//3
		Beetle b = new Beetle();
	}	
}
