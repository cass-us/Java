package za.co.noah.square;
import za.co.noah.shape.Shape;

public class Square extends Shape
{
	private double side;
	
	public Square()
	{}
	public Square(String shapeName, double side)
	{
	    super(shapeName);
		this.side = side;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}

    public double getSide()
	{
		return side;
	}
	
	public double area()
	{
		return Math.pow(side, 2); //side * side;
	}
	
	public String toString()
	{
		return super.toString() + " " +String.valueOf(side);
	}

}