package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 * Circle Class. 
 *  
 */


public class Circle extends Shape {
	double radius = 0;
	
	public Circle(double r) {
		radius = r;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	@Override
	public String toString() {
		return "Circle radius: " + radius;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}