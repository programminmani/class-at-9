package OOPS.abstraction;

import java.util.Optional;

public class StudentDAO extends DAO<Student>{

	@Override
	void insert(Student st) {
		System.out.println("Student inserted");
		
	}

	@Override
	Optional<Student> read() {
		return Optional.of(new Student(1, "kiran", "shrestha", "kiran@gmail.com"));
	}

	

	@Override
	void update(Student t) {
		System.out.println("Student updated");
		
	}

	@Override
	void delete(Student t) {
	System.out.println("student deleted");
		
	}

}
