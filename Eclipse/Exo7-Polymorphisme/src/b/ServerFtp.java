package b;

public class ServerFtp extends Server{
	private  String nomDuFichier;
	
	
	public ServerFtp(boolean d, int p, String page ) {
		// TODO Auto-generated constructor stub
		super(d, p);
		this.nomDuFichier = page;
	}
	
	public String getNomDuFIchier() {
		return this.nomDuFichier;
	}
	
	public void setNomDuFichier(String fileName) {
		this.nomDuFichier = fileName;
	}
	
	public void repondreRequete() {
		System.out.println("Fichier "+this.getNomDuFIchier());
	}

}
