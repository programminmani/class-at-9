package DaoExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class DaoAbstract<T> implements DAO<T>{
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/dursikshya_db";
	String username = "root";
	String password = "root";
	Connection con;
	@Override
	public void connect() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void disconnect() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public abstract int insert(T t);

	@Override
	public abstract T getOne(int id);

	@Override
	public abstract List<T> getAll();

	@Override
	public abstract int update(T t) ;

	@Override
	public abstract int delete(int id) ;

}
