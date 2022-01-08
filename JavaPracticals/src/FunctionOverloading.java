import java.util.*;
public class FunctionOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operation op=new Operation();
		System.out.println("Enter 2 integer numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		op.add(a, b);
		System.out.println("Enter 2 Decimal numbers:");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		op.add(x, y);
	}

}

class Operation
{
	private int a,b;
	private int add;
	public void add(int a,int b) {
		this.a=a;
		this.b=b;
		add=a+b;
		System.out.println("The addition of the integers is:"+add);
	}
	public void add(float a,float b) {
		float x=a;
		float y=b;
		float ad=x+y;
		System.out.println("Addition of the Decimal numbers(Float datatype) is:"+ad);
	}
}