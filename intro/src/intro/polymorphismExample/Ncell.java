package intro.polymorphismExample;

public class Ncell implements Sim {

	@Override
	public void call() {
		System.out.println("Calling using ncell..");
	}

	@Override
	public void surf() {
		System.out.println("Surfing internet using ncell");
		
	}
	
}
