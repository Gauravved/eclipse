import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Radius of sphere to find out its Volume:");
			float r=sc.nextFloat();
			final float pi=3.14f;
			float volume=4*pi*r*r*r/3;
			System.out.println("The Volume of the sphere is: "+volume+" whose radius is :"+r);
	}

}
