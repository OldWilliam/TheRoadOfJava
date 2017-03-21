package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ClassInfoErase {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		changeHashMap(map);
		Set keys = map.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(map.get(string));
		}
	}
	
	static void changeHashMap(HashMap map){
		HashMap<String, Integer> mHashMap = map;
		mHashMap.put("wx",1 );
		mHashMap.put("04131134",2);
		mHashMap.put("weinan",3);
	}
}
