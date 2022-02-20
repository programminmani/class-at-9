package OOPS.abstraction;

public class MainClass {
	public static void main(String[] args) {
		StudentDAO sDao = new StudentDAO();
		sDao.connect();
		sDao.insert(new Student(2,"adasd","adssadas","asdsad"));
		sDao.disconnect();
	}
}
