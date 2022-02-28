package Encapsulation;

import java.util.Scanner;

public class EncapsulationExample {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setName("Najim");
		emp.setDept("development");
		emp.setPosition("developer");
		emp.setSalary(42000.00f);
		emp.display();
		//System.out.println(emp.getEmpId());
	}
}
