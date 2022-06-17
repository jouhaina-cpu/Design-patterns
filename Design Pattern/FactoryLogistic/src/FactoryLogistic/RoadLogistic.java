package FactoryLogistic;

public class RoadLogistic extends Logistics{

	@Override
	public Transport CreateTransport() {
		return new Truck();
	}

}
