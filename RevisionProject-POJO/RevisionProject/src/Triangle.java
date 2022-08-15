package za.co.noah.triangle;
import za.co.noah.shape.Shape;
public class Triangle extends Shape
{
	private double base;
	private double height;
	
	public Triangle()
	{}
	public Triangle(String shapeName, double base, double height)
	{
		super(shapeName);
		this.base = base;
		this.height = height;
	}
	//setters and getters
	public double area()
	{
		return 0.5 * base * height;
	}
}