package a;

public class Controlleur {
	private Vue laVue;
	private Modele leModele;
	

	public void setVue(Vue laVue) {
		this.laVue = laVue;
	}

	public void setModele(Modele leModele) {
		this.leModele = leModele;
	}

	public void action() {
		this.leModele.setValeur(this.laVue.getValeur());
		this.laVue.afficherResultat(this.leModele.carre());
	}
	

}
