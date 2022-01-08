import java.util.Scanner;

public class Implicit_Type {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		float fl=n;
		System.out.println("The float value of the number entered is:"+fl);
	}

}
