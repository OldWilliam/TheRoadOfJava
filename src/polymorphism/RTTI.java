/*
2015-10-29 ����10:12:18
*/
package polymorphism;
/*
 * 	����ת��������ʱ����ʶ��
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
//		x[1].u();����ִ�У��ѽ�������ת��
		((MoreUseful)x[1]).u();//downcast �ɹ�
		((MoreUseful)x[0]).u();//���лᱨ��
	}
}
