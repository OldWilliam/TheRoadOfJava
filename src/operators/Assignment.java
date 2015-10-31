/*
2015-10-12 下午8:31:29
*/
package operators;
/*
 * 别名问题
 */
class Tank{
	int level;
}
public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: "+t1.level+", t2.level: "+t2.level);
		//把引用t2赋值给t1，现在两个引用指向同一个对象
		t1 = t2;
		System.out.println("2: t1.level: "+t1.level+", t2.level: "+t2.level);
		//t2的level也同时会改变
		t1.level = 27;
		System.out.println("3: t1.level: "+t1.level+", t2.level: "+t2.level);
		t2.level = 30;
		System.out.println("4: t1.level: "+t1.level+", t2.level: "+t2.level);
	}
}
