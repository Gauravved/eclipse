import java.util.Scanner;

public class ShopMain {
	public static void main(String[] args) {
		Customer cust = Create();
		Bill b = Display(cust);
		PrintBill(b);
	}

	public static Customer Create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name = sc.next();
		System.out.println("Enter customer mobile number:");
		String mob = sc.next();
		System.out.println("Which city do you live in:");
		String city = sc.next();
		System.out.println("Which state the city comes in and enter pincode:");
		String state = sc.next();
		long pincode = sc.nextLong();
		Address addr = new Address(city, state, pincode);
		System.out.println("How many product would you link to buy? :");
		int n = sc.nextInt();
		Product prod[] = new Product[n];
		for (int i = 0; i < prod.length; i++) {
			System.out.println("Ente the product id of Product "+(i+1)+":");
			int id = sc.nextInt();
			System.out.println("Enter Product name of Product "+(i+1)+":");
			String na = sc.next();
			for (int j = na.length() + 1; j < 10; j++) {
				char ch = ' ';
				na = na.substring(0, na.length()) + ch;
			}
			System.out.println("Enter the price and then quantity:");
			prod[i] = new Product(id, na, sc.nextDouble(), sc.nextInt());
		}
		Customer cust = new Customer(1, name, mob, prod, addr);
		return cust;
	}

	public static Bill Display(Customer cust) {
		double total=0;
		System.out.println(
				"---------------------------------------- Customer Detail------------------------------------");
		System.out.println("Customer Id:" + cust.getCustId());
		System.out.println("Customer name:" + cust.getCustName());
		System.out.println("Mobile number:" + cust.getCustMob());
		System.out.println("City:" + cust.getAddr().getCity());
		System.out.println("State:" + cust.getAddr().getState());
		System.out.println("Pincode:" + cust.getAddr().getPincode());
		System.out.println("\nProduct Id \tProduct Name \tPrice \tQuantity");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < cust.getProd().length; i++) {
			System.out.println(cust.getProd()[i].getProdId() + "\t\t" + cust.getProd()[i].getProdName() + "\t"
					+ cust.getProd()[i].getProdPrice() + "\t\t" + cust.getProd()[i].getProdQty());
			System.out.println("----------------------------------------------------------------");
			total+=cust.getProd()[i].getTotal();
		}
		float cgst=(float)total*0.06f;
		float sgst=cgst;
		double final_tot=(cgst+sgst+total);
		Bill bil = new Bill(cust, cust.getProd(), cust.getAddr(), cgst, sgst, total, final_tot);
		return bil;
	}
	public static void PrintBill(Bill b) {
		System.out.println("\nTotal: "+Math.round(b.getTot()*100.0)/100.0);
		System.out.println("\nCgst: "+Math.round(b.getCgst()*100.0)/100.0);
		System.out.println("\nSgst: "+Math.round(b.getSgst()*100.0)/100.0);
		System.out.println("\nFinal Total: "+Math.round(b.getFinal_tot()*100.0)/100.0);		
	}
}
