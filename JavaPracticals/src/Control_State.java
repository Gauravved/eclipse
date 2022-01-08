import java.util.*;

public class Control_State {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1> Even or Odd \n2> Positive or Negative \nEnter your choice:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println(n + " is even umber");
			} else {
				System.out.println(n + "is odd number");
			}
			break;
		case 2:
			System.out.println("Enter the number:");
			n = sc.nextInt();
			if (n > 0) {
				System.out.println(n + " is positive number");
			} else {
				System.out.println(n + " is negative number");
			}
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
	}
}
