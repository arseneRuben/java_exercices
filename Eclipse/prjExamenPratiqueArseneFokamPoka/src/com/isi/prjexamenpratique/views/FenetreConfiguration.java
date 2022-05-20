package com.isi.prjexamenpratique.views;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import exception.InvalideCapaciteException;
import model.Bain;
import model.NiveauListener;
import model.SalleDeBain;

public class FenetreConfiguration extends JFrame implements ActionListener {

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

	public FenetreConfiguration() {

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
		btOk.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ArrayList<NiveauListener> al = new ArrayList<NiveauListener>();

		try {
			Bain bain = new Bain(Double.parseDouble(this.txtCapacite.getText()), 0.0, true, true, al);
			SalleDeBain salle = new SalleDeBain(bain);
			FenetreBain fenetre = new FenetreBain(salle);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalideCapaciteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		this.setVisible(false);

	}

}
