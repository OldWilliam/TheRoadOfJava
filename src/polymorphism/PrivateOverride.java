/*
2015-10-16 ����10:30:48
 */
package polymorphism;

/**
 * ����˽�з���()
 * 
 */
public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}
	public void g(){
		System.out.println("public g()");
	}
	public static void main(String[] args) {
		PrivateOverride p = new Derived();
		p.f();							//������Ȼ����������ת�ͣ�������Ϊf()��˽�еģ���Ĭ��Ϊfinal�ģ���̬ǰ�ڰ󶨵�,���Ե������f()��ʵ��һ��ȫ�µķ���
		p.g();							//��������ת�ͣ����Ǻ��ڶ�̬�󶨵�������ķ���g()������ִ�л����g()�������������Ǹ������࣬���ඨһ����������tune(),
		Derived d = new Derived();		//����������ת�ͻ����ִ���Լ��ķ����������̳еĺô�����������ת�ͣ����ְ��Լ��ķ����������ṩ��ͳһ�ӿڡ�
		d.f();							//�Ǹ�intrument������
										//static void tune(instrument i){
										//		i.play();				//���������ʵ�����Լ���play()������
                                        //}
	}
}

class Derived extends PrivateOverride{
	public void f(){
		System.out.println("public f()");
	}
	
	public void g() {
		System.out.println("Derived.g()");
	}
}