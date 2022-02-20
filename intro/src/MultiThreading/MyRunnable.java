package MultiThreading;

public class MyRunnable implements Runnable{
	int threadNumber;
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i+". "+threadNumber+"Thread running!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	public MyRunnable(int threadNumber) {
		this.threadNumber=threadNumber;
	}

}
