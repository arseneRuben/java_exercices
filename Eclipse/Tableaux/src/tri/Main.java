package tri;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	static int  taille = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tab20[] = new double[taille];

		// printTab(tab20);
		System.out.println();
		initTab(tab20);
		printTab(tab20);
		System.out.println();
		trieBulle(tab20);
		printTab(tab20);
		System.out.println();
	}

	public static void printTab(double tab[]) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print((Math.round(tab[i]  * 100.0) / 100.0)+ "  ");
		}
	}

	public static void initTab(double tab[]) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = Math.random() * 40;
		}

	}

	public static void doubleTab(double tab[]) {
		for (double a : tab) {
			a *= 2;
		}

	}

	public static void permut(double tab[],int i, int j) {
		double temp = tab[i];
        tab[j]=tab[i];
        tab[i]=temp;   
	}
	
	public static double[] trieBulle(double tab[]) {
	      for(int i = tab.length-1 ; i>=1 ; i--)
	      {
	              for(int j = 0 ; j<i ; j++)
	              if(tab[j] > tab[j+1])
	              {
	                   permut(tab, j, j+1);
	              }
	      }
	      return tab;
	}
}
