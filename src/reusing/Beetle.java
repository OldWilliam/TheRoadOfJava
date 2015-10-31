/*
2015-10-16 ����8:06:16
*/
/*
 * 
 */
/*
 * 
 */
package reusing;
/*
 * 	�̳����ʼ��
 * 	The full process of initialization
 * 
 * 	��ʼ��˳�򣺱���������Beetle.main(),һ����̬��������������ʼ������Ѱ��Beetle��ı�����룬�ڶ������м��صĹ����У�������ע�⵽����һ������(��extends��֪)
 * 	���������м��ػ��࣬������򲻴�������û�������ⶼҪ�����������㲻����Beetle����Ҳ�ᷢ������ע�͵�new Beetle(),Insect��static��Ҳ����г�ʼ������
 * 
 * 	Ҳ����˵�������ʱ��ͻ�ͻ����static��ĳ�ʼ�������Ǳ�����һ�ҵ������ͻ���г�ʼ��static��
 * 
 * 	���������󣬻�������ص����࣬��ʼ���������static��ȫ��������ɺ󣬶���Ϳ��Ա������ˡ�
 * 	���ȣ������е����л���������ΪĬ��ֵ������������Ϊnull;
 * 	Ȼ�󣬻���ģ��ǻ��ࣩ�������ᱻ���ã����๹������ɺ�ʵ�����������������б���ʼ��������������ಿ�ֱ�ִ�С�
 */	

class Insect{
	private int i = 9;
	protected int j;
	public Insect() {
		System.out.println("i = " + i + ", j = " + j);						//4
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");		//1
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");						//5
	public Beetle() {
		System.out.println("k = "+ k);										//6
		System.out.println("j = "+ j);
	}
	private static int x2 = printInit("Beetle.x2 intialized");				//2
	public static void main(String[] args) {
		System.out.println("Beetle constructor");							//3
		Beetle b = new Beetle();
	}	
}
