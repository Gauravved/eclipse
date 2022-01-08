
public class Customer {
	private int custId;
	private String custName;
	private String custMob;
	private Product prod[];
	private Address addr;

	public Customer(int custId, String custName, String custMob, Product[] prod, Address addr) {
		this.custId = custId;
		this.custName = custName;
		this.custMob = custMob;
		this.prod = prod;
		this.addr = addr;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMob() {
		return custMob;
	}

	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}

	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product[] prod) {
		this.prod = prod;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
}
