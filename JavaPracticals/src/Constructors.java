import java.util.*;
public class Constructors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Example ex= new Example();
		System.out.println("Enter 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ex=new Example(a,b);
		ex.addition();
	}

}
class Example{
	private int a,b,add;
	public Example(){
		System.out.println("This is the default constructor of the Example class");
	}
	public Example(int a, int b) {
		System.out.println("This the Parametric Constructor of the Example class");
		this.a = a;
		this.b = b;
	}
	public void addition() {
		add=a+b;
		System.out.println("The addition of the 2 numbers is:"+add);
	}
}
