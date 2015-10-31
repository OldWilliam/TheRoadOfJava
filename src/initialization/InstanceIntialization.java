/*
  2015-10-13 下午5:34:35
*/
package initialization;
/*
 * 	与静态初始化基本相同。。。
 * 	为了保证某些操作必要被执行
 */
class Mug{
	public Mug(int maker) {
		System.out.println("Mug("+maker+")");
	}
	void f(int maker){
		System.out.println("f("+maker+")");
	}
}
public class InstanceIntialization {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 && mug2 initialized");
	}
	public InstanceIntialization() {
		System.out.println("InstanceIntialization's contructor");
	}
	public static void main(String[] args) {
		new InstanceIntialization();
	}
}
