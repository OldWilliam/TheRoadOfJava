/*
2015-10-12 ����8:31:29
*/
package operators;
/*
 * ��������
 */
class Tank{
	int level;
}
public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: "+t1.level+", t2.level: "+t2.level);
		//������t2��ֵ��t1��������������ָ��ͬһ������
		t1 = t2;
		System.out.println("2: t1.level: "+t1.level+", t2.level: "+t2.level);
		//t2��levelҲͬʱ��ı�
		t1.level = 27;
		System.out.println("3: t1.level: "+t1.level+", t2.level: "+t2.level);
		t2.level = 30;
		System.out.println("4: t1.level: "+t1.level+", t2.level: "+t2.level);
	}
}
