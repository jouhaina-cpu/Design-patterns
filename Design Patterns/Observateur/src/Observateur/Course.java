package Observateur;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject{

	private String name;
	private String dispo;
	
	private List<Observateur> liste;
	
	public Course(String name) {
		super();
		this.name = name;
		liste = new ArrayList<Observateur>();
	}

	@Override
	public void subscribe(Observateur obs) {
		liste.add(obs);
		
	}

	@Override
	public void unsubscribe(Observateur obs) {
		liste.remove(obs);
		
	}

	@Override
	public void notifyAllSubscribe() {
		for(Observateur obs :liste)
		{
			obs.update(dispo);
		}
		
	}

	public void setDispo(boolean d) {
		if (d==true)
			this.dispo = this.name+" disponible";
		else
			this.dispo = this.name+" non disponible";
		notifyAllSubscribe();
	}
	
}
