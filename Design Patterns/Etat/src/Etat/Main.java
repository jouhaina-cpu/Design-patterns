package Etat;

public class Main {

	public static void main(String[] args) {
	
		MobileContext m = new MobileContext();
		m.alert();
		
		m.setCurrentState(new silencieux());
		m.alert();
	}

}
