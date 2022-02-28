package polymorphism;

public class PolyExample {
	
	int add(int a, int b){
		int sum = a+b;
		return sum;
	}
	int add(int a, int b, int c){
		int sum = a+b+b;
		return sum;
	}
}
