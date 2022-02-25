package abstraction;

public abstract class Sim {
	public void register() {
		System.out.println("Registered to the network!");
	}
	public abstract void call();
	public abstract void data();
}
