package bank.pack;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accno, name,account balance and age of the customer:");
		int accno=sc.nextInt();
		String name=sc.next();
		double accbal=sc.nextDouble();
		int age=sc.nextInt();
		Bankinfo binfo=new Bankinfo();
		try {
			binfo.create(accno,name,accbal,age);
			System.out.println("Your account is opened");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Thank you visit again!!!!!!");
	}
}