package test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ArpPackageDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(5);
		list2.add(7);
		
		
		for(int i=0;i<list.size();i++){
			int n = list.get(i);
			for(int j=0;j<list2.size();j++){
				if (n == list.get(j)) {
					list.remove(n);
					break;
				}
			}
		}
		
//		for(Integer n:list){
//			for(Integer m:list2){
//				if (n.equals(m)) {
//					list.remove(n);
//					break;
//				}
//			}
//		}
		
		for(Integer temp : list)
			System.out.println(temp);
	}
}
