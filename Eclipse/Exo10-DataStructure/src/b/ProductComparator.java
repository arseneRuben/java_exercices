package b;

import java.lang.runtime.SwitchBootstraps;
import java.util.Comparator;

import javax.swing.SwingConstants;

public class ProductComparator implements Comparator<Produit> {

	Criteria criteria;

	public ProductComparator(Criteria critere) {
		// TODO Auto-generated constructor stub
		this.criteria = critere;
	}

	public Criteria getCriteria() {
		return this.criteria;
	}
	
	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}
	
	
	@Override
	public int compare(Produit o1, Produit o2) {
		int result = 0;
		switch (this.criteria) {
		case NAME:
			result = o1.getName().compareTo(o2.getName());
			break;
		case PRICE:
			if (o1.getPrice() > o2.getPrice())
				result = 1;
			else if (o1.getPrice() < o2.getPrice())
				result = -1;
			else
				result = 0;
			break;
		case WEIGHT:
			if (o1.getWeight() > o2.getWeight())
				result = 1;
			else if (o1.getWeight() < o2.getWeight())
				result = -1;
			else
				result = 0;
			break;
		}

		return result;

	}

}
