package intro8;

import java.util.Scanner;

public class LoopExample {
	public static void main(String[] args) {
		int a,b,c;
		a=0;
		b=1;
		int i;
		for(i=0; i<10; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
}
