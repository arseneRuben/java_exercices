package b;

public abstract class  Server {
	protected boolean demarre;
	protected int port;

	public Server(boolean d, int p ) {
		// TODO Auto-generated constructor stub
		this.demarre = d;
		this.port = p;
	}
	
	public boolean getDemarre() {
		return this.demarre;
	}
	
	public int getPort() {
		return this.port;
	}
	
	public void setDemarre(boolean d) {
		this.demarre = d;
	}
	
	public void setPort(int p) {
		this.port = p;
	}
	
	public void afficherInfo() {
		String info = "Serveur " ;
		info+= this.demarre ? " demarre " : " eteint";
		info+= " Port: "+this.port;
		System.out.println(info);
		
	}
	
	public abstract void repondreRequete();

}
