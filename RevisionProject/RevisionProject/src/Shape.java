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
}