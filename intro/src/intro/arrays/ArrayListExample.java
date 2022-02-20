package intro.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
//		int[] num = new int[6];
//		List<String> names = new ArrayList<>();
//		String choice;
//		String name;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("Enter a name: ");
//			name = sc.next();
//			names.add(name);
//			System.out.println("do you want to continue(y/n): ");
//			choice = sc.next();
//		}while(choice.equalsIgnoreCase("y"));
//		
//		for(String a:names) {
//			System.out.println(a);
//		}
//		System.out.println("forloop");
//		for(int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
		
		
		//Linked lists and array list
		
		ArrayList<Integer> num = new ArrayList<>();
		num.add(12);num.add(23);num.add(34);num.add(43);num.add(32);
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Farrari"); cars.add("Lamborghini"); cars.add("Lexus"); 
		for(int i:num) {
			System.out.println(i);
		}
		for(String car:cars) {
			System.out.println(car);
		}
	}
}
