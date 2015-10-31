/*
2015-10-12 下午9:20:50
*/
package operators;
/*
 * 指数计数法
 * 
 */
public class Exponents {
	public static void main(String[] args) {
		System.out.println(Float.MAX_VALUE);
		/* output:
		 * 3.4028235E38
		 * E代表10的幂,而不是自然对数的基数
		 */
		//!false float f = 3.4028236E38F;
		//超过了最大值
		float f = 3.4028235E38F;
		System.out.println(f);
	}
}
