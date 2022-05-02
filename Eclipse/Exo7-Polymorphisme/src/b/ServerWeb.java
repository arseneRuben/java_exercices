package b;

public class ServerWeb extends Server{

	private String defaultPage;
	public ServerWeb(boolean d, String page ) {
		// TODO Auto-generated constructor stub
		super(d, 80);
		this.defaultPage = page;
	}
	
	String getDefaultPage() {
		return this.defaultPage;
	}
	
	void setDefaultPage( String p) {
		this.defaultPage = p;
	}
	
	public void afficherInfo() {
		super.afficherInfo();
		System.out.println(this.defaultPage);
	}
	
	public void repondreRequete() {
		System.out.println("Le serveur Web envoie le contenu du fichier "+ this.getDefaultPage() +" au client via le port "+this.getPort());
	}

}
