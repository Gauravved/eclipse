
public class Bankacc {
	private int accNo;
	private String accHolder;
	private double accBal;
	public Bankacc(int accNo, String accHolder, double accBal) {
		this.accNo = accNo;
		for(int i=accHolder.length();i<=10;i++) {
			char ch=' ';
			accHolder=accHolder.substring(0,i)+ch;
		}
		this.accHolder = accHolder;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
}
