/*
2015-10-31 обнГ7:00:14
 */
package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;

public class Demo implements Readable{
	public static void main(String[] args) {

	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		return 0;
	}
}

abstract class A {

}

class B extends A {
	static void g(A a) {
		
	}

	void f() {

	}
}
