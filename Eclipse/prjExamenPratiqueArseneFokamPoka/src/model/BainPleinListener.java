package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BainPleinListener implements NiveauListener{
	Socket socket;
	OutputStream os;
	public BainPleinListener() throws UnknownHostException, IOException {
		this.socket = new Socket("localhost", 2222);
		this.os = socket.getOutputStream();

	}

	@Override
	public void changeNiveau(double e) {
		if(e==225) {
			OutputStreamWriter osr = new OutputStreamWriter(this.os);
			BufferedWriter br = new BufferedWriter(osr);
			try {
				osr.write("Votre bain est plein");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
