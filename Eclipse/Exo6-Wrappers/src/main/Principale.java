package main;

public class Principale {
	public static void inc(int n) {
		n++;
	}
	public static void inc(MyInt n) {
		n.setValue(n.getValue()+1);
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println("avant n= "+ n);
		inc(n);
		System.out.println("apres n= "+ n);
		MyInt m= new MyInt(n);
		System.out.println("avant n= "+m);
		inc(m);
		System.out.println("apres n= "+m);
		Days[] d = Days.values();
		System.out.println("apres n= "+d[2]);
	}
	public Principale() {
		// TODO Auto-generated constructor stub
		
	}

	enum Days{
		MON, TUES, THURS
	}
}
