/*
2015-10-16 ����2:02:11
*/
package reusing;
/*
 *  �հ�final
 */
class Poppet{
	private int i;
	public Poppet(int ii) {
		i = ii;
	}
}
public class BlankFinal {
	private final int i = 0;//����ʼ����final��
	private final int j;	//�հ�final
	private final Poppet p; //blank final references
	//Blank final MUST BE intialized in the constructor
	public BlankFinal() {
		j = 1;
		p = new Poppet(0);
	}
	
	public  BlankFinal(int x) {
		j = x;
		p = new Poppet(x);
	}
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(49);
	}
}
