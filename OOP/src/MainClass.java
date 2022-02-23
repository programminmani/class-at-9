

public class MainClass {
	public static void main(String[] args) {
		Dog tommy= new Dog();
		tommy.kick();
		tommy.breed = "Cocker Spaniel";
		tommy.color = "Brown white";
		tommy.age = 2;
		System.out.println(tommy.display());
		Dog jack = new Dog();
		jack.breed = "Gloden Retriever";
		jack.color = "Golden";
		jack.age = 4;
		System.out.println(jack.display());
		
		Dog kale = new Dog("Dobberman", "black", 3);
		System.out.println(kale.display());
		
	}
}
