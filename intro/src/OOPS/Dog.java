package OOPS;

public class Dog {
	String color;
	String breed;
	int age;
	public Dog() {
	}
	public Dog(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	public Dog(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}
	
	static void feed(){
		System.out.println("Wiggle tail!");
	}
	String display() {
		return "its is a "+this.age+" years old "+this.color+" "+this.breed;
	}
}
