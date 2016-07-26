package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorDemo {
	//task number
	private static final int MAX = 10;
	
	public static void main(String[] args) {
		try {
			fixedThreadPool(3);
		} catch (CancellationException | ExecutionException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void fixedThreadPool(int size) 
		throws CancellationException,ExecutionException,InterruptedException{
			
		//create consistent number thread pool
		ExecutorService executorService = Executors.newFixedThreadPool(size);
		for (int i = 0; i < MAX; i++) {
			//submit task
			Future<Integer> task = executorService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					System.out.println("process thread: "+Thread.currentThread().getName());
					return fibc(40);
				}
			});
			System.out.println("the "+i+" time: "+ task.get());
		}
	}
	
	
	
	private static int fibc(int num) {
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		
		return fibc(num - 1) + fibc(num - 2);
	}
}
