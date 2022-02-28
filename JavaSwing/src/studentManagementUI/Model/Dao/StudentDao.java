package studentManagementUI.Model.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import studentManagementUI.Model.Student;

public class StudentDao extends DaoAbstract<Student>{
	
	String query;
	PreparedStatement pstmt;
	ResultSet rs;
	@Override
	public int insert(Student st) {
		query  = "INSERT INTO student set fname=?,lname=?,email=?";
		int i=0;
		try {
			connect();
			pstmt = con.prepareStatement(query);
			//pstmt.setInt(1,st.id);
			pstmt.setString(1, st.fName);
			pstmt.setString(2, st.lName);
			pstmt.setString(3, st.email);
			i = pstmt.executeUpdate();
			disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public Student getOne(int id) {
		Student st = new Student();
		try {
			query="SELECT * FROM student where id = ?";
			System.out.println("Enter the id of the student: ");
			connect();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				st.id = rs.getInt("id");
				st.fName = rs.getString("fname");
				st.lName = rs.getString("lname");
				st.email = rs.getString("email");
			}
			disconnect();
		}catch (Exception e) {
			System.out.println(e);
		}
		return st;
	}

	@Override
	public List<Student> getAll() {
		ArrayList<Student> stList = new ArrayList<>();
		try {
			query="SELECT * FROM student";
			connect();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student();
				st.id = rs.getInt("id");
				st.fName = rs.getString("fname");
				st.lName = rs.getString("lname");
				st.email = rs.getString("email");
				stList.add(st);
				
			}
			disconnect();
		}catch (Exception e) {
			System.out.println(e);
		}
		return stList;
	}

	@Override
	public int update(Student st) {
		query  = "UPDATE student set fname=?, lname=?,email=? WHERE id=?";
		int i=0;
		try {
			connect();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.fName);
			pstmt.setString(2, st.lName);
			pstmt.setString(3, st.email);
			pstmt.setInt(4,st.id);
			i = pstmt.executeUpdate();
			
			disconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public int delete(int id) {
		query = "DELETE FROM student where id = ?";
		int i=0;
		try {
			connect();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			i = pstmt.executeUpdate();
			disconnect();
		}catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	
	
}
