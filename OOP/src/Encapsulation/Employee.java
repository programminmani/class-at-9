package Encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String position;
	private String dept;
	private float salary;
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int display() {
		System.out.println("Employee [empId=" + empId + ","
				+ " name=" + name + ", position=" + position 
				+ ", dept=" + dept + ", salary="
				+ salary + "]");
		return 0;
	}
	
	public Employee(int empId, String name, String position, String dept, float salary) {
		this.empId = empId;
		this.name = name;
		this.position = position;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {
	}
	
	
	
	
}
