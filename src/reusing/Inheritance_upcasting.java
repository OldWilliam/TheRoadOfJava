package reusing;
/*
2015-10-16 ����10:52:44
 */
/*
 *  �̳�������ת��
 *  ������ĳ����������д���򵼳���������ת��ʱ���÷����Ǳ���д��
 *  
 *  ����ѡ��̳л������ʱ�����Լ��������Ҫ����ת���𣿣�����
 *  �̳л��������ת�ͣ����а�ȫ�����𣡣�
 */
public class Inheritance_upcasting {
	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.show(frog);    //��Ȼshow()�Ĳ���ΪAmphibian���ͣ�����Ҳ���Խ���frog���ͣ�����ת��
	}
}

class Amphibian{
	public void swim() {
		System.out.println("swim()");
	}
	public void walk(){
		System.out.println("walk()");
	}
	static void show(Amphibian amphibian){
		amphibian.swim();		//�����ﴫ����frogͬ������ִ������������������ת�ͣ�
		amphibian.walk();
	}
}

class Frog extends Amphibian{
	@Override
	public void swim() {
		super.swim();
		System.out.println("frog jump on the land");//��дswim()��swim()ò��û������ת�ͣ��˴��ַ��������
	}
}