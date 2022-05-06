package b;

public class Sac extends AbstractContent {

	private int nbElts;
	private int[] tab;
	
	public Sac() {
		// TODO Auto-generated constructor stub
		super();
		this.tab = new int[1];
		this.nbElts = 0;
	}

	
	public Object premier() {
		this.current=0;
		return this.tab[this.current];
	}
	public Sac(int tab[]) {
		// TODO Auto-generated constructor stub
		super();
		this.tab = tab;
		for(int c:tab) {
			this.push(c);
		}
	}

	public int getNbElts() {
		return this.nbElts;
	}

	public int getCapacity() {
		return this.tab.length;
	}

	public boolean isEmpty() {
		return this.nbElts == 0;
	}

	public boolean isFull() {
		return this.nbElts == this.getCapacity();
	}

	private void resize(int taille) {
		if (taille >= this.nbElts) {
			int[] newData = new int[taille];
			int i = 0;
			for (i = 0; i < this.nbElts; i++) {
				newData[i] = this.tab[i];
			}

			this.tab = newData;
		} else {
			System.exit(-1);
		}
	}

	public void push(int val) {

		if (this.isFull()) {
			this.resize(this.nbElts * 2);
		}

		this.tab[this.nbElts] = val;
		this.nbElts += 1;
	}

	public void printData() {
		for (int v : this.tab) {
			System.out.print(v + " ");
		}
		System.out.println();
	}

	

	@Override
	public Object suivant() {
		if (this.current < this.nbElts) {
			this.current++;
			return this.tab[this.current-1];
		} else {
			return null;
		}

	}

}
