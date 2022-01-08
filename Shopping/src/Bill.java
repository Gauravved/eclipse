
public class Bill {
	private Customer cust;
	private Product pro[];
	private Address addr;
	private float cgst,sgst;
	private double tot,final_tot;
	public Bill(Customer cust, Product[] pro, Address addr, float cgst, float sgst, double tot, double final_tot) {
		this.cust = cust;
		this.pro = pro;
		this.addr = addr;
		this.cgst = cgst;
		this.sgst = sgst;
		this.tot = tot;
		this.final_tot = final_tot;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Product[] getPro() {
		return pro;
	}
	public void setPro(Product[] pro) {
		this.pro = pro;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public float getCgst() {
		return cgst;
	}
	public void setCgst(float cgst) {
		this.cgst = cgst;
	}
	public float getSgst() {
		return sgst;
	}
	public void setSgst(float sgst) {
		this.sgst = sgst;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public double getFinal_tot() {
		return final_tot;
	}
	public void setFinal_tot(double final_tot) {
		this.final_tot = final_tot;
	}
	
}
