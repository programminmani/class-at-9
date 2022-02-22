package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadOneFromDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/dursikshya_db";
		String username = "root";
		String password = "root";
		String query="SELECT * FROM student where id = ?";
		
		System.out.println("Enter the id of the student: ");
		int id = new Scanner(System.in).nextInt();
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl,username, password);
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			
			st.id = rs.getInt("id");
			st.fName = rs.getString("fname");
			st.lName = rs.getString("lname");
			st.email = rs.getString("email");
			
			
		}
		
		
			System.out.println(st);
		
		
		
		
	}
}
