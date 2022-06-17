package Observateur;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable{

	private String name;
	private String change;
	
	private List<Observer> liste;
	

	public ConcreteObservable(String name) {
		super();
		this.name = name;
		liste = new ArrayList<Observer>();
	}

	@Override
	public void notifyAllSubscribe() {
		for(Observer obs :liste)
		{
			obs.update(change);
		}
		
	}

	@Override
	public void addObserver(Observer obs) {
		liste.add(obs);
	}

	@Override
	public void deleteObservers(Observer obs) {
		liste.remove(obs);
		
	}

	@Override
	public void setChanged(Boolean change) {
		boolean d = true;
		if ( d==true)
			this.change = this.name+" change";
		else
			this.change = this.name+" not change";
		notifyAllSubscribe();	
	}
	
}
