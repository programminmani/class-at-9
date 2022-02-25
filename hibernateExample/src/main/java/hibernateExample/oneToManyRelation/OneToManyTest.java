package hibernateExample.oneToManyRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OneToManyTest {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
							.addAnnotatedClass(Book.class)
							.addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Book book1 = new Book("Muna Madan", "Laxmi Prasad Devkota");
		Book book2 = new Book("Principles of JAVA", "jack McCain");
		Student st = new Student("Kaushal", "Pudasaini", "kaushal@gmail.com");
		st.books.add(book1);
		st.books.add(book2);
		
		Transaction tx = session.beginTransaction();
		session.persist(book1);
		session.persist(book2);
		session.persist(st);
		tx.commit();
	}
}
