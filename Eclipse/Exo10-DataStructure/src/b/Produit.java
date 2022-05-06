package b;

import java.util.Comparator;

public class Produit implements Comparable<Produit>{

	private String name;
	private float price;
	private float weight;
	

	public Produit(String name, float price, float w) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.weight = w;
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public String toString() {
		String info = "";
		info += this.name+ " (" + this.price + ", " + this.weight + ") ";
		return info;
	}

	@Override
	public int compareTo(Produit o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	
	}
	
	
	
	
	
	

}
