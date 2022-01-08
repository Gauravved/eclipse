import java.util.*;

public class Hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HotelManager hm = new HotelManager();
		char ch;
		do {
			hm.orders();
			System.out.println("\nDo you want to order more?[y/n]:");
			String c = sc.next();
			ch = c.charAt(0);
		} while (ch == 'y' || ch == 'Y');
		hm.printbill();
		System.out.println(
				"\n------------------------------------ Thank you Visit Again ------------------------------------");
	}

}
