
public class Suzuki implements Bike {

	private String model;
	private String color;
	private double price;
	private int CC;
	private String status = "Available";

	public Suzuki(String model, String color, double price, int CC) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.CC = CC;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getcolor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int getCC() {
		return CC;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Suzuki model=" + model + ", color=" + color + ", price=" + price + ", CC=" + CC+ ", status=" + status;
	}

}
