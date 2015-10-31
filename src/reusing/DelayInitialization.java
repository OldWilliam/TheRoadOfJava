/*
2015-10-15 下午9:19:44
*/
package reusing;
/*
 * 	惰性初始化
 */
public class DelayInitialization {
	private String str;
	@Override
	public String toString() {
		if (str == null) {  		//惰性初始化
			str = super.toString(); //可以这样用
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(new DelayInitialization().toString());
	}
}
