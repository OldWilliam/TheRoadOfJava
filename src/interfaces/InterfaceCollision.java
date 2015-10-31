/*
2015-10-31 ����9:31:56
*/
package interfaces;
/*
 * 	�ӿ����ֳ�ͻ	
 * 	ʵ�ֶ���ӿھ�������ʹ����ͬ����
 */

interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}

class C{
	public int f(){
		return 1;
	}
}

class C2 implements I1, I2{

	@Override
	public int f(int i) {
		return 0;
	}

	@Override
	public void f() {
	}
	
}

/*class C3 extends C{
	
}
*/

/*class C3 implements I2{

	@Override
	public int f(int i) {
		return 0;
	}
	
}
*/

class C3 extends C implements I2{

	@Override
	public int f(int i) {
		return 0;
	}
	@Override
	public int f() {
		return super.f();
	}
	
}

class C4 extends C implements I3{	//C�ķ���f(),��ʵ����I3��һ��ʵ�֣�ʵ��I3�ӿڣ���дC.f()��
	@Override
	public int f() {
		return super.f();
	}
}

/*class C5 extends C implements I1{
	C:
		int f()
	I1:
		void f()
	��ƾ���������޷��ֿ���������
}
*/
public class InterfaceCollision {
	
}
