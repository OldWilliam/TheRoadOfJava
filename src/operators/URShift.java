/*
2015-10-12 ����9:31:38
*/
package operators;
/*
 * 	��λ�����
 * 	1�����Ƶ�λ����
 * 	2�����з��ţ�����ʹ�÷�����չ������Ϊ������λ����0������Ϊ������λ��1
 * 	3���޷������ƣ�>>>��,����������λ��0��û���޷������ƣ� 
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		int j = -1;
		int k = 15;
		System.out.println(Integer.toBinaryString(i));
		//�Ⱥ��ұߴ���Ҫ�ƶ���λ��
		//��Ⱥ����ʹ�ã���λ���ֱ�����ԭ�ȵı���
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i)+"\n");
		
		j <<= 10;
		System.out.println(j+"\n"+Integer.toBinaryString(j)+"\n");
		
		System.out.println(Integer.toBinaryString(k));
		k >>= 2;
		System.out.println(k+"\n"+Integer.toBinaryString(k));
		
		//byte, short, char��λʱ��ת��Ϊint
	}
}
