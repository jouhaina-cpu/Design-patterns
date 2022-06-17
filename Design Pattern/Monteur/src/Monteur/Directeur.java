package Monteur;

public class Directeur {
	
	public void constructSportsCar(Builder builder) {
		builder.reset(); 
		builder.UpdateEngine("X1");
		builder.updateGps(true);
		builder.UpdateSeats(4);
	}
	
	
	
	public void constructFamilyCar(Builder builder) {
		builder.reset();
		builder.UpdateEngine("X2");
		builder.updateGps(false);
		builder.UpdateSeats(5);
	}

}
