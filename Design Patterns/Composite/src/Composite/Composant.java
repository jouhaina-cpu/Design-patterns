package Composite;

public abstract class Composant {
	
	protected String Nom;
	protected int niveau;
	
	public abstract void operation();

	public Composant(String nom) {
		Nom = nom;
	}

}
