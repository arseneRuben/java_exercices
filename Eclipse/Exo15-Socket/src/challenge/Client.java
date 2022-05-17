package challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Client {
	Socket socket;
	InputStream is;

	public Client() throws UnknownHostException, IOException {
		this.socket = new Socket("192.168.60.45", 4321);
		this.is = socket.getInputStream();

	}

	public void readFromServer() {
		try {

			System.out.println("Client : connexion etablie!");
			// Affichage de l'adresse IP
			System.out.println("IP : " + socket.getInetAddress());

		
			InputStreamReader isr = new InputStreamReader(this.is);
			BufferedReader br = new BufferedReader(isr);

			// lecture des donnees provenant du serveur
			String nb1 = br.readLine();
			String nb2 = br.readLine();
			System.out.println("Client : le serveur a envoye : '" + nb1 + "'");
			System.out.println("Client : le serveur a envoye : '" + nb2 + "'");
			int total = Integer.parseInt(nb1) +  Integer.parseInt(nb2);
			BufferedWriter os = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
			System.out.print(total+"\n");
			os.write(total+"\n");
			os.flush();
			System.out.println("Client : fermeture de la connexion");

			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			Client c = new Client();
			c.readFromServer();
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
