package prototype;

public class Personne implements Prototype{
	
	@Override
	public String toString() {
		return "Personne [code=" + code + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}

	@Override
	public Prototype clone() {
		return new Personne();
	}
	
	private String code;
	private String Nom;
	private String Prenom;
	
	public Personne() {
		this.setCode("1");
		this.setNom("Nasri");
		this.setPrenom("Jouhaina");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	

}
