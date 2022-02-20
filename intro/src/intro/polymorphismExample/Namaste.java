package intro.polymorphismExample;

public class Namaste implements Sim{

	@Override
	public void call() {
		System.out.println("Calling using namaste!");
	}

	@Override
	public void surf() {
		System.out.println("Surfing internet using Namaste");	
	}

}
