package initialization;

public class ClassInitTest2 {
	public static void main(String[] args) {
		System.out.println(ConstClass.H);
	}
}

class ConstClass{
	static{
		System.out.println("ConstClass Init");
	}

	public static final String H = "hi";
}
