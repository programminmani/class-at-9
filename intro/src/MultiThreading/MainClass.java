package MultiThreading;

public class MainClass {
	public static void main(String[] args) {
		ThreadClass myThread1 = new ThreadClass(1);
		ThreadClass myThread2 = new ThreadClass(2);
		MyRunnable myRunnable = new MyRunnable(3);
		Thread myRunnableThread = new Thread(myRunnable);
		myThread1.start();
		myThread2.start();
		myRunnableThread.start();
		
	}
}
