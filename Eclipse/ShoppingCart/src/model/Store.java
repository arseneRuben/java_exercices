package model;

class Top {
	
	public Top(String s) {
		System.out.print("B");
	}
}

public class Store extends Top {
	public Store(String s) { System.out.print("D"); }

	public static void main(String[] args) {
		new Store("C");
		System.out.println(" ");
	}
}