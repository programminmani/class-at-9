package inheritance;

public class inheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.address = "pok";
		emp.nationalId = "12345";
		emp.name = "sukdev";
		emp.empId = 234;
		emp.department = "Faculty";
		emp.position = "Web Design Instructor";
		emp.salary = 36000;
		System.out.println(emp.display());
	}
}
