package gichetAutomatique;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;


public class Guichet extends JFrame {
	private static final int NUMBER_OF_BUTTONS = 3;
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private static final int H_GAP = 30;
	private static final int V_GAP = 10;

	public Guichet() {

		// Create frame with title ATM
		
		setTitle("Guichet automatique");
        setFont(new Font("SansSerif", Font.PLAIN, 14));


		// North's panel for label and text field
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3, 1,  V_GAP,H_GAP));

		// North's Labels 
		// Declare the required Labels
		JLabel soldeLabel = new JLabel("Solde");
		JLabel valueLabel = new JLabel("0.0");
		// Declare Text fields
		JTextField soldeTxt = new JTextField(20);
		northPanel.add(soldeLabel);
		northPanel.add(valueLabel);
		northPanel.add(soldeTxt);
		// add north panel to content pane which by default uses border layout
		getContentPane().add(northPanel, BorderLayout.NORTH);

		// Center panel for buttons
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(NUMBER_OF_BUTTONS, 1, V_GAP,H_GAP));

		// Create our buttons
		JButton depositButton = new JButton("Depot");
		depositButton.setSize(WIDTH-H_GAP,HEIGHT-V_GAP);
		JButton withdrawalButton = new JButton("Retrait");
		JButton exitButton = new JButton("Quitter");

		// add components (buttons) to buttons panel
		buttonsPanel.add(depositButton);
		buttonsPanel.add(withdrawalButton);
		buttonsPanel.add(exitButton);
		
		// add buttons panel to content pane which by default uses border layout
		getContentPane().add(buttonsPanel, BorderLayout.CENTER);

		// south panel for result pannel
		JPanel southPanel = new JPanel();
		JLabel resultLabel = new JLabel("Aucune transaction effectuee");
		southPanel.add(resultLabel);
		// add south panel to content pane which by default uses border layout
		getContentPane().add(southPanel, BorderLayout.SOUTH);

		
		
		pack();
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}



}
