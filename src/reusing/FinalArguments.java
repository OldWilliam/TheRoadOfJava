/*
2015-10-16 ����2:10:26
*/
package reusing;
/*
 * 	using "final" with method arguments
 * 
 * 	���������ͱ�ָ��Ϊfinalʱ������Զ������������޷��޸Ĳ�����
 * 	��һ������Ҫ�����������ڲ��ഫ������
 * 	������ѧԺ�ϵ���Ŀ���������������������캯�����棬���Ƿ���һ������Asyctask�����ݵò�����������final�ģ�
 */
class Gizmo{
	public void spin(){
		
	}
}
public class FinalArguments {
	void with(final Gizmo g){
//!		g = new Gizmo();    	//final���ò�����ָ���µĶ���  Illegal
	}
	
	void without(Gizmo g) {
		g = new Gizmo();		//g����final��
		g.spin();
	}
	
	void f(final int i){
//		i++;					//��̬�������ɸı�
//		����i++�� ��ʵ��i = i + 1  ��i�����˸�ֵ
	}
	
	int g(final int i){
		return i + 1;			//����ֻ�ǰ�i����1�����أ���û�ж��丳ֵ
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
		bf.with(new Gizmo());
		bf.without(new Gizmo());
	}
}
