
public class SuzukiCars implements Automobile {
	private String model;
	private String color;
	private double price;

	private String status = "Available";

	public SuzukiCars(String model, String color, double price) {
		this.model = model;
		this.color = color;
		this.price = price;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SuzukiCars model=" + model + ", color=" + color + ", price=" + price+ ", status=" + status;
	}
}
