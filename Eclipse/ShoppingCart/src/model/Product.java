package model;

import java.util.ArrayList;



public class Product{
	
	
	private String designation;
	private int quantite;
	private double prixUnit;
	private static final String FILE_NAME = "data/stock.txt";
	

	public static  String getFileName() {
		return FILE_NAME;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixUnit() {
		return prixUnit;
	}

	public void setPrixUnit(double prixUnit) {
		this.prixUnit = prixUnit;
	}

	/**
	 * 
	 * @param id    : product identifier
	 * @param name  : Trade name of the product
	 * @param qty   : Quantity of product available in stock
	 * @param price : Product unit price
	 */
	public Product(String designation, int quantite, double prixUnit) {
		
		this.designation = designation;
		this.quantite = quantite;
		this.prixUnit = prixUnit;
	}
	
	

	/**
	 * Returns a header format of the record storage file
	 * 
	 * @return
	 */
	public  String fileHeader() {
		return "Id|Name|Qte|Price\n";
	}

	public String toString() {
		return  super.toString() + designation + "|" + quantite + "|" + prixUnit ;
	}
	




}
