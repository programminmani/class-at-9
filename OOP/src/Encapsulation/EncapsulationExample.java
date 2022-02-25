package Encapsulation;

public class EncapsulationExample {
	public static void main(String[] args) {
		Student st = new Student();
		//st.id = 1;
		st.setId(5);
		//st.fName = "Prahlad";
		st.setfName("Prahlad");
		//st.lName = "Gurung";
		st.setlName("Gurung");
		//st.email = "prahlad@gmail.com";
		st.setEmail("prahlad@gmail.com");
		//st.display();
		
		System.out.println(st);
		
	}
}
