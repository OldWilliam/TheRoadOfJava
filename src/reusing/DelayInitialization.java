/*
2015-10-15 ����9:19:44
*/
package reusing;
/*
 * 	���Գ�ʼ��
 */
public class DelayInitialization {
	private String str;
	@Override
	public String toString() {
		if (str == null) {  		//���Գ�ʼ��
			str = super.toString(); //����������
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(new DelayInitialization().toString());
	}
}
