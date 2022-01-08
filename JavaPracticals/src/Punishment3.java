import java.util.*;
class Marks{
	protected int s1,s2,s3,s4,s5;
	public void getdata(int s1,int s2,int s3,int s4,int s5) {
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		this.s5=s5;
	}
}
class Percent extends Marks{
	protected int total;
	protected float percent;
	public void calculate() {
		total=s1+s2+s3+s4+s5;
		percent=(total*100)/500;
		System.out.println("Marks of Subject 1:"+s1);
		System.out.println("Marks of Subject 1:"+s2);
		System.out.println("Marks of Subject 1:"+s3);
		System.out.println("Marks of Subject 1:"+s4);
		System.out.println("Marks of Subject 1:"+s5);
		System.out.println("Total marks"+total);
		System.out.println("Percentage:"+percent);
	}
}
class Grade extends Percent{
	private String grades;
	public void grading() {
		if(percent<100 && percent >=90) {
			System.out.println("Your grade is: Merit");
			grades="Merit";
		}
		else if(percent<90 && percent >=80) {
			grades="Distinction";
		}
		else if(percent<80 && percent >70) {
			grades="First Class";
		}
		else if(percent<70 && percent >50) {
			grades="Second Class";
		}
		else if(percent< 60 && percent >=40) {
			grades="Third Class";
		}
		else if(percent<40 &&  percent >35) {
			grades="Pass";
		}
		else {
			grades="FAIL";
		}
		System.out.println("Your Grade is:"+grades);
	}
}
public class Punishment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grade grd=new Grade();
		System.out.println("Enter the marks of 5 Subjects:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		grd.getdata(s1, s2, s3, s4, s5);
		grd.calculate();
		grd.grading();
	}

}
