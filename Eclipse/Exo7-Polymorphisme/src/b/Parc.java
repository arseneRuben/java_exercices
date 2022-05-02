package b;

public class Parc {

	static Server[] liste= new Server[10];
	public Parc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question2();
		System.out.println();
		question3();
		
		
		

	}
	
	public static void question3() {
		for(Server s:liste) {
			if( s instanceof ServerFtp) {
				System.out.println(((ServerFtp)s).getNomDuFIchier());
			}
			if( s instanceof ServerWeb) {
				System.out.println(((ServerWeb)s).getDefaultPage());
			}
		}
	}
	
	public static void question2() {
		boolean demarre = false;
		for(int i=0; i<10; i++) {
			demarre = !demarre;
			liste[i] = (Math.random() < 0.5)? new ServerWeb(demarre, "WebServer"+i) : new ServerFtp(demarre, "FtpServer"+i);
		}
		
		for(Server s:liste) {
			s.repondreRequete();
		}
	}

}
