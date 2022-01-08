import java.util.*;

class CarBike {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Automobile> a = new LinkedList<Automobile>();
		Manager mg = new Manager();
		int ch = 1, ch3 = 0;
		do {
			System.out.println("1> Sell \n2> BUY \n3> Exit \nEnter your choice:");
			ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("1> Car \n2> Bike \nWhat do you want to sell?:");
				int ch2 = sc.nextInt();
				if (ch2 == 1) {
					System.out.println("1> TATA \n2> Suzuki \n3> Honda \nEnter your choice:");
					ch3 = sc.nextInt();
					if (ch3 > 3) {
						System.out.println("Invalid choice!!");
					} else {
						a.add(mg.create(a, ch3, ch2));
					}
				} else if (ch2 == 2) {
					System.out.println("1> Suzuki \n2> Honda \nEnter your choice:");
					ch3 = sc.nextInt();
					if (ch3 > 3) {
						System.out.println("Invalid choice!!");
					} else {
						a.add(mg.create(a, ch3, ch2));
					}
				}
			} else if (ch == 2) {
				String s = "N";
				System.out.println("1> Car \n2> Bike \nWhat do you want to buy?:");
				int ch2 = sc.nextInt();
				if (ch2 == 1) {
					System.out.println("1> TATA \n2> Suzuki \n3> Honda \nEnter your choice:");
					ch3 = sc.nextInt();
					s = mg.display(a, ch3, ch2);
				} else if (ch2 == 2) {
					System.out.println("1> Suzuki \n2> Honda \nEnter your choice:");
					ch3 = sc.nextInt();
					s = mg.display(a, ch3, ch2);
				}
				while (s.equals("y") || s.equals("Y")) {
					s=mg.display(a, ch2, ch3);
				}
			} else if (ch == 3) {
				break;
			} else {
				System.out.println("Invalid choice!!");
			}
		} while (ch != 3);
		System.out.println("----------------------------------- THANK YOU -----------------------------------------");
		sc.close();
	}

}
