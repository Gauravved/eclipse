import java.util.*;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankManager manage = new BankManager();
		Bankacc acc[] = null;
		int ch;
		do {
			System.out
					.println("\n\n----------------------------------- MENU-------------------------------------------");
			System.out.println(
					"1> Create Account \n2> Display Account \n3> Search Account \n4> Delete Account \n5> Sort \n6> Update record \n7> Exit\nEnter you choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				acc = manage.create();
				break;
			case 2:
				manage.display(acc);
				break;
			case 3:
				System.out.println("Enter the Account number to search:");
				int s = sc.nextInt();
				Bankacc ac = manage.search(acc, s);
				if (ac.getAccNo() != s) {
					System.out.println("The Account number does not Exist!!!!");
				}
				break;
			case 4:
				System.out.println("Enter the Account number to delete:");
				acc = manage.delete(acc, sc.nextInt());
				manage.display(acc);
				break;
			case 5:
				System.out.println("\t1> Sort by Account number \n\t2> Sort by balance \nEnter you choice:");
				int ch1 = sc.nextInt();
				if (ch1 == 1) {
					manage.Sort(acc, ch1);
					manage.display(acc);
				} else if (ch1 == 2) {
					manage.Sort(acc, ch1);
					manage.display(acc);
				} else {
					System.out.println("Invalid choice!!");
				}
				break;
			case 6:
				manage.update(acc);
				manage.display(acc);
				break;
			case 7: break;
			default:
				System.out.println("Invalid choice!!");
			}
		} while (ch != 7);
		System.out.println("--------------------------- THANK YOU -----------------------------------------------");
	}

}
