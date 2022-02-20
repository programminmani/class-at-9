package MultiThreading;

public class ThreadClass extends Thread{
	int threadNumber;
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i+". "+threadNumber+"Thread running!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	public ThreadClass(int threadNumber) {
		this.threadNumber=threadNumber;
	}
}
