/*
2015-11-1 下午4:52:04
 */
package innerclasses;

/*
 * 生成对外部类对象的引用
 */
public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	};
	public class Inner{
		public DotThis outer(){
			return DotThis.this;	//类名.this 返回该类的引用
		}
	}
	
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();			//引用到外部类的方法
	}

}
