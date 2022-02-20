package stringMethods;

public class Strings {
	public static void main(String[] args) {
		String name = "Sudarshan";
		String surname = "Khadka";
		String fullname = "      "+name+"        "+surname+"     ";
//		//String fullname = name.concat(surname);
//		int i=12345;
//		fullname = ""+i;
//		System.out.println(fullname);
		
		
		System.out.println(name.charAt(3));
		System.out.println("Code at 3: "+ surname.codePointAt(0));
		System.out.println("Length: "+ name.length());
		System.out.println(name.compareTo(surname));
		System.out.println(name.contains("ra"));
		System.out.println(name.endsWith("p"));
		System.out.println(fullname.trim());
	}
}
