package prototype;

public class Main { //couplage

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		System.out.println(personne1);
		
		Prototype personne2 = personne1.clone();
		System.out.println(personne2);
		
		Personne personne3 = (Personne)personne1.clone();
		System.out.println(personne3);
		
		/// Personne personne2 = new Personne(); personne2.copie(personne1);

		
	}

}
