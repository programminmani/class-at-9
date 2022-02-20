package intro;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Make a choice: "
				+ "\n a. Americano"
				+ "\n b. Mocachino"
				+ "\n c. Cappuccino"
				+ "\n d. Latte");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch(choice) {
		case "a":
			System.out.println("Americano is served.");
			break;
		case "b":
			System.out.println("Mocachino is served.");
			break;
		case "c":
			System.out.println("Cappuccino is served.");
			break;
		case "d":
			System.out.println("Cafe Latte is served.");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
	
}
