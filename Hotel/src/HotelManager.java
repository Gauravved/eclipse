import java.util.Scanner;

public class HotelManager {
	Scanner sc = new Scanner(System.in);
	Menu m = new Menu();
	int i = 0, j = 0;
	float total = 0;
	String order[] = new String[50];
	int orderPrice[] = new int[50], orderQty[] = new int[50], orderq[] = new int[50];

	public void orders() {
		System.out.println("1> Starter \n2> Main course \n3> Desert \nEnter your choice:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("\tSr no \t Item \t\t\tPrice");
			for (i = 0; i < m.getStarter().length; i++) {
				System.out.println("\n\t" + (i + 1) + ">\t" + m.getStarter()[i] + "\t" + m.getStarterPrice()[i]);
			}
			System.out.println("\n\t" + (i + 1) + ">\tBack");
			System.out.println("Enter your choice:");
			int o = sc.nextInt();
			if (o == (i + 1))
				return;
			else {
				System.out.println("Quantity of the Starter dish:");
				int qty = sc.nextInt();
				order[j] = m.getStarter()[(o - 1)];
				orderPrice[j] = m.getStarterPrice()[(o - 1)];
				orderQty[j] = qty;
				total = total + (orderPrice[j] * orderQty[j]);
			}
			break;
		case 2:
			System.out.println("\t1> Veg \n\t2> Non-Veg \n\t3> Rice \n\t4> Roti \nEnter your choice:");
			int ch1 = sc.nextInt();
			switch (ch1) {
			case 1:
				System.out.println("\n\t1> Paneer \n\t2> Vegetables \nEnter your choice:");
				int ch2 = sc.nextInt();
				if (ch2 == 1) {
					System.out.println("\tSr no \t Item \t\t\tPrice");
					for (i = 0; i < m.getPanner().length; i++) {
						System.out.println("\n\t" + (i + 1) + ">\t" + m.getPanner()[i] + "\t" + m.getPannerPrice()[i]);
					}
					System.out.println("\n\t" + (i + 1) + ">\tBack");
					System.out.println("Enter your choice:");
					o = sc.nextInt();
					if (o == (i + 1))
						return;
					else {
						System.out.println("Quantity of the Paneer dish:");
						int qty = sc.nextInt();
						order[j] = m.getPanner()[o - 1];
						orderPrice[j] = m.getPannerPrice()[o - 1];
						orderQty[j] = qty;
						total = total + (orderPrice[j] * orderQty[j]);
					}
				} else if (ch2 == 2) {
					System.out.println("\tSr no \t Item \t\t\tPrice");
					for (i = 0; i < m.getNormalVegi().length; i++) {
						System.out.println(
								"\n\t" + (i + 1) + ">\t" + m.getNormalVegi()[i] + "\t" + m.getNormalVegiPrice()[i]);
					}
					System.out.println("\n\t" + (i + 1) + ">\tBack");
					System.out.println("Enter your choice:");
					o = sc.nextInt();
					if (o == (i + 1))
						return;
					else {
						System.out.println("Quantity of the Vegetable dish:");
						int qty = sc.nextInt();
						order[j] = m.getNormalVegi()[o - 1];
						orderPrice[j] = m.getNormalVegiPrice()[o - 1];
						orderQty[j] = qty;
						total = total + (orderPrice[j] * orderQty[j]);
					}
				}
				break;
			case 2:
				System.out.println("\tSr no \t Item \t\t\tPrice");
				for (i = 0; i < m.getNonVeg().length; i++) {
					System.out.println("\n\t" + (i + 1) + ">\t" + m.getNonVeg()[i] + "\t" + m.getNonVegPrice()[i]);
				}
				System.out.println("\n\t" + (i + 1) + ">\tBack");
				System.out.println("Enter your choice:");
				o = sc.nextInt();
				if (o == (i + 1))
					return;
				else {
					System.out.println("Quantity of the Non Veg dish:");
					int qty = sc.nextInt();
					order[j] = m.getNonVeg()[o - 1];
					orderPrice[j] = m.getNonVegPrice()[o - 1];
					orderQty[j] = qty;
					total = total + (orderPrice[j] * orderQty[j]);
				}
				break;
			case 3:
				System.out.println("\tSr no \t Item \t\t\tPrice");
				for (i = 0; i < m.getRice().length; i++) {
					System.out.println("\n\t" + (i + 1) + ">\t" + m.getRice()[i] + "\t" + m.getRicePrice()[i]);
				}
				System.out.println("\n\t" + (i + 1) + ">\tBack");
				System.out.println("Enter your choice:");
				o = sc.nextInt();
				if (o == (i + 1))
					return;
				else {
					System.out.println("Quantity of the Rice dish:");
					int qty = sc.nextInt();
					order[j] = m.getRice()[o - 1];
					orderPrice[j] = m.getRicePrice()[o - 1];
					orderQty[j] = qty;
					total = total + (orderPrice[j] * orderQty[j]);
				}
				break;
			case 4:
				System.out.println("\tSr no \t Item \t\t\tPrice");
				for (i = 0; i < m.getRoti().length; i++) {
					System.out.println("\n\t" + (i + 1) + ">\t" + m.getRoti()[i] + "\t" + m.getRotiPrice()[i]);
				}
				System.out.println("\n\t" + (i + 1) + ">\tBack");
				System.out.println("Enter your choice:");
				o = sc.nextInt();
				if (o == (i + 1))
					return;
				else {
					System.out.println("Quantity of the Roti:");
					int qty = sc.nextInt();
					order[j] = m.getRoti()[o - 1];
					orderPrice[j] = m.getRotiPrice()[o - 1];
					orderQty[j] = qty;
					total = total + (orderPrice[j] * orderQty[j]);
				}
				break;
			case 5:
				break;
			default:
				System.out.println("\nInvalid Choice!");
			}
			break;
		case 3:
			System.out.println("\tSr no \t Item \t\t\tPrice");
			for (i = 0; i < m.getDesert().length; i++) {
				System.out.println("\n\t" + (i + 1) + ">\t" + m.getDesert()[i] + "\t" + m.getDesertPrice()[i]);
			}
			System.out.println("\n\t" + (i + 1) + ">\tBack");
			System.out.println("Enter your choice:");
			o = sc.nextInt();
			if (o == (i + 1))
				return;
			else {
				System.out.println("Quantity of the Desert:");
				int qty = sc.nextInt();
				order[j] = m.getDesert()[o - 1];
				orderPrice[j] = m.getDesertPrice()[o - 1];
				orderQty[j] = qty;
				total = total + (orderPrice[j] * orderQty[j]);
			}
			break;
		default:
			System.out.println("Invalid choice!");
		}
		orderq[j] = (orderPrice[j] * orderQty[j]);
		j++;
		float cgst = (total * 0.06f), sgst = (total * 0.06f);
		float final_tot = total + cgst + sgst;
		m = new Menu(orderQty, order, orderPrice, orderq, total, cgst, sgst, final_tot);
	}

	public void printbill() {
		System.out.println("\n\n-------------------------- Your Bill --------------------------------");
		System.out.println("\nDish \t\t\tPrice\t Quantity\t Total");
		for (int i = 0; i < j; i++) {
			System.out.println("\n" + m.getOrder()[i] + "\t" + m.getOrderprice()[i] + "\t\t" + m.getOrderQty()[i] + "\t"
					+ m.getOrderp()[i]);
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Total:" + m.getTotal());
		System.out.println("Csgt: " + m.getCgst());
		System.out.println("Sgst:" + m.getSgst());
		System.out.println("Your Final total:" + m.getFinal_tot());
	}
}
