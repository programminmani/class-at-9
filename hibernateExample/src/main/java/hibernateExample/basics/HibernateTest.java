package hibernateExample.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Book.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Book book = new Book("Muna Madan", "Laxmi Prasad Devkota");
		
		Transaction tx = session.beginTransaction();
		session.persist(book);
		tx.commit();
	}
}
