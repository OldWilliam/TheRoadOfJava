/*
2015-10-14 ����10:52:09
*/
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * arraylist�ĵײ�ʵ��
 */
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("");
//		���Ĵ��룬add()
/*		 private void grow(int minCapacity) {
		        // overflow-conscious code
		        int oldCapacity = elementData.length;
		        int newCapacity = oldCapacity + (oldCapacity >> 1);
		        if (newCapacity - minCapacity < 0)
		            newCapacity = minCapacity;
		        if (newCapacity - MAX_ARRAY_SIZE > 0)
		            newCapacity = hugeCapacity(minCapacity);
		        // minCapacity is usually close to size, so this is a win:
		         * �����������ݣ��������µĳ���
		        elementData = Arrays.copyOf(elementData, newCapacity);
		    }
*/
		LinkedList<String> k= new LinkedList<String>();
		int i = 4;
		System.out.println(i+(i>>1));
	}
}
