import java.util.*;

public class String_Buffercls {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		StringBuffer str1=new StringBuffer();
		int ch;
		System.out.println("Enter a String:");
		str.append(sc.next());
		do {
			System.out.println("1> Append \n2> Insert \n3> Replace \n4> Delete \n5> Reverse \n6> Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter  a String:");
				str1.append(sc.next());
				System.out.println("The String after concatination is:"+str.append(str1));
				break;
			case 2:
				System.out.println("Enter a String you want to insert and then the index at which you want to insert String:");
				String s=sc.next();
				int n=sc.nextInt();
				System.out.println("The String is:"+str.insert(n, s));
				break;
			case 3:
				System.out.println("Enter Start index and end index and String with which you want to replace:");
				int start=sc.nextInt();
				int end=sc.nextInt();
				s=sc.next();
				System.out.println("The string after replacing is:"+str.replace(start, end, s));
				break;
			case 4:
				System.out.println("Enter Start and end index:");
				start=sc.nextInt();
				end=sc.nextInt();
				System.out.println("The string after deleting:"+str.delete(start, end));
				break;
			case 5:
				System.out.println("String after reversing:"+str.reverse());
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid choice!!");
			}
		}while(ch!=6);
	}

}
