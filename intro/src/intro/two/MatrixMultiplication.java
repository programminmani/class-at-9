package intro.two;

public class MatrixMultiplication {
	public static void main(String[] args) {

		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int P[][]= new int[3][3];
		int X[][] = {
				{1,2,3,4,5},
				{4,5,6,7,8},
				{7,6,5,4,3}
		};
				
			
				//new int[3][5];
		
		int i,j,k;
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				P[i][j]=0;
				for(k=0; k<3; k++) {
					P[i][j]+=A[i][k]*B[k][j];
				}
				System.out.print(P[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
		
	}
}
