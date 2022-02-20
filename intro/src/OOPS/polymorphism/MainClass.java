
package OOPS.polymorphism;

public class MainClass {
	public static void main(String[] args) {
		int a = add(1,2);
		int b = add(5,6,7);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	static int add(int i, int j) {
		return i+j;
	}
	static int add(int i, int j, int k) {
		return i+j+k;
	}
}
