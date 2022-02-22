package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/dursikshya_db";
		String username = "root";
		String password = "root";
		
		
		Student st = new Student(5, "Hari", "Bahadur", "hari@gmail.com");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		String query  = "INSERT INTO student VALUES(?,?,?,?)";
		//System.out.println(query);
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,st.id);
		pstmt.setString(2, st.fName);
		pstmt.setString(3, st.lName);
		pstmt.setString(4, st.email);
		
		int i = pstmt.executeUpdate();
		if(i==1) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
		con.close();
		
		
	}
}
