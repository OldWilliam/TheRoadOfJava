/*
2015-11-1 ����4:52:04
 */
package innerclasses;

/*
 * ���ɶ��ⲿ����������
 */
public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	};
	public class Inner{
		public DotThis outer(){
			return DotThis.this;	//����.this ���ظ��������
		}
	}
	
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();			//���õ��ⲿ��ķ���
	}

}
