/*
2015-10-12 ����9:52:32
*/
package operators;
/*
 * 	��β������
 * 	
 */
public class CastingNumber {
	public static void main(String[] args) {
		double above = 0.8, below = 0.2;
		float fabove = 0.8f, fbelow = 0.2f;
		//double floatǿ��ת��ΪintĬ��Ϊ��β
		System.out.println("double floatĬ��Ϊ��β");
		System.out.println("double: "+(int)above+" "+(int)below);
		System.out.println("float: "+(int)fabove+" "+(int)fbelow);
		//���룺java.lang.Math��round����
		System.out.println("\n"+"double: "+Math.round(above)+" "+Math.round(below));
		System.out.println("float: "+Math.round(fabove)+" "+Math.round(fbelow));
	}
}
