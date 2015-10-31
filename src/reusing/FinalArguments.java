/*
2015-10-16 下午2:10:26
*/
package reusing;
/*
 * 	using "final" with method arguments
 * 
 * 	当基本类型被指明为final时，你可以读参数，但是无法修改参数。
 * 	这一特性主要用来向匿名内部类传递数据
 * 	（极客学院上的项目的网络基类就是这样，构造函数里面，就是放了一个匿名Asyctask，传递得参数都必须是final的）
 */
class Gizmo{
	public void spin(){
		
	}
}
public class FinalArguments {
	void with(final Gizmo g){
//!		g = new Gizmo();    	//final引用不可以指向新的对象  Illegal
	}
	
	void without(Gizmo g) {
		g = new Gizmo();		//g不是final的
		g.spin();
	}
	
	void f(final int i){
//		i++;					//终态变量不可改变
//		这里i++： 其实是i = i + 1  对i进行了赋值
	}
	
	int g(final int i){
		return i + 1;			//这里只是把i加上1并返回，并没有对其赋值
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.with(new Gizmo());
		bf.without(new Gizmo());
	}
}
