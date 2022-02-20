package intro.EncapsulationExample;

public class Student {
	private int id;
	private String fName;
	private String lName;
	private String email;
	public Student(int id, String fName, String lName, String email) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
