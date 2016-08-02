package multithreading;

public class SynchronizedDemo {
	//同步方法（锁的是对象）
	public synchronized void syncMethd() {
		
	}
	//同步对象（锁的是对象）
	public void syncThis() {
		synchronized(this){
			
		}
	}
	//同步类（锁的是class对象）
	public void syncClassMethod() {
		synchronized (SynchronizedDemo.class) {
			
		}
	}
	//同步静态方法（锁的是class对象）
	public synchronized static void syncStaticMethiod() {
		
	}
}
