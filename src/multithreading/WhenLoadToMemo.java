package multithreading;

public class WhenLoadToMemo {
	int num = 1;

	public static void main(String[] args) {
		final WhenLoadToMemo w = new WhenLoadToMemo();
		Thread t1 = new Thread(){
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				w.num++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();
		long startTime = System.currentTimeMillis();
		int old = w.num;
		while (true) {
			System.out.println(w.num);
			if (w.num > old) {
				System.out.println(w.num+" "+(System.currentTimeMillis()-startTime));
				break;
			}
		}
	}

}
