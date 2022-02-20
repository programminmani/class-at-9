package intro.lambdas;

public class Cat implements Printable {

	String name;
	int age;
	
	public Cat() {
		
	}

	@Override
	public void print() {
		System.out.println("Meow");
		
	}

}
