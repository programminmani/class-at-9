package jdbc;

public class Student {

	public int id;
	public String fName;
	public String lName;
	public String email;
	public Student(int id, String fName, String lName, String email) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}
	
	
	
	
	
}
