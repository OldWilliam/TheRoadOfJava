/*
2015-10-29 下午10:12:18
*/
package polymorphism;
/*
 * 	向下转型与运行时类型识别
 */
class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
	public void w(){}
}
public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {new Useful(), new MoreUseful()};
		x[0].f();
		x[1].g();
//		x[1].u();不能执行，已进行向上转型
		((MoreUseful)x[1]).u();//downcast 成功
		((MoreUseful)x[0]).u();//运行会报错
	}
}
