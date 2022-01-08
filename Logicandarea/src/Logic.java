
public class Logic {
	public void factor(int n) {
		System.out.println("The factors of "+n+" are:");
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	public int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
	public boolean prime(int n) {
		boolean b=true;
		int i=2;
		while(i<n) {
			if(n%i==0) {
				b=false;
				break;
			}
			else 
				b=true;
			i++;
		}
		return b;
	}
	public int reverse(int n) {
		int rem,rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public boolean perfect(int n) {
		int ans=0;
		boolean b;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				ans=ans+i;
			}
		}
		if(ans==n) {
			b=true;
		}
		else
			b=false;
		return b;
	}
	public boolean armstrong(int n) {
		int sum=0,rem,ans=n;
		boolean b;
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==ans) {
			b=true;
		}
		else
			b=false;
		return b;
	}
	public void fibocnacci(int n) {
		int n1=0,n2=1,n3;
		System.out.println("The Fibonacci series is:");
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	public int sumofdigits(int n) {
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public int power(int n,int p) {
		int an=n;
		for(int i=1;i<p;i++) {
			an*=n;
		}
		return an;
	}
	public boolean palindrome(int n) {
		Logic l=new Logic();
		int ans=n;
		boolean b;
		if(ans==l.reverse(n)) {
			b=true;
		}
		else {
			b=false;
		}
		return b;
	}
	
}
