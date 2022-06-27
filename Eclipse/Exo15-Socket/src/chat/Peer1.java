package chat;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.UnknownHostException;


public class Peer1 {
	ServerSocket serverSocket;  
	Socket socket;
	InputStream is;
	OutputStream os;
	private String name;
	private final int port=4444;
	

	public void readFromPeer2() {
		try {
			System.out.println("Client : connexion etablie!");
			// Affichage de l'adresse IP
			System.out.println("IP : " + socket.getInetAddress());
			InputStreamReader isr = new InputStreamReader(this.is);
			BufferedReader br = new BufferedReader(isr);
			// lecture des donnees provenant de l'autre paire
			String msg;
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
			
			
			BufferedWriter os = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
			
			os.write("Autre message pour l'autre paire");
			os.flush();
			System.out.println("Paire1 : fermeture de la connexion");

			socket.close();
			
			serverSocket=new ServerSocket(3333); // Moi j'ecoute au port 3333
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public Peer1(String name, int port) throws UnknownHostException, IOException {
	
		//this.socket = new Socket("172.16.201.94", port);
		//this.is = socket.getInputStream();
		//this.name = name;
		serverSocket=new ServerSocket(3333); // Moi j'ecoute au port 3333
		Socket ss = serverSocket.accept();
		DataInputStream din=new DataInputStream(ss.getInputStream()); 
		String str="";  
		while(!str.equals("stop")){  
		str=din.readUTF();  
		System.out.println("client says: "+str);  
		 
		}  
		din.close();  

	}
	
	public static void main(String[] args) {
		try {
			Peer1 p1 = new Peer1("Arsene", 4444);
			p1.readFromPeer2();
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}


}
