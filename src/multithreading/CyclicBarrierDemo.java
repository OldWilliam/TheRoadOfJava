package multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	private static final int SIZE = 5;
	private static CyclicBarrier mCyclicBarrier;
	public static void main(String[] args) {
		mCyclicBarrier = new CyclicBarrier(SIZE,new Runnable() {
			
			@Override
			public void run() {
				System.out.println("now all the five thread catch the CylicBarrier, you have condition to perform sth. the one: "+mCyclicBarrier.getParties());
			}
		});
		
		for (int i = 0; i <SIZE; i++) {
			new WorkerThread().start();
		}
	}
	static class WorkerThread extends Thread{
		
		public void run() {
			System.out.println(Thread.currentThread().getName()+" waitting CyclicBarrier");
			try {
				//let this thread catch the mCyclicBarrier
				mCyclicBarrier.await();
				//when all the five thread catch the mCyclicBarrier,then continue
				System.out.println(Thread.currentThread().getName()+" continue");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			
		}
	}
}
