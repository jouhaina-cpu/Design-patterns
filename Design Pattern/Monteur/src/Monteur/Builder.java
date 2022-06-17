package Monteur;

public interface Builder {
	
	void reset(); //pour creer l'objet
	
	
	void UpdateSeats(int nbrSeats);///
	
	void UpdateEngine(String engine);
	
	void updateGps(boolean gps);

}
