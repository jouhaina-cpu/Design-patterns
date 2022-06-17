package Observateur;

public class ConcreteObserver implements Observer{

	private String name;

	public ConcreteObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name+ " 3andek new notification : "+message);
		
	}
	

}
