package b;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Stock  {

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
	

	

	
	public void sort ( Criteria c) {
		ProductComparator comparator = new ProductComparator(c);
		Collections.sort(this.liste, comparator);
	}
	
	public static void main(String[] args) {
		Stock st = new Stock();
		st.getListe().add(new Produit("Sac a dos", 150, 10));
		st.getListe().add(new Produit("Bottes securite", 105, 19));
		System.out.println("Liste initiale: "+st);
		
		st.sort();
		System.out.println("Liste triee selon les designations: "+st);
		
		st.sort(Criteria.WEIGHT);
		System.out.println("Liste triee selon les masses: "+st);
		
		st.sort(Criteria.PRICE);
		System.out.println("Liste triee selon les prix: "+st);
	
		
	}

	@Override
	public String toString() {
		return "Stock [liste=" + liste + "]";
	}
}
