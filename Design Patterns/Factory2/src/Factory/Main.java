package Factory;

public class Main {

	public static void main(String[] args) {
		
		ShapeFactory circle = new ShapeFactoryCircle();
		Shape cir = circle.createShape();
		cir.draw();
		
		ShapeFactory square = new ShapeFactorySquare();
		Shape sq = square.createShape();
		sq.draw();
		
	}

}
