/*
2015-10-16 下午2:02:11
*/
package reusing;
/*
 *  空白final
 */
class Poppet{
	private int i;
	public Poppet(int ii) {
		i = ii;
	}
}
public class BlankFinal {
	private final int i = 0;//被初始化的final域
	private final int j;	//空白final
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
