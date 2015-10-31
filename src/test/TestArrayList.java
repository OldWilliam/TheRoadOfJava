/*
2015-10-14 上午10:52:09
*/
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * arraylist的底层实现
 */
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("");
//		核心代码，add()
/*		 private void grow(int minCapacity) {
		        // overflow-conscious code
		        int oldCapacity = elementData.length;
		        int newCapacity = oldCapacity + (oldCapacity >> 1);
		        if (newCapacity - minCapacity < 0)
		            newCapacity = minCapacity;
		        if (newCapacity - MAX_ARRAY_SIZE > 0)
		            newCapacity = hugeCapacity(minCapacity);
		        // minCapacity is usually close to size, so this is a win:
		         * 复制数组内容，并返回新的长度
		        elementData = Arrays.copyOf(elementData, newCapacity);
		    }
*/
		LinkedList<String> k= new LinkedList<String>();
		int i = 4;
		System.out.println(i+(i>>1));
	}
}
