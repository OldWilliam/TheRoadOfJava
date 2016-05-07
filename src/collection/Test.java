/*
2015-11-26 ÏÂÎç9:47:51
*/
package collection;

import java.util.HashMap;
import java.util.Hashtable;


public class Test {
	int fun(int i){
		return i;
	}
//	double fun(int i){
//		return (double)i;
//	}
	double fun(double i){
		return i;
	}
	public static void main(String[] args) {
		String s = "ThoughtCoding";
		String a = s.replace("T", "t");
		System.out.println(s);
		System.out.println(a);
		StringBuffer sBuffer = new StringBuffer("Its");
		System.out.println(sBuffer);
		s.equals(a);
		HashMap<String, String> h = new HashMap<>();
		h.put("me", "weixin");
		Hashtable<String, String> ha = new Hashtable<>();
		Object object = new Object();
		changeRefer(sBuffer);
		System.out.println(sBuffer);
		Exception exception;
	}
	
	private static void changeRefer(StringBuffer s) {
		s = new StringBuffer("Aha");
	}
	
}

