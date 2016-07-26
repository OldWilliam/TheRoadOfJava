/*
2015-12-16 ����10:04:08
*/
package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

import com.sun.corba.se.impl.orbutil.closure.Future;

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
