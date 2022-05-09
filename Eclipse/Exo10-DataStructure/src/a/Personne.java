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
	public static Personne searchInHashTable(Hashtable<Personne, Integer> hashTable, int id) {
		Personne searchedPerson= null;
		for(Entry<Personne, Integer> p:hashTable.entrySet()) {
			if(id == p.getKey().getId()) {
				searchedPerson = p.getKey();
			}
		}
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
		Hashtable<Personne, Integer> hashTable = new Hashtable<Personne, Integer>();
		hashTable.put(p1, p1.getId());
		hashTable.put(p2, p2.getId());
		hashTable.put(p3, p3.getId());
		hashTable.put(p4, p4.getId());
		hashTable.put(p5, p5.getId());
		hashTable.put(p6, p6.getId());
		System.out.println(hashTable);

		System.out.println(p1 + " est stoque a l'indice " + searchInList(arrayList, p1));
		System.out.println(p7 + " est stoque a l'indice " + searchInList(arrayList, p7));
		
		System.out.println(" Le prof num 3 de la liste est" + searchInList(arrayList, 3));
		System.out.println(" Le prof num 3 de la table de hash est" + searchInHashTable(hashTable, 3));

	}
}
