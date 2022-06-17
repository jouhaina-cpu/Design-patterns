package Monteur;

public class Main {

	public static void main(String[] args) {
		
		Directeur d = new Directeur();
		CarBuilder b = new CarBuilder();
		
		d.constructFamilyCar(b);;
		
		Car c = b.getResult();
		
		System.out.println(c);
				
	}

}
