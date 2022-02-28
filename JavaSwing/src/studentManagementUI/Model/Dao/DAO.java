package studentManagementUI.Model.Dao;

import java.util.List;

public interface DAO<T>{
	public void connect();
	public void disconnect();
	public int insert(T t);
	public T getOne(int id);
	public List<T> getAll();
	public int update(T t);
	public int delete(int id);
	
}
