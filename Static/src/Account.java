import static java.lang.System.out;
public class Account {
	int accBal;
	static int ifsc;
	static {
		out.println("This is the static block\n");
	}
	{
		out.println("This is the default block\n");
	}
	public static void display(){
		Account aac=new Account();
		System.out.println("\nThis is the static func!!\n");
	    out.println("This is account balance:"+aac.accBal);
		out.println("This is the ifsc code:"+ifsc);
	}
	public void show() {
		out.println("\nThis is normal func\n");
	    out.println("This is account balance:"+accBal);
		out.println("This is the ifsc code:"+ifsc);
	}
}
