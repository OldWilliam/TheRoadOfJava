/*
2015-10-19 обнГ6:45:15
*/
package test;

public class ReferencePass {
	public static void main(String[] args) {
		Aspen a = new Aspen();
		Aspen b = new Aspen();
		a.a = 100;
		b.a = 200;
		swap(a, b);
		a = b;
		System.out.println("a.a = "+a.a+"b.a = "+b.a);
	}
	
	public static void swap(Aspen a, Aspen b) {
		int temp;
		temp = a.a;
		a.a = b.a;
		b.a = temp;
	}
}

class Aspen{
	int a;
}
