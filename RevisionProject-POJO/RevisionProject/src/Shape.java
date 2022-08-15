package za.co.noah.shape;

public abstract class Shape
{
	private String shapeName;
	
	public Shape()
	{
	}
     
	 public Shape(String shapeName)
	{
		this.shapeName = shapeName;
	}
	
	public void setShapeName(String shapeName)
	{
		this.shapeName = shapeName;
	}
	
	public String getShapeName()
	{
		return shapeName;
	}
	public abstract double area();
	
	public String toString()
	{
		return shapeName;
	}
	
	public boolean equals(Shape objShape)
	{
		boolean valid = false;
		
		if (shapeName.equals(objShape.getShapeName()))
		{
			valid = true;
		}
		else
		{
			valid = false;
		}
		return valid;
	}
}





