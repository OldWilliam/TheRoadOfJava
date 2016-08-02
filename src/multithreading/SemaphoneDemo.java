package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoneDemo {
	static int time = 0;
	public static void main(String[] args) {
		final ExecutorService executorService = Executors.newFixedThreadPool(3);
		final Semaphore semaphore = new Semaphore(3);
		for (int i = 0; i < 5; i++) {
			executorService.submit(new Runnable() {
				
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println("the rest of the semaphone "+semaphore.availablePermits());
						Thread.sleep(2000);
						semaphore.release();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
