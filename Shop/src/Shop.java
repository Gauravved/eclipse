import java.util.*;
public class Shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShopManager shop=new ShopManager();
		Product p[]=null;
		int ch;
		do {
			System.out.println("\n\n1> Add products \n2> Display list \n3> Search \n4> Exit \nEnter you choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				p=shop.create();
			break;
			case 2:
				shop.display(p);
			break;
			case 3:
				System.out.println("Enter the product Id to search it:");
				shop.search(p, sc.nextInt());
			break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice!!!");
			}
		}while(ch!=4);

	}

}
