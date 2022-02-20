package intro;

import java.util.Scanner;

public class MethodInJava {
	public static void main(String[] args) {
		calc();
		
		
		
	}
	
	
	private static void calc() {
		int x,y, sum;
		System.out.println("Enter any two numbers: ");
		x = input();
		y = input();
		sum = add(x,y);
		display(sum);
		
		
	}


	private static int input() {
		Scanner sc = new Scanner(System.in);
		int  i= sc.nextInt();
		return i;
	}


	private static void display(int sum) {
		System.out.println("Summation : "+sum);
	}


	static int add(int a, int b){
		return a+b;
	}
}
