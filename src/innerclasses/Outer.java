package innerclasses;

/*
 * 	典型内部类
 */
public class Outer {
	class Inner {
		public String toString() {
			System.out.println("Hello,I'm inner");
			return null;
		}
	}

	public Inner getIn() {
		return new Inner();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner in = o.getIn();
		in.toString();
	}
}
