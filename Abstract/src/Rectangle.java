
public class Rectangle extends Shape{
	private double l,b;
	private double area;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public void findArea() {
		area=l*b;
		
	}

	@Override
	public String toString() {
		return "Rectangle [area=" + area + "]";
	}

}
