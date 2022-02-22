package Methods;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		boolean flag = arms(num);
		if(flag) {
			System.out.println("armstrong");
		}
		else{
			System.out.println("not a armstrong");
		}
	}

	private static boolean arms(int num) {
		int digits = dig(num);
		int temp = num, rem, res=0;
		while(temp>0) {
			rem = temp%10;
			res+=power(rem, digits);
			temp/=10;
		}
		if(res==num) {
			return true;
		}
		return false;
	}

	private static int power(int num, int p) {
		int res=1;
		while(p>0) {
			res*=num;
			p--;
		}
		return res;
	}

	private static int dig(int num) {
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
}
