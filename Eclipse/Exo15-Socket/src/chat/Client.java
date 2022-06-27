package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	private Socket socket;
	private BufferedReader bufferedReader;
	private BufferedWriter bufferedWriter;
	private String username;
	
	public Client(Socket socket, String clientUsername) {
		try {
			this.socket = socket;
			this.bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.username = clientUsername;
		}catch(IOException e) {
			closeEverithing(socket, bufferedReader, bufferedWriter);
		}
		
	}
	
	
	public void sendMessage() {
		try {
			bufferedWriter.write(username);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			Scanner scann = new Scanner(System.in);
			while(socket.isConnected()) {
				String msgToSend = scann.nextLine();
				bufferedWriter.write(username+ ": "+msgToSend);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		}catch(IOException e) {
			closeEverithing(socket, bufferedReader, bufferedWriter);
		}
	}
	
	public void listenForMessage() {
		//Operation blocante
		// tout ca c'est un thead
		// ce thread est cree au moyen de l'interfce runable
		// pour mettre en oeuvre cet interface on doit implementer run
		new Thread (new Runnable() {
			public void run() {
				String msgFromGroupChat;
				while(socket.isConnected()) {
					try {
						msgFromGroupChat = bufferedReader.readLine();
						System.out.println(msgFromGroupChat);
					}catch(IOException e) {
						closeEverithing(socket, bufferedReader, bufferedWriter);
					}
				}
			}
		}).start(); /// c'est ainsi qu'on lance un thread
	}
	
	public void closeEverithing(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
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
	
	
	public static void main(String args[]) throws IOException {
		// corrige le main en 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your username for the group chat: ");
		String username = scanner.nextLine();
		
		Socket socket = new Socket("localhost",1234);
		Client client = new Client(socket, username);
		
		client.listenForMessage();
		client.sendMessage();
		
	}
	
	
	

}
