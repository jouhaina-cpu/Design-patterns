package Monteur;

public class CarBuilder implements Builder{

	private Car car;
	
	
	public CarBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		this.car=new Car(); 
		
	}

	@Override
	public void UpdateSeats(int nbrSeats) {
		this.car.setSeats(nbrSeats);
	}

	@Override
	public void UpdateEngine(String engine) {
		this.car.setEngine(engine);
	}

	@Override
	public void updateGps(boolean gps) {
		this.car.setGps(gps);
	}
	
	public Car getResult() {
		return this.car;
	}

}
