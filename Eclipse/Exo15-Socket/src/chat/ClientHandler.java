package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{

	/* Cette liste permet de garder une trace de tous nos clients afin que 
	 chaque fois qu'un client envoie un msg, nous pouvons diffuser ce msg
	 a tous les autres clients, au lieu d'envoyer au serveur seulement*/ 
	public static ArrayList<ClientHandler> clientHandlers = new ArrayList<>(); 
	private Socket socket;
	// Pour la lecture des msg qui ont ete envoyes par le client
	private BufferedReader bufferedReader;
	// Pour l'envoie des msg aux autres postes 
	private BufferedWriter bufferedWriter;
	private String clientUsername;
	// le constructeur
	public ClientHandler( Socket socket) {
		try {
			this.socket = socket;
			this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.clientUsername = bufferedReader.readLine();
			clientHandlers.add(this);
			this.broadCastMessage("SERVER: "+ clientUsername + " vient d'integrer le chat");
		}catch(IOException e) {
			closeEverithing(socket, bufferedReader, bufferedWriter);
		}
	}

	@Override
	public void run() {
		//Etant donne que la lecture d'un msg est une operation blocante, il convient de 
		// faire un thread pour chaque client
		String msgFromClient;
		while(socket.isConnected()) {
			try {
				msgFromClient = bufferedReader.readLine();
				broadCastMessage(msgFromClient);
			}catch(IOException e) {
				closeEverithing(socket, bufferedReader, bufferedWriter);
				break; // Si le client se deconnecte, on sort de la boucle
			}
		}
	}
	
	public void broadCastMessage(String msgToSend) {
		for(ClientHandler clientHdl : clientHandlers) {
			try {
				if(!clientHdl.clientUsername.equals(clientUsername)) {
					clientHdl.bufferedWriter.write(msgToSend);
					clientHdl.bufferedWriter.newLine();
					clientHdl.bufferedWriter.flush();
				}
			}catch(IOException e) {
				closeEverithing(socket, bufferedReader, bufferedWriter);
			}
		}
	}
	
	// Lorsque le client quitte le chat
	public void removeClientHandler() {
		clientHandlers.remove(this);
		broadCastMessage("SERVER: "+ clientUsername + " vient de quitter le chat");

	}
	
	public void closeEverithing(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
		removeClientHandler();
		try {
			if(bufferedReader!=null) {
				bufferedReader.close();
			}
			if(bufferedWriter!=null) {
				bufferedWriter.close();
			}
			if(socket!=null) {
				socket.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
}
