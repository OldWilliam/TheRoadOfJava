/*
2015-10-12 ����10:11:35
 */
package control;
/*
 * 	��ǩlabel���൱��goto
 */
public class LabelTest {
	public static void main(String[] args) {
		/*	//��ǩ�����õĵط��յ������֮ǰ
		 * 	lable1:
		 *  //��Ҫ�ڱ�ǩ��������֮������κ����
		 * 	outer-iteration{
		 * 		inner-iteration{
		 * 			//...
		 * 			break;(1)
		 * 			//...
		 * 			continue;(2)
		 * 			//...
		 * 			continue label(3)
		 * 			//...
		 * 			break label(4)
		 * 		}
		 * 	}
		 */
		//��3���ж��ڲ����ⲿѭ�����ص���ǩ������������ִ�е������
		//��4���ж��ڲ����ⲿѭ�����ص���ǩ������������ִ�е�����䣬ʵ������ȫ��ֹ��������
		int i = 0;
		outer://����ֻ��ֱ��дѭ����䣬��Ȼ����
			for (; true;) {
				inner://Cant't have statements here
					for(; i < 10; i++){
						System.out.println("i = "+i);
						if(i == 5){
							continue outer;
						}
					}
			}
		//ʹ��label�龰��Ƕ��ѭ�������ڲ�ѭ��ֱ���������ⲿ
	}
}
