package b;

public class Intervalle extends AbstractContent {

	private int min, max;
	public Intervalle(int min, int max) {
		// TODO Auto-generated constructor stub
		super();
		this.min = min;
		this.max = max;
		this.current = min;
	}


	@Override
	public Object suivant() {
		// TODO Auto-generated method stub
		if(this.current < max) {
			this.current++;
			return this.current;
		}else {
			return null;
		}
	}

	public Object premier() {
		return this.current;
	}

	

}
