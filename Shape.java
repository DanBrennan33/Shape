package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 * Shape Abstract Class. 
 *  
 */

public abstract class Shape  {
	double area = 0;
	double perimeter = 0;
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "Shape [area: " + area + ", perimeter: " + perimeter + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(perimeter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (Double.doubleToLongBits(perimeter) != Double.doubleToLongBits(other.perimeter))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
