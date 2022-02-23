
public class Dog {
	String breed;
	String color;
	int age;
	
	public Dog(String breed, String color, int age) {	
		this.breed = breed;
		this.color = color;
		this.age = age;
		
	}
	
	public Dog() {
	}

	public void kick() {
		System.out.println("Bite!!!");
	}
	public void feed() {
		System.out.println("Jump an wiggle tail!");
	}
	
	public String display() {
		return this.breed+" "+this.color+" "+this.age+"years";
	}
}
