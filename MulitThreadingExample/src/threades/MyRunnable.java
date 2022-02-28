package threades;

public class MyRunnable implements Runnable{
	public int interval;
	int threadId;
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println(threadId+". MyThread Running");
				Thread.sleep(interval);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
