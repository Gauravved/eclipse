import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many prime numbers do you want to enter:");
		int num=sc.nextInt();
		int n=2;
		for(int i=0;i<num;) {
			int j=2;
			while(j<n) {
				if(n%j==0 ) {
					break;
				}
				else
					j++;
			}
			if(j==n) {
				System.out.println(+n);
				i++;
			}
			n++;
		}
	}
}
