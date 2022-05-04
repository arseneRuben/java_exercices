package a;

public class Principale {

	public Principale() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conducteur paul = new Conducteur();
		Voiture voitureRoure = new Voiture();
		Camion camionJaune = new Camion();
		
		Concessionnaire c = new Concessionnaire();
		paul.conduire(c.vendreVehicule("Camion"));
		paul.conduire(c.vendreVehicule("Bateau"));

	}

}
