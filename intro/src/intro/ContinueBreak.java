package intro;

public class ContinueBreak {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			if(i%5==0) {
				continue;
			}
			if(i==51) {
				break;
			}
			System.out.println(i);
		}
	}
	
}
