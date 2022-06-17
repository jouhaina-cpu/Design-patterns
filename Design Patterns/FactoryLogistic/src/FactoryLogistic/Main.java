package FactoryLogistic;

public class Main {

	public static void main(String[] args) {
		
		/**Ship p = new Ship();
		p.deliver();
		
		Truck t = new Truck();
		t.deliver();**/
		
		Logistics truck = new RoadLogistic();
		Transport t = truck.CreateTransport();
		t.deliver();
		
		
		Logistics Ship = new SeaLogistic();
		Transport se = Ship.CreateTransport();
		se.deliver();
		
		
		
		
		
	}

}
