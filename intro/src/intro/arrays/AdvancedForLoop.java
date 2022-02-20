package intro.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedForLoop {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Car name: ");
			String car = sc.next();
			cars.add(car);
			System.out.println("do you have another name in mind? (y/n)");
			choice=sc.next();
			
		}while(choice.equalsIgnoreCase("y"));
		
		System.out.println("the cars you got are: ");
		for(String car:cars){
			System.out.println(car);
		}
	}
}
