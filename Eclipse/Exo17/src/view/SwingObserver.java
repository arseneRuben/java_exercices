package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import model.IObserver;

public class SwingObserver extends JFrame implements IObserver {
	public final static Font font = new Font("Consolas", Font.BOLD, 32);
	private JLabel counterLabel = new JLabel();
	
	public SwingObserver(String title) {
		super(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200, 200);
		this.setLocation(200,200);
		this.counterLabel.setFont(font);
		this.add(counterLabel);
		this.setVisible(true);
	}


	public void changeCounter(int valeur) {
		
		this.counterLabel.setText(" "+valeur);
	}

}
