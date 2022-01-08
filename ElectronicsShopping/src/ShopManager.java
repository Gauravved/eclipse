import java.util.*;

import excetpions.bank.*;
public class ShopManager {
	Scanner sc = new Scanner(System.in);
	public Customer create() {
		Products pr = new Products();
		Exceptions ex=new Exceptions();
		Customer cust = null;
		System.out.println("Enter username:");
		String user = sc.next();
		System.out.println("Enter password:");
		String pass = sc.next();
		System.out.println("Enter Phone number:");
		String phn = sc.next();
		boolean bb = true;
		do {
			try {
				ex.mobile(phn);
				bb = false;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Re-Enter your mobile number:");
				phn = sc.next();
				bb = true;
			}
		} while (bb == true);
		System.out.println("Enter address:");
		sc.nextLine();
		String adrs = sc.nextLine();
		Vector<String> brand = new Vector<>();
		Vector<Long> price = new Vector<>();
		Vector<Integer> id = new Vector<>();
		Vector<Integer> qty = new Vector<>();
		int ch = 0;
		do {
			System.out.println("\n\n\n\t\t\t Hello "+user+" Welcome to Electronic city ");
			System.out.println(
					"\n1> Phone \n2> Television \n3> Refrigerator \n4> Display cart \n5> Search item in cart \n6> Proceed to payment");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i = 0; i < 5; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				int ids = sc.nextInt();
				for (int j = 0; j < 5; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i = 5; i < 10; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 5; j < 10; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 3: 
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price");
				for (int i =10; i < 15; i++) {
					System.out.println("\n--------------------------------------------------------------------------------\n");
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n--------------------------------------------------------------------------------\n");
				System.out.println("6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 10; j < 15; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case  4:
				cust=new Customer(user, pass, brand, price, id, qty);
				display(cust);
				break;
			case 5:
				cust=new Customer(user, pass, brand, price, id, qty);
				System.out.println("Enter product id to search in your cart:");
				int srch=sc.nextInt();
				search(cust,srch);
			}
		} while (ch != 6);
		
		cust=new Customer(user, pass, brand, price, id, qty);
		String ch1="n";
		boolean bool=false;
		if(cust.getBrand().isEmpty()) {
			System.out.println("You cart is Empty!!");
			System.out.println("Thank you visit again");
			bool=false;
		}
		else {
			do{
				bool=true;
				if(cust.getBrand().isEmpty()) {
					System.out.println("You cart is Empty!!");
					System.out.println("Thank you visit again");
					bool=false;
					break;
				}
				display(cust);
				System.out.println("Do you want to change quantity of any product? [y/n]:");
				String ch2=sc.next();
				if(ch2.equals("Y")||ch2.equals("y")) {
					System.out.println("Enter the product id:");
					int se=sc.nextInt();
					boolean b=false;
					for(int i=0;i<cust.getBrand().size();i++) {
						if(cust.getId().get(i)==se) {
							b=true;
							System.out.println("\t\t1> Completely remove the item \n\t\t2> Reduce quantity be 1 \n\t\t3> Increase quantity be 1");
							System.out.println("Enter your choice:");
							int choice=sc.nextInt();
							switch(choice) {
							case 1:
								cust.getBrand().remove(i);
								cust.getId().remove(i);
								cust.getQty().remove(i);
								cust.getPrice().remove(i);
								cust.getTotal().remove(i);
								break;
							case 2:
								cust.getQty().set(i, cust.getQty().get(i)-1);
								cust.getTotal().set(i, cust.getTotal().get(i)-cust.getPrice().get(i));
								if(cust.getQty().get(i)==0) {
									cust.getBrand().remove(i);
									cust.getId().remove(i);
									cust.getQty().remove(i);
									cust.getPrice().remove(i);
									cust.getTotal().remove(i);
								}
								break;
							case 3:
								cust.getQty().set(i, cust.getQty().get(i)+1);
								cust.getTotal().set(i, cust.getTotal().get(i)+cust.getPrice().get(i));
								break;
							}
						}
					}
					if(!b) {
						System.out.println("This Product is not present in your cart!!!!");
					}
				}
				display(cust);
				System.out.println("Do you want to finalise the list? [y/n] :");
				ch1=sc.next();
			}while(ch1.equals("N")||ch1.equals("n"));
		}
		Payment();
		return cust;
	}
	
	public void Payment() {
		int choose,bank;
		String card,otp;
		System.out.println("\nPayment Options:\n\t1> Online payment \n\t2> Cash on delivery \nChoose your payment method:");
		choose=sc.nextInt();
		switch(choose)
		{
			case 1:
				System.out.println("\n\n1> State Bank of India \n2> Bank of Baroda \n3> Punjab National Bank \n4> Bank of India \n5> Canara Bank \n6> Union Bank of India \n7> IDBI Bank \n8> Indian Bank \n9> Central Bank of India \n10> Syndicate Bank \n11> Axis Bank \nChoose the Bank for Payment:");
				bank=sc.nextInt();
				System.out.println("\nEnter your 12 Digit Debit Card Number:");
				card=sc.next();
		    	while(card.length()!=12)
				{
	       			System.out.println("Incorrect Debit card number!!");
					System.out.println("\nRe-Enter the Debit card Number:");
					card=sc.next();
				}
		    	
				System.out.println("Enter the sent OTP sent to your rgistered mobile number :");
				otp=sc.next();
				System.out.print("Processing");
				for(int i=0;i<3;i++)
				{
					System.out.print(".");
					try {
						Thread.sleep(1000);	
					}catch(Exception e) {
						System.out.println(e);
					}
				}
				System.out.println("\nTransaction Done. You order will arrive in 1-2 Weeks");
				break;
			case 2:
				System.out.println("You have choosen Cash on delivery. Your order will arrive in 1- 2 Weeks");
				break;
			default:
				System.out.println("Choice a Valid Payment option");
		}
		
		
	}
	
	
	
	
	public void search(Customer cust,int srch) {
		boolean b=false;
		for(int i=0;i<cust.getBrand().size();i++) {
			if(srch==cust.getId().get(i)) {
				b=true;
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price  \tQuantity \t Cgst \t Sgst \t Total");
				System.out.println("\n----------------------------------------------------------------------------------------------------------------------\n");
				System.out.println(cust.getId().get(i) + " \t\t " + cust.getBrand().get(i) + " \t\t " + cust.getPrice().get(i)+"\t\t"+cust.getQty().get(i)+"\t\t"+cust.getCgst()+"\t"+cust.getSgst()+"\t"+cust.getTotal().get(i));	
			}
		}
		if(!b) {
			System.out.println("This product is not in your cart. Take a look on exclusive offers on the product!!");
		}
	}
	public void display(Customer cust) {
		double finalTotal=0;
		System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price  \tQuantity \t Cgst \t Sgst \t Total");
		for(int i=0;i<cust.getBrand().size();i++) {
			System.out.println("\n----------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(cust.getId().get(i) + " \t\t " + cust.getBrand().get(i) + " \t\t " + cust.getPrice().get(i)+"\t\t"+cust.getQty().get(i)+"\t\t"+cust.getCgst()+"\t"+cust.getSgst()+"\t"+cust.getTotal().get(i));		
			finalTotal=finalTotal+cust.getTotal().get(i);
		}
		cust.setFinaltotal(finalTotal);
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Final Total is:"+cust.getFinaltotal());
	}
}
