package a;

public class Voiture implements ITableauDeBord {

	public Voiture() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void tourner() {
		// TODO Auto-generated method stub
		System.out.println("La voiture tourne");
	}

	@Override
	public void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("La voiture accelere");
	}

	@Override
	public void freiner() {
		// TODO Auto-generated method stub
		System.out.println("La voiture freine");
	}

}
