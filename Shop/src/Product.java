
public class Product {
	private int productId;
	private String productName;
	private int qty;
	private double price,total,cgst,sgst,final_total;
	
	public Product(int productId, String productName, int qty, double price, double total, double cgst, double sgst,
			double final_total) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.final_total = final_total;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinal_total() {
		return final_total;
	}
	public void setFinal_total(double final_total) {
		this.final_total = final_total;
	}
	
	
}
