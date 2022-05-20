package reseau;

import java.io.IOException;
import java.net.ServerSocket;

public class NotificateurBain {
	public NotificateurBain() {
		try {
			ServerSocket serverSocket = new ServerSocket(2222);
			serverSocket.accept();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
