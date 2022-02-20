package intro8;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		int age = new Scanner(System.in).nextInt();
		if(age<18) {
			System.out.println("You are still a minor");
		}
		else if(age<60){
				System.out.println("You are a valued citizen!");
		}
		else {
			System.out.println("You are a senior citizen!");
		}
	
		
		
	}
}
