package hibernateExample.oneToOneRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OneToOneTest {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure()
							.addAnnotatedClass(Book.class)
							.addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Book book = new Book("Muna Madan", "Laxmi Prasad Devkota");
		Student st = new Student("Kaushal", "Pudasaini", "kaushal@gmail.com");
		st.book = book;
		book.st = st;
		Transaction tx = session.beginTransaction();
		session.persist(book);
		session.persist(st);
		tx.commit();
	}
}
