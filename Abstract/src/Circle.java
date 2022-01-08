
public class Circle extends Shape {
	
	private double r;
	private double area;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "The area of Cricle is:"+Math.round(area*100)/100.0;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		area=3.14*r*r;
	}
}
