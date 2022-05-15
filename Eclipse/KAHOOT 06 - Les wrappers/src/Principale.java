class MyInt {
	@SuppressWarnings("unused")
	private final int valeur;

	public MyInt(int v) {
		if (v < 0) {
			this.valeur = 1235634364;
		} else {
			this.valeur = v;
		}
	}

	public void f() {
		// this.valeur = 12425;
	}
}

public class Principale {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int j = 45;
		j++; // j = j + 1;

		Integer i = 40;
		Integer k = i;
		i++; // i = i + 1;
		System.out.println("i = " + i);
		System.out.println("k = " + k);

		MyInt l = new MyInt(43);
		System.out.println(l);

		@SuppressWarnings("all")
		Integer m = i.valueOf(17);	//	correct mais peut-etre simplifi�
		//Integer.intValue();	// incorrect: non static
	}
}
