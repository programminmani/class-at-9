package intro.lambdas;

public class Lambdas {
	public static void main(String[] args) {
		Cat cat = new Cat();
		//cat.print();
		//printThing(cat);
		
		/*
		printThing(()->{
			System.out.println("Meow!");
		});
		*/
		
		//printThing(()->System.out.println("Meow!"));
		
		Printable lambdaPrintable = ()->System.out.println("Meow");
		printThing(lambdaPrintable);
	}
	static void printThing(Printable thing) {
		thing.print();
	}
}
