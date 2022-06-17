package Factory;

public class ShapeFactorySquare extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Square();
	}

}
