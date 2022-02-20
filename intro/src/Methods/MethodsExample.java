package Methods;

import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {
		//System.out.println("Enter two numbers: ");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		//int sum = add(x,y);
		//System.out.println("Summation: "+sum);
		calculate();
	}
	
	

	static void calculate() {
		System.out.println("Enter two numbers: ");
		int x = inputInt();
		int y = inputInt();
		subtract(x,y);
		
	}



	static int inputInt() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}



	static void subtract(int x, int y) {
		int diff = x-y;
		System.out.println("Difference: "+diff);
	}



	static int add(int a, int b){
		int c;
		c=a+b;
		return c;
	}
	
	
}
