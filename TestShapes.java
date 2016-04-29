package brennan4114;

/**
 * 
 * @author dtbrennan1 - 020 194 114 
 * Assignment 2 - Part c 
 * JUnit testing of Part C - Shape constructors, 
 * GetPerimeter, and GetArea() methods.
 *     
 */

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *  Class for testing cases
 */
public class TestShapes {
	Shape c = new Circle(5);
	Shape s = new Square(5);
	Shape r = new Rectangle(5, 10);
	Shape p = new Parallelogram(5, 10, 15);
	Shape t = new Triangle(3, 5, 7);
	
	/**
	 *  Test case for Circle class
	 */
	@Test
	public void testCircle() {
		assertEquals("Test Constructor for Circle: ", "Circle radius: 5.0", c.toString());
		assertEquals("Test Circle getArea(): ", "78.53981633974483", Double.toString(c.getArea()));
		assertEquals("Test Circle getPerimeter(): ", "31.41592653589793", Double.toString(c.getPerimeter()));
	}
	
	/**
	 *  Test case for Square class
	 */
	@Test
	public void testSquare() {
		assertEquals("Test Constructor for Square: ", "Square length: 5.0", s.toString());
		assertEquals("Test Square getArea(): ", "25.0", Double.toString(s.getArea()));
		assertEquals("Test Square getPerimeter(): ", "20.0", Double.toString(s.getPerimeter()));
	}
	
	/**
	 *  Test case for Rectangle class
	 */
	@Test
	public void testRectangle() {
		assertEquals("Test Constructor for Rectangle: ", "Rectangle length: 5.0, width: 10.0", r.toString());
		assertEquals("Test Rectangle getArea(): ", "50.0", Double.toString(r.getArea()));
		assertEquals("Test Rectangle getPerimeter(): ", "30.0", Double.toString(r.getPerimeter()));
	}
	
	/**
	 *  Test case for PArallelogram class
	 */
	@Test
	public void testParallelogram() {
		assertEquals("Test Constructor for Parallelogram: ", "Parallelogram length: 5.0, width: 10.0, height: 15.0", p.toString());
		assertEquals("Test Parallelogram getArea(): ", "75.0", Double.toString(p.getArea()));
		assertEquals("Test Parallelogram getPerimeter(): ", "30.0", Double.toString(p.getPerimeter()));
	}
	
	/**
	 *  Test case for Triangle class
	 */
	@Test
	public void testTriangle() {
		assertEquals("Test Constructor for Triangle: ", "Triangle a: 3.0, b: 5.0, c: 7.0", t.toString());
		assertEquals("Test Triangle getArea(): ", "6.49519052838329", Double.toString(t.getArea()));
		assertEquals("Test Triangle getPerimeter(): ", "15.0", Double.toString(t.getPerimeter()));
	}
	
	/**
	 *  Test case for Picture class
	 */
	@Test
	public void testPicture() {
		Shape[] picture = { new Circle(3), 
	            new Triangle(3, 5, 7), 
	            new Rectangle(12, 3), 
	            new Circle(5), 
	            new Parallelogram(3, 5, 1), 
	            new Triangle(3, 5, 6) };
		Picture pic = new Picture(picture);
		assertEquals("Test Constructor for Picture: ", "Picture Area: 159.79265552398414, Perimeter: 125.26548245743669", pic.toString());
		assertEquals("Test Picture getArea(): ", "159.79265552398414", Double.toString(pic.getArea()));
		assertEquals("Test Picture getPerimeter(): ", "125.26548245743669", Double.toString(pic.getPerimeter()));
	}
}
