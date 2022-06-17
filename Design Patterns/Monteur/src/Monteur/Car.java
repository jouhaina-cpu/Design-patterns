package Monteur;

public class Car {

	private String mat;
	private int seats;
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Car [mat=" + mat + ", seats=" + seats + ", engine=" + engine + ", gps=" + gps + "]";
	}
	public Car() {
		super();
	}
	public Car(String mat, int seats, String engine, boolean gps) {
		super();
		this.mat = mat;
		this.seats = seats;
		this.engine = engine;
		this.gps = gps;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public boolean isGps() {
		return gps;
	}
	public void setGps(boolean gps) {
		this.gps = gps;
	}
	private String engine;
	private boolean gps;
}
