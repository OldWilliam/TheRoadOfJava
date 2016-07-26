package multithreading;

public class JoinDemo {
	public static void main(String[] args) {
		joinThat();
	}
	static void joinThat(){
		Worker worker1 = new Worker("work-1");
		Worker worker2 = new Worker("work-2");
		worker1.start();
		System.out.println("start thread 1");
		try {
			worker1.join();
			System.out.println("start thread 2");
			worker2.start();
			worker2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread continue");
	}
	
	
	static class Worker extends Thread{
		public Worker(String name) {
			super(name);
		}
		@Override
		public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("work in " + getName());
		}
	}
	
	
}
