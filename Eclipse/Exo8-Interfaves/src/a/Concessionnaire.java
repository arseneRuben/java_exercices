package a;

public class Concessionnaire {

	public Concessionnaire() {
		// TODO Auto-generated constructor stub
	}

	public ITableauDeBord vendreVehicule(String avendre) {
		ITableauDeBord v;
		if (avendre.equals("Camion")) {
			v = new Camion();
		} else {
			v = new Bateau();
		}
		return v;
	}

}
