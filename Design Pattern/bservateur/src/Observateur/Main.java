package Observateur;

public class Main {

	public static void main(String[] args) {
	
		Student s0  = new Student("jouhaina");
		Student s1 = new Student("arij");
		Student s2 = new Student("eya");
		Student s3 = new Student("amira");
		Student s4 = new Student("siwar");
		
		Course java = new Course("Java");
		
		java.subscribe(s0);
		java.subscribe(s1);
		java.subscribe(s2);
		java.subscribe(s3);
		java.subscribe(s4);
		
		java.setDispo(true);
		

	}

}
