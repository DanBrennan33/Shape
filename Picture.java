package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114
 * Assignment 2 - part C
 * Picture Class
 */


public class Picture extends Shape {
	
	public Picture(Shape[] picture) {
		if(picture.length == 1) {
			Perimeter triangle = (x, y, z) -> x + y + z;
			System.out.println("Lambda Trtiangle Perimeter: " + triangle.sum(3, 5, 7));
			for (Shape pic : picture) {
				perimeter += pic.getPerimeter();
				area += pic.getArea();
			}
		} else {
			for (Shape pic : picture) {
				perimeter += pic.getPerimeter();
				area += pic.getArea();
			}
		}
	}

	interface Perimeter {
		 double sum(double a, double b, double c);
	}
	
	
	@Override
	public String toString() {
		return "Picture Area: " + area + ", Perimeter: " + perimeter;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return perimeter;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return area;
	}
	
	public static void main(String[] args) {
		Shape[] picture = { new Circle(3), 
				            new Triangle(3, 5, 7), 
				            new Rectangle(12, 3), 
				            new Circle(5), 
				            new Parallelogram(3, 5, 1), 
				            new Triangle(3, 5, 6) };
		Picture pic = new Picture(picture);
		System.out.println(pic);
		
		System.out.println();
		
		Shape[] tri = {new Triangle(3, 5, 7)};
		Picture test = new Picture(tri);
		System.out.println(test);
	}

}