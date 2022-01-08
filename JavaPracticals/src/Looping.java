import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		//do while loop to continue switch statement 
		do {
			System.out.println("1> Prime number \n2> Fibonacci series 3> Exit\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1://logic for prime number
				System.out.println("Enter the number");
				int num=sc.nextInt();
				boolean b=false;
				for(int i=2;i<=num/2;i++) {
					if(num%i==0) {
						System.out.println(num+" is not prime number.");
						b=true;
						break;
					}
				}
				if(!b) {
					System.out.println(num+" is prime number");
				}
				break;
			case 2://logic for fibonacci series
				System.out.println("How  many numbers do you want in Fibonacci series:");
				num=sc.nextInt();
				int n1=0,n2=1,next;
				System.out.println("Fibonacci series is: "+n1+n2);
				int i=1;
				while(i<num) {
					next=n1+n2;
					System.out.println(next);
					n2=next;
					n1=n2;
				}
			}
		}while(ch==3);

	}

}
