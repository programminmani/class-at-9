package Function;

import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {
		int a,b,sum;
		System.out.println("Enter any two numbers: ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		sum = add(a,b);
		System.out.println("Summation: "+sum);
		int c=23;
		sum = add(a,b,c);
		System.out.println("Summation: "+sum);
	}
	
	
	
	
	
	
	
	
	
	
	
	private static int add(int a,int b, int c) {
		return a+b+c;
	}
	private static int add(int a, int b) {	
		return a+b;
	}
	
}
