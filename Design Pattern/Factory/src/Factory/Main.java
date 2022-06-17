package Factory;

public class Main {

	public static void main(String[] args) {
		
		//Caché l'implementation des objets 
		//a3tini chnoia t7eb bdhabet o ena tw nekhdem lbe9i
		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();
		
		Shape square = ShapeFactory.getShape("square");
		square.draw();
	}

}
