import java.util.*;
class String_class{
	protected String str1;
	protected String str2;
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
}
class String_OP extends String_class{
	protected String con,low,upper;
	protected boolean b=false;
	public void operations(){
		con=str1.concat(str2);
		b=str1.equals(str2);
		low=str1.toLowerCase();
		upper=str1.toUpperCase();
	}
}
class Displays extends String_OP{
	public void show() {
		System.out.println("The String after concatination is:"+con);
		System.out.println("Result of comparision:"+b);
		System.out.println("Lower case of First String:"+low);
		System.out.println("Upper case of First String:"+upper);
	}
}
public class Punishment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Strings:");
		String str1=sc.next();
		String str2=sc.next();
		Displays dis=new Displays();
		dis.setStr1(str1);
		dis.setStr2(str2);
		dis.operations();
		dis.show();
	}

}
