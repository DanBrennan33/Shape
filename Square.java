package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 * Square Class.
 * 
 */

public class Square extends Shape {
	double length = 0;
	
	public Square(double l) {
		length = l;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * length;
	}
	
	@Override
	public String toString() {
		return "Square length: " + length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(length);
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
		Square other = (Square) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
