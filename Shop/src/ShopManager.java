import java.util.Scanner;
public class ShopManager {
	Scanner sc=new Scanner(System.in);
	public Product[] create() {
		System.out.println("How many products do you want to enter?:");
		int n=sc.nextInt();
		Product pro[]=new Product[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of Product "+(i+1));
			System.out.println("\nEnter the product id:");
			int id=sc.nextInt();
			System.out.println("Enter product name:");
			String name=sc.next();
			for(int j=name.length();j<10;j++) {
				char ch=' ';
				name=name.substring(0, name.length())+ch;
			}
			System.out.println("Enter the Quantity of the Product:");
			int qty=sc.nextInt();
			System.out.println("Enter the price of the  product:");
			double price=sc.nextDouble();
			double total=(price*qty),cgst=6.0,sgst=cgst;
			double final_total=((12*total)/100)+total;
			System.out.println(final_total);
			pro[i]=new Product(id,name,qty,price,total,cgst,sgst,final_total);
		}
		pro=sort(pro);
		return pro;
	}
	public void display(Product pro[]) {
		double final_t=0;
		System.out.println("\nProduct Id \tProduct Name \tQuantity \tPrice \t\tTotal \t\tCgst \t\tSgst \t\tFinal\n");
		for(int i=0;i<pro.length;i++) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------\n");
			System.out.println(pro[i].getProductId()+"\t\t"+pro[i].getProductName()+"\t"+pro[i].getQty()+"\t\t"+pro[i].getPrice()+"\t\t"+pro[i].getTotal()+"\t\t"+pro[i].getCgst()+"\t\t"+pro[i].getSgst()+"\t\t"+pro[i].getFinal_total());
			final_t=final_t+pro[i].getFinal_total();
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Your bill is: "+final_t);
	}
	public void search(Product p[],int n) {
		boolean b=false;
		for(int i=0;i<p.length;i++) {
			if(p[i].getProductId()==n) {
				b=true;
				System.out.println("\nProduct Id \tProduct Name \t\tQuantity \tPrice \tTotal \tCgst \tSgst \tFinal\n");
				System.out.println("----------------------------------------------------------------------------------------------------------\n");
				System.out.println(p[i].getProductId()+"\t"+p[i].getProductName()+"\t"+p[i].getQty()+'\t'+p[i].getPrice()+"\t"+p[i].getTotal()+"\t"+p[i].getCgst()+"\t"+p[i].getSgst()+"\t"+p[i].getFinal_total());
			}
		}
		if(!b) {
			System.out.println("Product not found !!!!");
		}
	}
	public Product[] sort(Product p[]) {
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p.length-1;j++) {
				if(p[j].getQty() < p[j+1].getQty()) {
					Product pro=p[j];
					p[j]=p[j+1];
					p[j+1]=pro;
				}
			}
		}
		return p;
	}
}
