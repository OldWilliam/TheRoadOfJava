/*
2015-10-15 ����9:32:12
*/
package reusing;

import java.util.ArrayList;

import test.OldMan;

/*	
 * 	������ǩ���������ı�ʶ��������������������б����ǲ����������ķ�������
 * 	��̬�������Ա��̳У������ǲ��ܱ���д��������Ϊ��̬�����Ǿ�̬�󶨣�����װ�ص�ʱ���Ѿ��󶨵�����������ˣ���������ʱ�󶨣���˲��ܱ���д
 * 	�������ӣ���OldMan
 */

public class ExtendMain {
	public static void main(String[] args) {
	}
	static int func(){
		System.out.println("ExtendMain.func()");
		return 0;
	}
	public void fun(){
		
	}
}

class SubClass extends ExtendMain{
	public static void main(String[] args) {
		ExtendMain.main(args);	
		func();					//���̳еĸ���ľ�̬����
		OldMan om = new OldMan();//��̬��������̬�󶨵�����
	}
	@Override
	public void fun() {
		func();					//����ľ�̬�������Ա����õ���˵�����̳���
	}
}
