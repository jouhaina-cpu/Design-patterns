package Factory;

public class ShapeFactoryCircle extends ShapeFactory{

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
