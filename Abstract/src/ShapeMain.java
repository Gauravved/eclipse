import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many objects do you want to make:");
		int n = sc.nextInt();
		Shape s[] = new Shape[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = create();
			s[i].findArea();
		}
		display(s);
	}

	public static Shape create() {
		Shape s = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1> Circle \n2> Triangle \n3> Rectangle \nEnter your choice");
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("Enter the radius:");
			double r = sc.nextDouble();
			s = new Circle(r);
		} else if (ch == 2) {
			System.out.println("Enter base and height:");
			double b = sc.nextDouble();
			double h = sc.nextDouble();
			s = new Triangle(b, h);
		} else if (ch == 3) {
			System.out.println("Enter length and breadth of the rectangle:");
			double l = sc.nextDouble();
			double b = sc.nextDouble();
			s = new Rectangle(l, b);
		}
		return s;
	}

	public static void display(Shape sarr[]) {
		for (Shape s : sarr) {
			if (s instanceof Circle) {
				System.out.println(s);
			} else if (s instanceof Triangle) {
				System.out.println(s);

			} else if (s instanceof Rectangle) {
				System.out.println(s);
			}
		}

	}
}
