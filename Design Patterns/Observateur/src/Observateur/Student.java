package Observateur;

public class Student implements Observateur{
	
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(this.name+ " 3andek new notification : "+message);
		
	}
	

}
