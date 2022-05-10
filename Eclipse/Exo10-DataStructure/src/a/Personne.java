package a;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Personne {
	private String fullname;
	private int id;
	private static int EFFECTIF = 0;

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
		return "\n (" + this.id + ")" + this.fullname;
	}

	// Retourne de la personne dans arrayList, -1 si elle n'y figure
	public static int searchInList(ArrayList<Personne> arrayList, Personne p) {
		return arrayList.indexOf(p);
	}

	// Retourne la personne  a l' id passe en parametre 
	public static Personne searchInList(ArrayList<Personne> arrayList, int id) {
		Personne searchedPerson= null;
		for(Personne p:arrayList) {
			if(id == p.getId()) {
				searchedPerson = p;
			}
		}
		return searchedPerson;
	}

	// Retourne la personne  a l' id passe en parametre 
	public static Personne searchInHashTable(Hashtable<Integer, Personne> hashTable, int id) {
		Personne searchedPerson= hashTable.get(id);
		
		return searchedPerson;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 2
		ArrayList<Personne> arrayList = new ArrayList<Personne>();
		Personne p1 = new Personne("Alain Herzt"), p2 = new Personne("Francois Capone"),
				p3 = new Personne("Kamto Maurice"), p4 = new Personne("Gabriella Nicolescu"),
				p5 = new Personne("Bonde Lossan"), p6 = new Personne("Giles Pesant"),
				p7 = new Personne("Kenfack Alexandre");

		arrayList.add(p1);
		arrayList.add(p2);
		arrayList.add(p3);
		arrayList.add(p4);
		arrayList.add(p5);
		arrayList.add(p6);
		System.out.println(arrayList);

		// Question 3
		Hashtable<Integer, Personne> hashTable = new Hashtable<Integer, Personne>();
		hashTable.put( p1.getId(), p1);
		hashTable.put( p2.getId(), p2);
		hashTable.put( p3.getId(), p3);
		hashTable.put( p4.getId(), p4);
		hashTable.put( p5.getId(), p5);
		hashTable.put( p6.getId(), p6);
		System.out.println(hashTable);

		System.out.println(p1 + " est stoque a l'indice " + searchInList(arrayList, p1));
		System.out.println(p7 + " est stoque a l'indice " + searchInList(arrayList, p7));
		
		System.out.println(" Le prof num 3 de la liste est" + searchInList(arrayList, 3));
		System.out.println(" Le prof num 3 de la table de hash est" + searchInHashTable(hashTable, 3));

	}
}
