package multithreading;

public class YieldDemo {
	public static void main(String[] args) {
		yieldThat();
	}

	private static void yieldThat() {
		YThread y1 = new YThread("t1");
		YThread y2 = new YThread("t2");
		y1.start();
		y2.start();
	}

	static class YThread extends Thread{
		public YThread(String name) {
			super(name);
		}
		@Override
		public synchronized void run() {
			super.run();
			for(int i = 0; i<250;i++){
				System.out.printf("%s[%d]----->%d\n",this.getName(),this.getPriority(),i);
				if (i==2) {
					Thread.yield();
				}
			}
		}
	}

}
