package initialization;

public class TheOrderOfInit {
	public static void main(String[] args) {

		System.out.println(Father.staticValue);	}
}

class Father{
	static int staticValue = 100;
	static int staticValue2 = setValue();
	int value = 10;
	static{
		System.out.println("父类静态代码块");
		System.out.println("staticvalue2: "+staticValue);
	}
	private static int setValue() {
		return 0;
	}
	{
		System.out.println("父类非静态代码块");
	}

	public Father() {
		System.out.println("父类构造方法");
		System.out.println(staticValue);
		System.out.println(value);
	}


}

class Son extends Father{
	static{
		System.out.println("子类静态代码块");
	}

	{
		System.out.println("子类非静态代码块");
	}

	public Son() {
		System.out.println("子类构造方法");
	}
}