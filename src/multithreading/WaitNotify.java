package multithreading;

import sun.util.logging.resources.logging_es;

public class WaitNotify {
	private static Object sLockObject = new Object();
	public static void main(String[] args) {
		watiAndNotifyAll();
	}
	
	static void watiAndNotifyAll(){
		System.out.println("main thread running");
		//create and start work thread
		Thread thread = new WaitThread();
		thread.start();
		long startTime = System.currentTimeMillis();
		synchronized(sLockObject){
			System.out.println("main thread waiting");
			try {
				System.out.println();
				sLockObject.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long timsMs = System.currentTimeMillis() - startTime;
		System.out.println("main thread continue -> wait time:"+ timsMs);
	}
	
	//wait thread
	static class WaitThread extends Thread{
		@Override
		public void run() {
			synchronized (sLockObject) {
				try {
					Thread.sleep(3000);
					sLockObject.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
