package a;

public class Conducteur {

	public Conducteur() {
		// TODO Auto-generated constructor stub
	}

	public void conduire(ITableauDeBord vehicule) {
		vehicule.accelerer();
		vehicule.tourner();
		vehicule.freiner();
	}
}
