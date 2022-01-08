import java.util.Scanner;

public class Parent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\n1> Area \n2> Logic \n3> Exit \nEnter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				area a = new area();
				System.out.println(
						"\t1> Area of circle \n\t2> Area of triangle \n\t3> Area of rectangle \nEnter your choice:");
				int ch1 = sc.nextInt();
				switch (ch1) {
				case 1:
					System.out.println("Enter the radius of the circle:");
					float r = sc.nextFloat();
					System.out.println("The area of the circle is:" + a.Areacircle(r));
					break;
				case 2:
					System.out.println("Enter the base and height:");
					float b = sc.nextFloat();
					float h = sc.nextFloat();
					System.out.println("The area of the triangle is:" + a.Areatriangle(b, h));
					break;
				case 3:
					System.out.println("Enter the breadth and height of thr rectangle;");
					b = sc.nextFloat();
					float l = sc.nextFloat();
					System.out.println("The area of the rectangle is:" + a.areavRect(b, l));
				}
				break;
			case 2:
				Logic l = new Logic();
				System.out.println(
						"1> Factor \n2> Factorial \n3> Prime \n4> Fibonacci \n5> Power \n6> Perfect number \n7> Reverse number \n8> Sum of digit \n9> Armstrong number \n10> Palindrome \n11> Exit \nEnter your choice:");
				int ch2 = sc.nextInt();
				int n;
				switch (ch2) {
				case 1:
					System.out.println("Enter the number to get the factor of the number:");
					n = sc.nextInt();
					l.factor(n);
					break;
				case 2:
					System.out.println("Enter the number to get the factorial number:");
					n = sc.nextInt();
					System.out.println("The factorial number is:" + l.factorial(n));
					break;
				case 3:
					System.out.println("Enter the to check if it is prime number:");
					n = sc.nextInt();
					boolean b = l.prime(n);
					if (b) {
						System.out.println("The number is prime number");
					} else
						System.out.println("The number is not prime number");
					break;
				case 4:
					System.out.println("The length of the fibonacci series:");
					n = sc.nextInt();
					l.fibocnacci(n);
					break;
				case 5:
					System.out.println("Enter the base and its power:");
					n = sc.nextInt();
					int p = sc.nextInt();
					System.out.println("The power of " + p + " to the base " + n + " is :" + l.power(n, p));
					break;
				case 6:
					System.out.println("Enter the number to check if it is perfect number:");
					n = sc.nextInt();
					b = l.perfect(n);
					if (b) {
						System.out.println("The number is perfect number");
					} else
						System.out.println("The number is not perfect number");
					break;
				case 7:
					System.out.println("Enter the number to reverse it:");
					n = sc.nextInt();
					System.out.println("The reverse number is:" + l.reverse(n));
					break;
				case 8:
					System.out.println("Enter the number to get the sum of its all numbers:");
					n = sc.nextInt();
					System.out.println("The sum of the digits is:" + l.sumofdigits(n));
					break;
				case 9:
					System.out.println("Enter the number to see if it is armstrong number:");
					n = sc.nextInt();
					b = l.armstrong(n);
					if (b) {
						System.out.println("The number is armstrong number");
					} else
						System.out.println("The number is not armstrong number");
					break;
				case 10:
					System.out.println("Enter the number to see whether it is palindrime or not:");
					n = sc.nextInt();
					b = l.palindrome(n);
					if (b) {
						System.out.println("The number is palindrome number");
					} else
						System.out.println("The number is not palindrome number");
				}
			}
		} while (ch != 3);
	}

}
