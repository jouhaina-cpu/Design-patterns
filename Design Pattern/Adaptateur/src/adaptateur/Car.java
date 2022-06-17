package adaptateur;

public class Car implements Voiture{

	@Override
	public void accelerer() {
		System.out.println("accelerer");
		
	}

	@Override
	public void pushBreak() {
		System.out.println("stop");
		
	}

	@Override
	public void klaxon() {
		System.out.println("zameer");
		
	}

}
