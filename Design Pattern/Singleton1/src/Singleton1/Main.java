package Singleton1;

public class Main {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.Traitement();
		
		Singleton s1 = Singleton.getInstance();
		s1.Traitement();
		
		Singleton s2 = Singleton.getInstance();
		s2.Traitement();
		
		Singleton s3 = Singleton.getInstance();
		s3.Traitement();
	
	
	}

}
