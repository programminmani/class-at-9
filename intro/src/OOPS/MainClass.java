package OOPS;

import OOPS.encapsulationExamples.Student;

public class MainClass {
	public static void main(String[] args) {
		Dog jack = new Dog("St. Bernarg", "brown and white", 3);
		Dog puff = new Dog("Cocker Spaniel", "black");
		//jack.color="brown";
		//jack.age=2;
		//jack.breed="German Shepherd";
		//puff.color="white";
		//puff.breed="Japanese Spitz";
		puff.age=6;
		//puff.feed();
		//jack.feed();
		System.out.println(jack.display());
		System.out.println(puff.display());
		
		Dog.feed();
		
		
		
		
		
	}
}
