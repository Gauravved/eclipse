import java.util.Scanner;

public class UserExceptions {
	public static void main(String args[])  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the account balance:");
		double accbal=sc.nextDouble();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		try {
			if(accbal<1000) {
				throw new InvalidAccBal();
			}
		}catch(InvalidAccBal e) {
			System.out.println(e.toString());
		}
		try {
			if(age<18) {
				throw new InvalidAge();
			}
		}catch(InvalidAge e) {
			System.out.println(e.toString());
		}
	}
}
