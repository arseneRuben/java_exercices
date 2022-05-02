package b;

public class ServerFtp extends Server{
	private  String nomDuFichier;
	
	
	public ServerFtp(boolean d, String page ) {
		// TODO Auto-generated constructor stub
		super(d, 21);
		this.nomDuFichier = page;
	}
	
	public String getNomDuFIchier() {
		return this.nomDuFichier;
	}
	
	public void setNomDuFichier(String fileName) {
		this.nomDuFichier = fileName;
	}
	
	public void repondreRequete() {
		System.out.println("Le serveur ftp envoie le fichier "+ this.getNomDuFIchier()+ " au client via le port "+this.getPort());
	}

}
