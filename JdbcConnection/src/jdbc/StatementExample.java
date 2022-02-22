package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/dursikshya_db";
		String username = "root";
		String password = "root";
		
		
		Student st = new Student(4, "prakash", "raj bhnadari", "prakash@gmail.com");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		String query  = "INSERT INTO student VALUES("+
				+st.id
				+", '"
				+st.fName
				+"', '"
				+st.lName
				+"', '"
				+st.email
				+"')";
		//System.out.println(query);
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate(query);
		if(i==1) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
		con.close();
		
		
	}
}
