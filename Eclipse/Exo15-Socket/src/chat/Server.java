package chat;
/*
import java.io.DataInputStream;
import java.io.DataOutputStream;+*/

// C'est la solution que j'ai muri ce weekend
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
*/
public class Server {
	private ServerSocket serverSocket;
	
	public Server(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}
	
	public void startServer() {
		try {
			while(!serverSocket.isClosed()) {
			Socket socket = 	serverSocket.accept();
			System.out.println(" A new client has  connected!");
			ClientHandler clientHandler = new ClientHandler(socket);
			Thread thread = new Thread(clientHandler);
			thread.start();
			}
		}catch(IOException e) {
			
		}
	}

	public void closeServerSocket() {
		try {
			if(serverSocket!= null) {
				serverSocket.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

	public static void main(String args[]) throws IOException {
		ServerSocket serverSocket = new ServerSocket(1234);// c'est le numero de port
		// Le server sera cree avec ce socket serveur la
		Server server = new Server(serverSocket);
		server.startServer();
		// Les client se connecteront au serveur au moyen de l'adress serveur et le meme num de port  
	}
	

}
