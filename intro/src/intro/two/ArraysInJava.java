package intro.two;

import java.util.Scanner;

public class ArraysInJava {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int[5];
		int A[][]= {{9,8,7},{6,5,4},{3,2,1}};			//new int[3][3];
		int B[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		Scanner sc  = new Scanner(System.in);
		
		for(i=0; i<5; i++) {
			System.out.print(a[i]+"\t");
		}
		for(i=0; i<5; i++ ) {
			b[i] = sc.nextInt();
		}
		
	}
}
