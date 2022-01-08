import java.util.*;
class Operations{
	public int operator() {
		return 0;
	}
}
class Add extends Operations{
	private int a,b;
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int operator() {
		return a+b;
	}
}
class Subtract extends Operations{
	private int a,b;
	public Subtract(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int operator() {
		return a-b;
	}
}
class Multiply extends Operations{
	private int a,b;
	public Multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int operator() {
		return a*b;
	}
}
public class MethodOverriding {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Ennter 2 number:");
		a=sc.nextInt();
		b=sc.nextInt();
		Add ad=new Add(a,b);
		System.out.println("Addition of the numbers is:"+ad.operator());
		Subtract sub=new Subtract(a, b);
		System.out.println("Subtraction of the numbers is:"+sub.operator());
		Multiply mul=new Multiply(a, b);
		System.out.println("Multiplicatio of the 2 numbers is :"+mul.operator());
	}
}
