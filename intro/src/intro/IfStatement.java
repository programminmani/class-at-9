package intro;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<16) {
			System.out.println("You are still a minor...");
		}
		else if(age<60){
			System.out.println("you are a valued citizen of our country.");
		}
		else {
			System.out.println("You are a senior citizen...");
		}
	}
}
