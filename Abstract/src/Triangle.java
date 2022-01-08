
public class Triangle extends Shape{
	private double b,h;
	private double area;

	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}
	@Override
	public void findArea() {
		area=0.5*b*h;
	}
	@Override
	public String toString() {
		return "Area of Triangle is:"+area;
	}
	
}
