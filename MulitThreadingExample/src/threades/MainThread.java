package threades;

public class MainThread {
	public static void main(String[] args) {
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		MyRunnable myRunnable = new MyRunnable();
		myRunnable.threadId = 3;
		myRunnable.interval = 2000;
		Thread runnableThread = new Thread(myRunnable);
		
		
		myThread1.threadId = 1;
		myThread1.interval = 1500;
		myThread2.threadId = 2;
		myThread2.interval = 1000;
		myThread1.start();
		myThread2.start();
		runnableThread.start();
	}
}
