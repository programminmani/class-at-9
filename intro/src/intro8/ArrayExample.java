package intro8;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6};
		String names[] = new String[6];
		
		int age[] = new int[50];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<5; i++) {
			
			age[i]= sc.nextInt();
		}
		for(i=0; i<5; i++) {
			System.out.println(age[i]);
		}	
		
	}
}
