package generics;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class UpBound {
	private static boolean add;

	static class Fruit{}
	static class Apple extends Fruit{}
	public static void main(String[] args) {
		List<? extends Fruit> fList = new ArrayList<Apple>();
//		fList.add((new Apple());  //error
		fList.add(null);
		
		List<? super Apple> apples = new ArrayList<>();
		add = apples.add(new Apple());
	}
	
	static class HongFushi extends Apple{}
}
