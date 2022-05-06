package gichetAutomatique;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RhFrame extends JFrame {

	private static final int NUMBER_OF_BUTTONS = 3;
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	private static final int MARGING = 20;
	private static final int H_GAP = 30;
	private static final int V_GAP = 10;

	public RhFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Interface de gestion des resources humaines");
        setFont(new Font("SansSerif", Font.PLAIN, 14));

		// North's panel for label and text field
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridBagLayout());
		GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gridConst = new GridBagConstraints();
        setLayout(gridBag);
        gridConst.fill = GridBagConstraints.CENTER;
        gridConst.weightx = 1.0;
        gridConst.gridx=0;
        gridConst.gridy=0;
		// North's Labels
		// Declare the required Labels and textField
		JLabel numLabel = new JLabel("No:");
		gridBag.setConstraints(numLabel, gridConst);
         add(numLabel);
		JLabel secondNameLabel = new JLabel("Nom:");
		gridConst.gridx=0;
        gridConst.gridy=1;
        gridBag.setConstraints(numLabel, gridConst);
        add(secondNameLabel);
		JTextField secondNameTxt = new JTextField(MARGING);
		gridConst.gridx=1;
        gridConst.gridy=1;
        gridBag.setConstraints(numLabel, gridConst);
        add(secondNameTxt);
		JLabel firstNameLabel = new JLabel("Prenom:");
		JTextField firstNameTxt = new JTextField(MARGING);
		JLabel oldLabel = new JLabel("Age:");
		JTextField yearTxt = new JTextField(MARGING);
		
		

		pack();
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
