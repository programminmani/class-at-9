package DaoExample;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.Student;
public class DaoTest {
	
	private static Connection connection = null;
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		StudentDao stDao = new StudentDao();
		Student st = new Student();
		int i;
		ArrayList<Student> stList = new ArrayList<>();
	
			System.out.println("Enter choice");
			System.out.println("1. Insert Student");
			System.out.println("2. Select student");
			System.out.println("3. Select all students");
			System.out.println("4. Update student");
			System.out.println("5. Delete student");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the students details: \nfirst name: ");
				st.fName = scanner.next();
				System.out.println("last name: ");
				st.lName = scanner.next();
				System.out.println("email: ");
				st.email = scanner.next();
				i = stDao.insert(st);
				if(i==1) {
					System.out.println("Success");
				}
				else{
					System.out.println("failed");
				}
				break;	
			case 2:
				System.out.println("Enter the id of the student: ");
				int id = scanner.nextInt();
				st = stDao.getOne(id);
				System.out.println(st);
				break;
			case 3:
				System.out.println("List of all the students: ");
				stList = (ArrayList<Student>) stDao.getAll();
				for(Student s:stList) {
					System.out.println(s);
				}
				break;
				
			case 4:
				System.out.println("Enter the students details: \nid : ");
				st.id = scanner.nextInt();
				System.out.println("first name: ");
				st.fName = scanner.next();
				System.out.println("last name: ");
				st.lName = scanner.next();
				System.out.println("email: ");
				st.email = scanner.next();
				i= stDao.update(st);
				if(i==1) {
					System.out.println("Success");
				}
				else{
					System.out.println("failed");
				}
				break;
			
			case 5:
				System.out.println("Enter the id of the student to be deleted: ");
				id = scanner.nextInt();
				i = stDao.delete(id);
				if(i==1) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("falied");
				}
				break;
				
			
				
			default:
				break;
			}
		
	}
	
}

	