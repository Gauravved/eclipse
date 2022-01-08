package bank.pack;

public class InvalidAge extends Exception{
	private int age;

	public InvalidAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Your age is less than 18. Hence you are minor yet";
	}
	
}