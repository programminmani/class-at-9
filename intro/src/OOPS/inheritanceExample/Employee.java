package OOPS.inheritanceExample;

public class Employee extends Person{
	int empId;
	String position;
	String department;
	public void display() {
		super.display();
		System.out.println(super.nationalId+" "+super.name+" "+super.address+" "+empId+" "+position+" "+department);
	}
	
}
