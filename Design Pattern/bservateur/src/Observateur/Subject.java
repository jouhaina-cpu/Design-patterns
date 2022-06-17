package Observateur;

public interface Subject {
	
	void subscribe(Observateur obs);
	void unsubscribe(Observateur obs);
	void notifyAllSubscribe();

}
