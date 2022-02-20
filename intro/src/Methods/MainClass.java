package Methods;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
		
		//		dasdasd
		//		asdsa
		//		dasdas
		//		dasd
		//		asd
		
		n = sc.nextInt();
		prime(n);
		
		
		
	}
	
	
	static void prime(int num){
		int flag=0, i=2;
		while(i<(num+1)/2) {
			if(num%i==0) {
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1) {
			System.out.println("composite");
		}
		else {
			System.out.println("Prime");
		}
		
	}
	
	
}
