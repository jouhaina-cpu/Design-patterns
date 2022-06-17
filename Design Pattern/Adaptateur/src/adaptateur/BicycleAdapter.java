package adaptateur;

public class BicycleAdapter implements Voiture {
	
	private Bicycle bike;
	
	public BicycleAdapter(Bicycle bike) {
		this.bike = bike;
	}
	
	@Override
	public void accelerer() {
		this.bike.pedal();
		
	}

	@Override
	public void pushBreak() {
		this.bike.stop();
		
	}

	@Override
	public void klaxon() {
		this.bike.ring();
		
	}

	

}
