package Methods;

import java.util.Scanner;

public class PrimeComposite {
	public static void main(String[] args) {
//		System.out.println("Enter a number: ");
//		int x = new Scanner(System.in).nextInt();
//		
//		if(x<2) {
//			System.out.println("The number is neither a prime nor a composite.");
//		}
//		else {
//			//evaluate
//			int flag = prime(x);
//			if(flag==0) {
//				System.out.println("Prime");
//			}
//			else {
//				System.out.println("Composite");
//			}
//		}
		
		
		for(int i=2; i<100; i++) {
			int flag = prime(i);
			if(flag==0) {
				System.out.println(i);
			}
			
		}
		
	}

	private static int prime(int x) {
		int flag = 0;
		for(int i=2; i<(x+1)/2; i++) {
			if(x%i==0) {
				flag=1;
				break;
			}
		}
		return flag;

	}
}
