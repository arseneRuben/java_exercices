package b;

public class ServerWeb extends Server{

	private String defaultPage;
	public ServerWeb(boolean d, int p, String page ) {
		// TODO Auto-generated constructor stub
		super(d, p);
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
		System.out.println("Page web"+this.getDefaultPage());
	}

}
