package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	private static int LATCH_SIZE = 5;

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(LATCH_SIZE);

		for (int i = 0; i < LATCH_SIZE; i++) {
			new WorkerThread(latch).start();
		}
		System.out.println("main thread wait");
		//wait the task complete(five thread complete their duty)
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("man thread continue");
	}

	static class WorkerThread extends Thread{
		private CountDownLatch mLatch;
		public WorkerThread(CountDownLatch mLatch) {
			this.mLatch = mLatch;
		}
		@Override
		public void run() {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+ " perform");
				//decrease the number of latch
				mLatch.countDown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
