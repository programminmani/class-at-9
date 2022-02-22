package Methods;

import java.util.Scanner;

public class NumericPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int dig = digits(num);
		System.out.println("The number of digits in "+num+" is "+ dig+".");
		
		
		boolean b = palindrome(num);
		if(b) {
			System.out.println("Palindrome!");
		}
		else {
			System.out.println("not a palindrome!");
		}
	}

	static boolean palindrome(int num) {
		int temp, rem, rev=0;
		for(temp=num; temp>0; temp/=10) {
			rem = temp%10;
			rev =rev*10+rem;
		}
		if(num==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static int digits(int num) {
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	
	
	
}
