/*
2015-10-12 下午9:31:38
*/
package operators;
/*
 * 	移位运算符
 * 	1、左移低位补零
 * 	2、（有符号）右移使用符号扩展：符号为正，高位插入0；符号为负，高位插1
 * 	3、无符号右移（>>>）,无论正负高位插0，没有无符号左移， 
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		int j = -1;
		int k = 15;
		System.out.println(Integer.toBinaryString(i));
		//等号右边代表要移动的位数
		//与等号配合使用，移位完又被赋给原先的变量
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i)+"\n");
		
		j <<= 10;
		System.out.println(j+"\n"+Integer.toBinaryString(j)+"\n");
		
		System.out.println(Integer.toBinaryString(k));
		k >>= 2;
		System.out.println(k+"\n"+Integer.toBinaryString(k));
		
		//byte, short, char移位时先转换为int
	}
}
