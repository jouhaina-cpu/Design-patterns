package Composite;

public class Main {

	public static void main(String[] args) {

		Composite racine= new Composite("composite1");
		
		Composite composite2= new Composite("composite2");
		
		racine.add(composite2);
		
		racine.add(new Element("Fichier 11"));
		racine.add(new Element("Fichier 12"));
		racine.add(new Element("Fichier 13"));
		composite2.add(new Element("Fichier 21"));
		composite2.add(new Element("Fichier 22"));
		
		racine.operation();
		
	}

}
