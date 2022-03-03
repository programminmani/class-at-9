package exceptionHandling;

import java.util.Scanner;

public class IoHandler {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num, flag=0;
		try {
			num=sc.nextInt();	
			connect();
		}catch(Exception e){
			System.out.println(e);
			num=0;
		}
		
		System.out.println("The number you enterd is: "+num+"");
	}
	
	static public void connect() throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
}
