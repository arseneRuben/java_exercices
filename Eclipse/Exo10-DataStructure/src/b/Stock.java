package b;

import java.util.ArrayList;

import java.util.Collections;

public class Stock {

	private ArrayList<Produit> liste ;
	public Stock() {
		// TODO Auto-generated constructor stub
		this.liste = new ArrayList<Produit>();
	}

	public ArrayList<Produit>  getListe(){
		return this.liste;
	}
	public void sort() {
		Collections.sort(this.liste);
	}
	
	public static void main(String[] args) {
		Stock st = new Stock();
		st.getListe().add(new Produit("Sac a dos", 150, 10));
		st.getListe().add(new Produit("Bottes securite", 105, 19));
		System.out.println(st);
		st.sort();
		System.out.println(st);
		
	}

	@Override
	public String toString() {
		return "Stock [liste=" + liste + "]";
	}
}
