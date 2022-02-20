package intro8;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("Enter your choice: "
				+ "\na. Americano"
				+ "\nb. Expresso"
				+ "\nc. Cappuccino"
				+ "\nd. Cafe Latte");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch(choice) {
		case "a":
			System.out.println("Americano is served.");
			break;
		case "b":
			System.out.println("Expresso is served.");
			break;
		case "c":
			System.out.println("Cappuccion is served.");
			break;
		case "d":
			System.out.println("Cafe latte is served.");
			break;
		default: 
			System.out.println("Invalid choice...");
		}
		
		
	}
}
