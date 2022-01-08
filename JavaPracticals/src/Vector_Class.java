import java.util.*;

public class Vector_Class {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		Vector<Integer> vec=new Vector<Integer>();
		int ch;
		do {
			System.out.println("\n1> Create/Add \2> Display \n3> Insert \n4> Delete \n5> Search \n6> Length \n7> Exit \nEnter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter a number:");
				vec.add(sc.nextInt());
				break;
			case 2:
				System.out.print("The elements in the vector are:");
				for(int i=0;i<vec.size();i++) {
					System.out.print(" "+vec.get(i));
				}
				break;
			case 3:
				System.out.println("Enter element to enter at index:");
				int num=sc.nextInt();
				int index=sc.nextInt();
				vec.insertElementAt(num, index);
				System.out.print("The elements are:");
				for(int i=0;i<vec.size();i++) {
					System.out.println(" "+vec.get(i));
				}
				break;
			case 4:
				System.out.println("Enter the index to delete:");
				index=sc.nextInt();
				vec.remove(index);
				System.out.print("The elements are:");
				for(int i=0;i<vec.size();i++) {
					System.out.println(" "+vec.get(i));
				}
				break;
			case 5:
				System.out.println("Enter the number to search:");
				int s=sc.nextInt();
				if(vec.contains(s)) {
					System.out.println("The number is present");
				}
				else {
					System.out.println("The number is not present");
				}
				break;
			case 6:
				System.out.println("The length of the vector is :"+vec.size());
				break;
			case 7:
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}while(ch!=7);
	}
}
