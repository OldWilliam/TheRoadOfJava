package initialization;

public class ClassInitTest {
	public static void main(String[] args) {
		System.out.println(SubClass.value);
	}
}


class SuperClass{
	static{
		System.out.println("SuperClass Init");
	}
	
	public static int value = 123;
}


class SubClass extends SuperClass{
	static{
		System.out.println("SubClass Init");
	}
}
