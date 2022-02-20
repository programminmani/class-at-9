package intro.EncapsulationExample;

public class RunnableClass {
	public static void main(String[] args) {
		Student st = new Student(1, "Subodh", "Khadka", "subodh@gmail.com");
		st.setfName("Prajwol");;
		System.out.println(st.getId()+". "+st.getfName()+" "+st.getlName()+"\t"+st.getEmail());
		
	}
}
