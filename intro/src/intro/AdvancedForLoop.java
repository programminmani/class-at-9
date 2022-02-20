package intro;

public class AdvancedForLoop {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		for(int i:num) {
			System.out.println(i);
		}
		String names[]= {"Nishan", "Niharika", "Rhitesh", "Manu", "Rohit", "Utsav"};
		for(String name:names) {
			System.out.println(name);
		}
		
		int j;
		for(j=0; j<6; j++) {
			System.out.println(j+". "+names[j]);
		}
	}
}
