package Singleton1;

public class Singleton {
	
private static Singleton instance;

int i =0;

private Singleton() {
	i++;
}


public static Singleton getInstance() {
	if(instance == null)
		instance = new Singleton();
	return instance;
}

public void Traitement() {
	System.out.println("Singleton "+i);
}


}
