package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 *  
 */

public class Rectangle extends Shape {
	double length = 0;
	double width = 0;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}
	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle length: " + length + ", width: " + width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}