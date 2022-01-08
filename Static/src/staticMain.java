
public class staticMain {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accBal = 10000;
		acc.ifsc = 1010;
		acc.display();
		acc.show();
		Account acc1 = new Account();
		acc1.accBal = 20000;
		acc1.ifsc = 2020;
		acc1.display();
		acc1.show();

		acc.display();
		acc.show();

	}

}
