package bank.pack;

public class Bankinfo {

	public void create(int accno, String name, double accbal, int age) throws Exception{
		try {
			try {
				if(age<17) {
					throw new InvalidAge(age);
				}
			}finally {
				
			}
			if(accbal<1000) {
				throw new InvalidAccBal(accbal);
			}
		}catch (InvalidAccBal |InvalidAge e) {
			throw e;
		}
		
	}

}
