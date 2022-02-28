package exceptionHandling;

public class Dao {
	
	void connect() throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}
