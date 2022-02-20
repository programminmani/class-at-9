package OOPS.encapsulationExamples;

public class MainClass {
	public static void main(String[] args) {
		Student st = new Student(1, "Saugat", "Basnet", "saugat@gmail.com");
		//st.setId(8);
		//st.id=4;
		Student st1 = new Student(5, "Naishan", "Giri", "nishan@gmail.com");
		System.out.println(st.getId()+". "+st.getfName()+" "+st.getlName()+"\t"+st.getEmail());
		System.out.println(st1.getId()+". "+st1.getfName()+" "+st1.getlName()+"\t"+st1.getEmail());
	}
}
