/*
2015-12-16 ÏÂÎç10:04:08
*/
package multithreading;


public class TaskTest implements Runnable{
	private static int taskCount = 0;
	private int id = taskCount++;
	protected int countDown = 10;
	public TaskTest() {
		
	}
	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.println(Status());
		}
	}
	private String Status() {
		return "#"+id+"("+(countDown > 0 ? countDown : "liftoff!")+"),";
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new TaskTest()).start();
		}
	}
	
}
