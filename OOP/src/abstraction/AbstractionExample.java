package abstraction;

import Encapsulation.Employee;

public class AbstractionExample {
	public static void main(String[] args) {
		Namaste namaste = new Namaste();
		namaste.register();
		namaste.call();
		namaste.data();
		
		Ncell ncell = new Ncell();
		ncell.register();
		ncell.call();
		ncell.data();
		
	}
}
