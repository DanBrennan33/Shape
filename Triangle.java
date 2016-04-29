package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 * Triangle Class.
 * 
 */

public class Triangle extends Shape {
	double a = 0;
	double b = 0;
	double c = 0;
	
	public Triangle(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	@Override
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		double temp = (a + b + c) / 2;
		return Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
	}
	
	@Override
	public String toString() {
		return "Triangle a: " + a + ", b: " + b + ", c: " + c;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(c);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		return true;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	
}
