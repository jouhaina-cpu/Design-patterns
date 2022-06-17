package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite  extends Composant{
	
	public Composite(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	private List<Composant> l =new ArrayList<Composant>();

	@Override
	public void operation() {
		String tab="";
		for(int i=0;i<niveau;i++)
			tab+="----";
		System.out.println(tab+" Composite"+Nom);
		for(Composant c : l )
		{
			c.operation();
		}
	}
	
	public void add(Composant c )
	{
		c.niveau=this.niveau+1;
		l.add(c);
	}
	
	public void remove(Composant c)
	{
		l.remove(c);
	}
	
	public List<Composant> getAll()
	{
		return l;
	}
}
