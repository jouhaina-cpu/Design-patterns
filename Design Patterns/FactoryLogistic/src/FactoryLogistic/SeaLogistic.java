package FactoryLogistic;

public class SeaLogistic extends Logistics{

	@Override
	public Transport CreateTransport() {
		return new Ship();
	}

}
