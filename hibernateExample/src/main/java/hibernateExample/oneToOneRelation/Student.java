package hibernateExample.oneToOneRelation;

import jakarta.persistence.OneToOne;

public class Student {
	int id;
	String fName;
	String lName;
	String email;
	//@OneToOne
	Book book;
}
