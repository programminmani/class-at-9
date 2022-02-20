package intro.abstractionExample;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
//	void connect() {
//		System.out.println("connected");
//	}
//	void disconnect() {
//		System.out.println("Disconnected");
//	}
	
	Optional<T> get(long id);
    
    List<T> getAll();
    
    void save(T t);
    
    void update(T t, String[] params);
    
    void delete(T t);
	
}
