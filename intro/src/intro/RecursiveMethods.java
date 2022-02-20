package intro;

public class RecursiveMethods {
	public static void main(String[] args) {
		int f;
		for(int i=0; i<10; i++) {
			f = fib(i);
			System.out.println(f);
		}
	}

	private static int fib(int i) {
		if(i<2) {
			return i;
		}
		return fib(i-1)+fib(i-2);
	}
}
