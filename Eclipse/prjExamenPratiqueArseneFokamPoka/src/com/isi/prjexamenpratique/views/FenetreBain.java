package com.isi.prjexamenpratique.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Bain;
import model.NiveauListener;
import model.SalleDeBain;

public class FenetreBain extends JFrame implements ActionListener , NiveauListener{

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
	private SalleDeBain salle;

	public FenetreBain(SalleDeBain salle) {
		
		// set le look and feel de l'OS
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.salle = salle;
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

		// Ajout des ecouteurs sur les boutons
		btMettreBouchon.addActionListener(this);
		btEneleverBouchon.addActionListener(this);
		btOuvrirEau.addActionListener(this);
		btFermerEau.addActionListener(this);
		btQuitter.addActionListener(this);
		btChangerBain.addActionListener(this);
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
		lblCapacite.setText("Capacité : "+salle.getBain().getCapacite()+"");
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
		this.setTitle("Fenetre de bain");
		this.getContentPane().add(mainPanel);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public SalleDeBain getSalle() {
		return salle;
	}

	public void setSalle(SalleDeBain salle) {
		this.salle = salle;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btMettreBouchon) {
			this.salle.getBain().mettreBouchon();
		}
		if (e.getSource() == btEneleverBouchon) {
			this.salle.getBain().enleverBouchon();
		}
		if (e.getSource() == btFermerEau) {
			this.salle.getBain().fermerRobinet();
		}
		if (e.getSource() == btOuvrirEau) {
			this.salle.getBain().ouvrirRobinet();
		}
		if (e.getSource() == btQuitter) {
			this.setVisible(false);
			this.dispose();
			this.salle.getBain().stop();
		}
		if (e.getSource() == btChangerBain) {
			this.setVisible(false);
			this.dispose();
			this.salle.getBain().stop();
			new FenetreConfiguration();
		
		}

	}

	@Override
	public void changeNiveau(double e) {
		// TODO Auto-generated method stub
		lblNiveau.setText("Niveau "+e);
		
		this.progress.setValue((int) Math.round(e));
	}

}
