package Factory;

public class ShapeFactory {
	
	public static Shape getShape(String shape)
	{
		if(shape.equals("circle"))
			return new Circle();
		else if(shape.equals("square"))
			return new Square(); 
		else return null;
			
	}

}
