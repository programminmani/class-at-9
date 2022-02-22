package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadFromDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/dursikshya_db";
		String username = "root";
		String password = "root";
		String query="SELECT * FROM student";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl,username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<Student> stList = new ArrayList<>();
		while(rs.next()) {
			Student st = new Student();
			st.id = rs.getInt("id");
			st.fName = rs.getString("fname");
			st.lName = rs.getString("lname");
			st.email = rs.getString("email");
			stList.add(st);
			
		}
		
		for(Student st :stList) {
			System.out.println(st.toString());
		}
		
		
		
	}
}
