package OOPS.abstraction;

import java.util.Optional;

public abstract class DAO<T> {
	void connect() {
		System.out.println("Connected to DB.");
	}
	void disconnect() {
		System.out.println("Disconnected from the DB.");
	}
	abstract void insert(T t);
	abstract Optional<T> read();
	abstract void update(T t);
	abstract void delete(T t);
}
