package a;

import java.util.ArrayList;



public class Personne {
	private String fullname;
	private int id;
	private static int EFFECTIF=0;
	public Personne(String name) {
		// TODO Auto-generated constructor stub
		this.fullname = name;
		Personne.EFFECTIF++;
		this.id = Personne.EFFECTIF;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFullName() {
		return this.fullname;
	}
	
	public void setFullName(String name) {
		this.fullname = name;
	}
	
	public String toString() {
		return " ("+ this.id+ ")"+this.fullname + "\n";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Personne> list = new ArrayList<Personne>();
		list.add(new Personne("Alain Herzt"));
		list.add(new Personne("Francois Capone"));
		list.add(new Personne("Kamto Maurice"));
		list.add(new Personne("Gabriella Nicolescu"));
		list.add(new Personne("Giles Pesant"));
		System.out.println(list);
			
			

	}
}
