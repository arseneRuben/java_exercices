package com.isi.prjexamenpratique.views;

import java.awt.GridLayout;
import javax.swing.*;

public class FenetreBain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btMettreBouchon;
	private JButton btEneleverBouchon;
	private JButton btOuvrirEau;
	private JButton btFermerEau;
	private JLabel lblNiveau;
	private JLabel lblCapacite;
	private JProgressBar progress;
	private JButton btChangerBain;
	private JButton btQuitter;
	
	public FenetreBain(){
		
		// set le look and feel de l'OS
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// initialise les composants
		btMettreBouchon = new JButton("Mettre le bouchon");
		btEneleverBouchon = new JButton("Enlever le bouchon");
		btOuvrirEau = new JButton("Ouvrir l'eau");
		btFermerEau = new JButton("Fermer l'eau");
		lblNiveau = new JLabel("Niveau : 0");
		lblCapacite = new JLabel("Capacité : 0");
		progress = new JProgressBar();
		btChangerBain = new JButton("Changer le bain");
		btQuitter = new JButton("Quitter");
		
		// jpanels
		JPanel mainPanel = new JPanel(new GridLayout(6, 1));
		JPanel panelTitre = new JPanel();
		JPanel panelBouchon = new JPanel();
		JPanel panelEau = new JPanel();
		JPanel panelInfos = new JPanel();
		JPanel panelProgress = new JPanel();
		JPanel panelBas = new JPanel();
		
		// ajouter les controles aux jpanels
		panelTitre.add(new JLabel("Controllez votre bain"));
		panelBouchon.add(btMettreBouchon);
		panelBouchon.add(btEneleverBouchon);
		panelEau.add(btOuvrirEau);
		panelEau.add(btFermerEau);
		panelInfos.add(lblNiveau);
		panelInfos.add(lblCapacite);
		panelProgress.add(progress);
		panelBas.add(btChangerBain);
		panelBas.add(btQuitter);
		
		// panel principal
		mainPanel.add(panelTitre);
		mainPanel.add(panelBouchon);
		mainPanel.add(panelEau);
		mainPanel.add(panelInfos);
		mainPanel.add(panelProgress);
		mainPanel.add(panelBas);
		
		// set le jframe
		this.getContentPane().add(mainPanel);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
