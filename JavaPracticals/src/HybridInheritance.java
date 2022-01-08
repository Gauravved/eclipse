import java.util.*;
class A{
	public void displayA() {
		System.out.println("This is the Display method of A class");
	}
}
class B extends A{
	public void show() {
		System.out.println("This is the show class of B");
	}
	public void displayB() {
		System.out.println("This the DisplayB method");
	}
}
class C extends A{
	protected void show() {
		System.out.println("This is the show class of C");
	}
	protected void displayc() {
		System.out.println("This the Displayc method");
	}
}
class D extends C{
	public void show() {
		System.out.println("This is the show method of D class");

	}
	public void displayD() {
		System.out.println("This is the display D method");
	}
}
public class HybridInheritance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		D d=new D();
		d.displayA();
		d.displayc();
		d.displayD();
		d.show();
		B b=new B();
		b.displayB();
		b.show();
	}
}
