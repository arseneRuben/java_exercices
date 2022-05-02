package b;

public class Parc {

	public Parc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server[] liste= new Server[10];
		boolean demarre = false;
		for(int i=0; i<10; i++) {
			demarre = !demarre;
			liste[i] = (Math.random() < 0.5)? new ServerWeb(demarre, i*10, "WebServer"+i) : new ServerFtp(demarre, i*10, "FtpServer"+i);
		}
		
		for(Server s:liste) {
			s.repondreRequete();
		}

	}

}
