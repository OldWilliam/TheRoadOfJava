/*
2015-10-13 下午4:39:25
*/
package initialization;
/*
 * this的几种用法
 */
public class This {
	String s;
	int counter;
	public This() {
		this("init");
	//	this("init", 0); //不能用this调用两次构造函数，构造函数必须处于第一条语句
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
		s1.func("world");//这里两个对象调用了一个方法，java会默认传入调用者的引用
		s2.func("world");//来区别，实际是这样的：s1.func(s1, "world"); s2.func(s2, "world");
	}
	
}
