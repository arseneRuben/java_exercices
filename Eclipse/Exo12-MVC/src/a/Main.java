package a;

public class Main {

	
	public static void main(String[] args) {
		Modele leModele = new Modele();
		Vue laVue = new Vue();
		Controlleur leCtrl = new Controlleur();
		laVue.setControlleur(leCtrl);
		leCtrl.setVue(laVue);
		leCtrl.setModele(leModele);
		
		//LaVue.demarrer();

	}

}
