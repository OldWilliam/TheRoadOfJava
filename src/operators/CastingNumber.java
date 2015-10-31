/*
2015-10-12 下午9:52:32
*/
package operators;
/*
 * 	截尾与舍入
 * 	
 */
public class CastingNumber {
	public static void main(String[] args) {
		double above = 0.8, below = 0.2;
		float fabove = 0.8f, fbelow = 0.2f;
		//double float强制转化为int默认为截尾
		System.out.println("double float默认为截尾");
		System.out.println("double: "+(int)above+" "+(int)below);
		System.out.println("float: "+(int)fabove+" "+(int)fbelow);
		//舍入：java.lang.Math的round（）
		System.out.println("\n"+"double: "+Math.round(above)+" "+Math.round(below));
		System.out.println("float: "+Math.round(fabove)+" "+Math.round(fbelow));
	}
}
