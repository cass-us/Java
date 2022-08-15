import za.co.noah.shape.Shape;
import za.co.noah.square.Square;
import za.co.noah.circle.Circle;
import za.co.noah.triangle.Triangle;
import java.util.ArrayList;
public class FrontEnd
{
	public static void main(String[]args)
	{
		ArrayList<Shape> listOfshapes = new ArrayList<Shape>();
		Shape objShape = new Square("Square",25);
		listOfshapes.add(objShape);
		objShape = new Circle("Circle",16.23);
		listOfshapes.add(objShape);
		Circle objCircle = new Circle("Circle",23.23);
		listOfshapes.add(objCircle);
		Shape objTriangle = new Triangle("Triangle",25,17);
		listOfshapes.add(objTriangle);
		
		
		for (int i=0; i < listOfshapes.size(); ++i)
		{
			if (i != 0)
			{
				if(listOfshapes.get(i).equals(listOfshapes.get(i-1)))
				{
					System.out.println(listOfshapes.get(i).toString() +" is equal to " + listOfshapes.get(i-1).toString());
				}
				
			}
		}
		/*
		for(Shape shape : listOfshapes)
		{
			if (shape instanceof Circle)
			{
			  Circle shapeOfCircle = (Circle) shape;
			  System.out.println(shapeOfCircle.getShapeName() + " its area is " + shapeOfCircle.area() + " diameter is " + shapeOfCircle.diameter());
			}
			else
			{    
				 System.out.println(shape.toString() +" "+ shape.area() + " Hash code" + shape.hashCode() );
			}
		}
		
		*/
	}

}