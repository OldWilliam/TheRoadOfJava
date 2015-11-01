/*
2015-11-1 下午4:15:09
 */
/*
 *  内部类实现队列迭代器(证明内部类拥有外部类所有的访问权)
 */
package innerclasses;

interface Selector {
	boolean end();

	Object current();

	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length) {
			items[next++] = x;
		}
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}
		}

	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence s = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			s.add(Integer.toString(i));
		}
		Selector selector = s.selector();
		while (!selector.end()) {
			System.out.println(selector.current()+" ");
			selector.next();
		}
	}
}

