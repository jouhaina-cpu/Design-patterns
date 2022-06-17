package Observateur;

public class Main {

	public static void main(String[] args) {
	
		ConcreteObserver s0  = new ConcreteObserver("jouhaina");
		ConcreteObserver s1  = new ConcreteObserver("arij");
		ConcreteObserver s2  = new ConcreteObserver("eya");
		ConcreteObserver s3  = new ConcreteObserver("amira");
		ConcreteObserver s4  = new ConcreteObserver("siwar");
		
		ConcreteObservable java = new ConcreteObservable("object");
		
		java.addObserver(s0);
		java.addObserver(s1);
		java.addObserver(s2);
		java.addObserver(s3);
		java.addObserver(s4);
		
		java.setChanged(true);
		

	}

}
