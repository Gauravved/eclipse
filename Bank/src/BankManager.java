import java.util.Scanner;

public class BankManager {
	Scanner sc = new Scanner(System.in);

	public Bankacc[] create() {
		System.out.println("How many accounts do you want to enter:");
		int n = sc.nextInt();
		Bankacc acc[] = new Bankacc[n];
		for (int i = 0; i < acc.length; i++) {
			System.out.println("Enter Information (Account number, Holder name, Balance) of " + (i + 1) + " customer:");
			int acno = sc.nextInt();
			while (acno <= 0) {
				System.out.println("\nRe-enter you account number:");
				acno = sc.nextInt();
			}
			acc[i] = new Bankacc(acno, sc.next(), sc.nextDouble());
		}
		Sort(acc, 1);
		return acc;
	}

	public void display(Bankacc acc[]) {
		System.out.println("\nAccount number \tName \t\tBalance");
		for (int i = 0; i < acc.length; i++) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println(acc[i].getAccNo() + "\t\t" + acc[i].getAccHolder() + "\t" + acc[i].getAccBal());
		}
	}

	public Bankacc search(Bankacc acc[], int s) {
		for (int i = 0; i < acc.length; i++) {
			if (acc[i].getAccNo() == s) {
				System.out.println("\nAccount number \tName \t\tBalance");
				System.out.println("------------------------------------------------------------------------");
				System.out.println(acc[i].getAccNo() + "\t\t" + acc[i].getAccHolder() + "\t" + acc[i].getAccBal());
				return acc[i];
			}
		}
		return acc[acc.length - 1];
	}

	public Bankacc[] delete(Bankacc acc[], int d) {
		boolean b = false;
		for (int i = 0; i < acc.length; i++) {
			if (acc[i].getAccNo() == d) {
				b = true;
				System.out.println("\nAccount number \tName \t\tBalance");
				System.out.println("------------------------------------------------------------------------");
				System.out.println(acc[i].getAccNo() + "\t\t" + acc[i].getAccHolder() + "\t" + acc[i].getAccBal());
				System.out.println("\nDo you want to delete this account? [y/n]:");
				String str = sc.next();
				char ch = str.charAt(0);
				if (ch == 'Y' || ch == 'y') {
					acc[i] = null;
					Bankacc a[] = new Bankacc[acc.length - 1];
					int k = 0;
					for (int j = 0; j < acc.length; j++) {
						if (k < acc.length - 1 && j != i) {
							a[k] = new Bankacc(acc[j].getAccNo(), acc[j].getAccHolder(), acc[j].getAccBal());
							k++;
						}
					}
					return a;
				} else
					return acc;
			}
			if (b) {
				System.out.println("This Account doesn't exist!!!");
			}
		}
		return acc;
	}

	public void Sort(Bankacc acc[], int n) {
		if (n == 1) {
			for (int i = acc.length - 1; i > 0; i--) {
				for (int j = acc.length - 1; j > 0; j--) {
					if (acc[j].getAccNo() <= acc[j - 1].getAccNo()) {
						Bankacc a = acc[j];
						acc[j] = acc[j - 1];
						acc[j - 1] = a;
					}
				}
			}
		} else if (n == 2) {
			for (int i = acc.length - 1; i > 0; i--) {
				for (int j = i; j > 0; j--) {
					if (acc[j].getAccBal() > acc[j - 1].getAccBal()) {
						Bankacc a = acc[j];
						acc[j] = acc[j - 1];
						acc[j - 1] = a;
					}
				}
			}
		}
	}

	public void update(Bankacc acc[]) {
		System.out.println("Enter the Account number to update its data:");
		int id = sc.nextInt();
		for (int i = 0; i < acc.length; i++) {
			if (acc[i].getAccNo() == id) {
				System.out.println("\n\t 1> Change Name of Account holder\n\t 2> Update  Balance \nEnter your choice:");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter new Name of the Account Holder:");
					String str = sc.next();
					int l = str.length();
					char c;
					for (int j = l; j <= 10; j++) {
						c = ' ';
						str = str.substring(0, l) + c;
						l++;
					}
					acc[i].setAccHolder(str);
					break;
				case 2:
					System.out.println("Enter the updated Balance of The account:");
					double sal = sc.nextDouble();
					acc[i].setAccBal(sal);
					Sort(acc, 2);
					break;
				default:
					System.exit(0);
				}
				display(acc);
				break;
			}
		}
	}
}