package multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	public static void main(String[] args) {

	}
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	private  void perform() {
		lock.lock();
		try {
			
		} finally {
			lock.unlock();
		}
	}
}
