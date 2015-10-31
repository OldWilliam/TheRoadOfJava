/*
2015-10-12 下午8:41:15
 */
package operators;
/*
 * 方法调用中的别名问题
 * 传递对象的引用过去，会改变对象本身的值,可能达不到你想要的结果
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