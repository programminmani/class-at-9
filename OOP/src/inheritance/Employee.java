package inheritance;

public class Employee extends Person{
	int empId;
	String department;
	String position;
	float salary;
	
	public String display(){
		return empId+" "+department+" "+position+" "
					+salary+" "+super.display();
	}
}
