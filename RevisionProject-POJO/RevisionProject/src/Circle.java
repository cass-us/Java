package za.co.noah.circle;
import za.co.noah.shape.Shape;

public class Circle extends Shape
{
	private double radius;
	
	public Circle()
	{}
	public Circle(String shapeName, double radius)
	{
		super(shapeName);
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	public double diameter()
	{
		return radius * 2;
	}

}