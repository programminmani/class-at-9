package intro.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayExample {
	public static void main(String[] args) {
		int[] num = new int[4];
		String names[] = {"surya", "Kiran", "jyoti", "rabina"};
		for(int i=0; i<4; i++) {
			System.out.println(names[i]);
		}
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(22);
		numbers.add(43);
		numbers.add(47);
		numbers.add(59);
		for(int i=0; i<5; i++) {
			System.out.println(numbers.get(i));
		}
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Kathmandu");
		cities.add("Bhaktapur");
		cities.add("Lalitpur");
//		for(int i=0; i<cities.size(); i++) {
//			System.out.println(cities.get(i));
//		}
		
		for(String city:cities) {
			System.out.println(city);
		}

	}
}
