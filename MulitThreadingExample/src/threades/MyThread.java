package threades;

public class MyThread extends Thread{
	public int interval;
	int threadId;
	public void run(){
		
			
		try {
			for(int i=0; i<10; i++) {
				System.out.println(threadId+". MyThread Running");
				Thread.sleep(interval);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
