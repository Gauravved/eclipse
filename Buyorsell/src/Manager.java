import java.util.*;

public class Manager {
	Scanner sc = new Scanner(System.in);

	public Automobile create(LinkedList<Automobile> a, int ch3, int ch2) {
		Automobile auto = null;
		System.out.println("Enter the name of the model:");
		String model = sc.next();
		System.out.println("Enter the colour of your car:");
		String color = sc.next();
		System.out.println("Enter the desired amount you want from the vehicle:");
		double price = sc.nextDouble();
		if (ch2 == 1) {
			switch (ch3) {
			case 1:
				auto = new TATA(model, color, price);
				break;
			case 2:
				auto = new SuzukiCars(model, color, price);
				break;
			case 3:
				auto = new HondaCars(model, color, price);
				break;
			}
		} else if (ch2 == 2) {
			System.out.println("Enter the CC of your bike:");
			int cc = sc.nextInt();
			if (ch3 == 1) {
				auto = new Suzuki(model, color, price, cc);
			} else if (ch3 == 2) {
				auto = new Honda(model, color, price, cc);
			}
		}
		return auto;

	}

	public String display(LinkedList<Automobile> a, int ch3, int ch2) {
		int j = 1;
		for (int i = 0; i < a.size(); i++) {
			if (ch2 == 1 && ch3 == 1) {
				if (a.get(i) instanceof TATA) {
					System.out.print(j + "> ");
					System.out.println(a.get(i));
				}
				j++;
			} else if (ch2 == 1 && ch3 == 2) {
				if (a.get(i) instanceof SuzukiCars) {
					System.out.println(a.get(i));
				}
				j++;
			} else if (ch2 == 1 && ch3 == 3) {
				if (a.get(i) instanceof HondaCars) {
					System.out.println(a.get(i));
				}
				j++;
			} else if (ch2 == 2 && ch3 == 1) {
				if (a.get(i) instanceof Suzuki) {
					System.out.println(a.get(i));
				}
				j++;
			} else if (ch2 == 2 && ch3 == 2) {
				if (a.get(i) instanceof Honda) {
					System.out.println(a.get(i));
				}
				j++;
			}
		}
		System.out.println("Do you want to buy any of these? [y/n]:");
		String s=sc.next();
		if(s.equals("y")||s.equals("Y")) {
			buy(a, ch2, ch3);
		}
		return s;
	}

	public void buy(LinkedList<Automobile> a, int ch2, int ch3) {
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		System.out.println("Do you want to  \n1> Contact owner \n2> Buy car at the given amount \nEnter your choice:");
		int ch = sc.nextInt();
		if (ch == 1) {
			if (ch2 == 1 && ch3 == 1) {
				TATA t = (TATA) a.get(choice - 1);
				if(t.getStatus().equals("Reserved")) {
					System.out.println("This car is already reserved!!!");
				}
				else {
					t.setStatus("Reserved");
				}
			} else if (ch2 == 1 && ch3 == 21) {
				SuzukiCars s = (SuzukiCars) a.get(choice - 1);
				if(s.getStatus().equals("Reserved")) {
					System.out.println("This car is already reserved!!!");
				}
				else {
					s.setStatus("Reserved");
				}
			} else if (ch2 == 1 && ch3 == 3) {
				HondaCars s = (HondaCars) a.get(choice - 1);
				if(s.getStatus().equals("Reserved")) {
					System.out.println("This car is already reserved!!!");
				}
				else {
					s.setStatus("Reserved");
				}
			} else if (ch2 == 2 && ch3 == 1) {
				Suzuki t = (Suzuki) a.get(choice - 1);
				if(t.getStatus().equals("Reserved")) {
					System.out.println("This bike is already reserved!!!");
				}
				else {
					t.setStatus("Reserved");
				}
			} else if (ch2 == 2 && ch3 == 2) {
				Honda h = (Honda) a.get(choice - 1);
				if(h.getStatus().equals("Reserved")) {
					System.out.println("This bike is already reserved!!!");
				}
				else {
					h.setStatus("Reserved");
				}
			}
		} else if (ch == 2) {
			if (ch2 == 1 && ch3 == 1) {
				a.remove(a.get(choice - 1));
			} else if (ch2 == 1 && ch3 == 21) {
				a.remove(a.get(choice - 1));
			} else if (ch2 == 1 && ch3 == 3) {
				a.remove(a.get(choice - 1));
			} else if (ch2 == 2 && ch3 == 1) {
				a.remove(a.get(choice - 1));
			} else if (ch2 == 2 && ch3 == 2) {
				a.remove(a.get(choice - 1));
			}
		}

	}
}
