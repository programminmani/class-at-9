package polymorphism;

public class PolyExample {
	public static void main(String[] args) {
		int a=4, b=6, c=9;
		int sum1 = add(a,b);
		int sum2 = add(a,b,c);
		
		System.out.println("Sum1: "+sum1);
		System.out.println("Sum2: "+sum2);
	}
	
	
	
	static int add(int a, int b){
		int sum = a+b;
		return sum;
	}
	static int add(int a, int b, int c){
		int sum = a+b+c;
		return sum;
	}
}
