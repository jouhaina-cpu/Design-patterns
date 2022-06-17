package adaptateur;

public class Main {

	public static void main(String[] args) {
	 
		Voiture car = new Car();
		useVoiture(car);
		
		Voiture bike = new BicycleAdapter(new Bicycle());
		useVoiture(bike);	
	
	}
	

	public static void useVoiture(Voiture v) {
	 
		v.accelerer();
		v.pushBreak();
		v.klaxon();
	
	}

}
