package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureDemo {
	//thread pool
	static ExecutorService mExecutor = Executors.newSingleThreadExecutor();
	
	public static void main(String[] args) {
		try {
			futureWithRunnable();
			futureWithCallable();
			futureTask();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//submit a runnable object to thread pool
	private static void futureWithRunnable() throws InterruptedException,ExecutionException{
		//submit runnable,because the runnable no return value, the result.get() is null
		Future<?> result = mExecutor.submit(new Runnable() {
			
			@Override
			public void run() {
				fibc(20);
			}
		});
		System.out.println("future result from runnable:" + result.get());
	}
	
	//submit a callable object to thread pool
	private static void futureWithCallable() throws InterruptedException,ExecutionException {
		//submit callable
		Future<?> result2 = mExecutor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				return fibc(20);
			}
		});
		System.out.println("future result from callable:" + result2.get());
		
	}
	
	//submit a callable object to thread pool
	private static void futureTask() throws InterruptedException,ExecutionException {
		//create futureTask object
		FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				
				return fibc(20);
			}
		});
		mExecutor.submit(futureTask);
		System.out.println("future result from futureTask:" + futureTask.get());
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
