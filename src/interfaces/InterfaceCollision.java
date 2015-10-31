/*
2015-10-31 下午9:31:56
*/
package interfaces;
/*
 * 	接口名字冲突	
 * 	实现多个接口尽量避免使用相同名字
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

class C4 extends C implements I3{	//C的方法f(),其实就是I3的一种实现（实现I3接口，重写C.f()）
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
	仅凭返回类型无法分开两个方法
}
*/
public class InterfaceCollision {
	
}
