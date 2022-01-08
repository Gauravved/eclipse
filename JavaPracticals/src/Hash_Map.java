import java.util.*;

public class Hash_Map {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		HashMap<Integer, String> hash=new HashMap<Integer,String>();
		do {
			System.out.println("\n1> Create/Add \n2> Display \n3> Delete \n5> Length \n6> Exit \nEnter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter a roll number:");
				int roll=sc.nextInt();
				System.out.println("Enter name:");
				String name=sc.next();
				hash.put(roll, name);
				break;
			case 2:
				System.out.print("The elements in the HashMap are:");
				
				break;
			case 3:
				System.out.println("Enter the index to delete:");
				int index=sc.nextInt();
				hash.remove(index);
				System.out.print("The elements are:");
				for(int i=0;i<hash.size();i++) {
					System.out.println(" "+hash.get(i));
				}
				break;
			case 4:
				System.out.println("The length of the hashtor is :"+hash.size());
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}while(ch!=5);
	}

}
