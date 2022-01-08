import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Array1 ar=new Array1();
		Array2 arr=null;
		int ch=0;
		do {
			System.out.println("\n--------------------------------------- Menu----------------------------------------");
			System.out.println("\n1> Create \n2> Display \n3> Search \n4>Insert \n5> Delete \n6> Sort \n7> Exit \nEnter you choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				arr=ar.create();
			break;
			case 2:
				ar.display(arr);
			break;
			case 3:
				System.out.println("Enter the number you want to search:");
				int s=sc.nextInt();
				int n=ar.search(s);
				if(s==arr.getArr()[n]) {
					System.out.println("The element is at "+(n+1)+" Position ");
				}
				else {
					System.out.println("The element is not in the array!!");
				}
			break;
			case 4:
				System.out.println("Enter the number you want to enter in array and its position:");
				int num=sc.nextInt();
				int pos=sc.nextInt();
				arr=ar.insert(num,pos);
				ar.display(arr);
			break;
			case 5:
				System.out.println("Enter the number you want to delete:");
				int del=sc.nextInt();
				arr=ar.delete(del);
				ar.display(arr);
			break;
			case 6:
				ar.sort(arr);
				ar.display(arr);
			break;
			case 7: break;
			default: System.out.println("Invalid choice!!");
			}
		}while(ch!=7);
	}

}
