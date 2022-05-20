package com.isi.prjexamenpratique.views;

import java.awt.GridLayout;
import javax.swing.*;

public class FenetreConfiguration extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtCapacite;
	private JLabel lblCapacite;
	private JButton btOk;
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				// point de départ de l'application
				new FenetreConfiguration();
			}
		});
		
	}
	
	public FenetreConfiguration(){
	
		// set le look and feel de l'OS
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// initialisation des composants
		lblCapacite = new JLabel("Capacité du bain : ");
		txtCapacite = new JTextField(4);
		btOk = new JButton("Ok");
		
		// panels
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JPanel mainPanel = new JPanel(new GridLayout(2, 1));
		
		// ajout des composants
		topPanel.add(lblCapacite);
		topPanel.add(txtCapacite);
		bottomPanel.add(btOk);
		
		// ajout des panels
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		
		// set le jframe
		this.getContentPane().add(mainPanel);
		this.setSize(220, 120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(this.getParent());
		this.setVisible(true);
		
	}

}
