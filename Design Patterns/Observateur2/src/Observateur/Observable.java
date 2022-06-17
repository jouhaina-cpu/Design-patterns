package Observateur;

public interface Observable {
	
	void addObserver(Observer obs);
	void deleteObservers(Observer obs);
	void setChanged(Boolean change);
	void notifyAllSubscribe();

}
