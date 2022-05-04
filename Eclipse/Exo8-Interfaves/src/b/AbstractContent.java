package b;

public abstract class AbstractContent implements IEnumerable{
	protected int current;

	public AbstractContent() {
		// TODO Auto-generated constructor stub
		this.current =0;
	}

	
	
    public abstract Object suivant() ;
    
    
	public void print() {
		Object v;
		do {
			v = this.suivant();
			System.out.print(v + " ");
		}while(v != null);
		System.out.println();
	}

}
