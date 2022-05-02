package main;

public class MyInt {
	private int value;
	public MyInt(int val) {
		// TODO Auto-generated constructor stub
		this.value = val;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int v) {
		this.value=v;
	}
	public String toString() {
		return this.value+" ";
	}

}
