
public class Exception {
	public static void main(String args[]) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int ans = n1 / n2;
			System.out.println("The answer of the division is :" + ans);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException  | NumberFormatException ex) {
			System.out.println("An exception has occured!! : "+ex);
		}catch(Throwable ex) {
			System.out.println("Some other exceptions:"+ex);
		}
		finally {
			System.out.println("This is the finally block");
		}
	}
}
