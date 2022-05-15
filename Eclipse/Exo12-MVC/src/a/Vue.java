package a;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vue extends JFrame implements ActionListener {
	private Controlleur leControlleur;
	private int valeur;
	private JTextField tfValeur;
	private JLabel resultLabel;
	// Les paramettre de la vue
	private final static int GAUCHE = 300;
	private final static int HAUT = 100;
	private final static int LONGUEUR = 800;
	private final static int HAUTEUR = 600;
	private final static Font FONT = new Font("courrier", Font.BOLD, 18);

	private void ajouterLabel(String texte) {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel(texte);
		lbl.setFont(Vue.FONT);
		pnl.add(lbl);
		this.add(pnl);
	}

	private void ajouterBouton(JPanel pnl, String texte) {
		JButton btn = new JButton(texte);
		btn.setFont(Vue.FONT);
		btn.addActionListener(this);
		pnl.add(btn);
	}

	public void setControlleur(Controlleur unCtrl) {
		this.leControlleur = unCtrl;
	}

	public int getValeur() {
		return this.valeur;
	}

	public void afficherResultat(int r) {
		resultLabel.setText(r+"");
	}

	public Vue() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(Vue.GAUCHE, Vue.HAUT);
		this.setSize(Vue.LONGUEUR, Vue.HAUTEUR);
		this.setLayout(new GridLayout(3, 1));

		this.ajouterLabel("Saisissez votre nombre");
		JPanel pnl;
		pnl = new JPanel();
		
		this.tfValeur = new JTextField(10);
		this.setFont(Vue.FONT);
		pnl = new JPanel();
		pnl.add(tfValeur);
		this.add(pnl);
		
		this.ajouterBouton(pnl, "Go");
		this.resultLabel = new JLabel("Resultats");
		this.resultLabel.setFont(Vue.FONT);
		pnl = new JPanel();
		pnl.add(this.resultLabel);
		this.add(pnl);
		
		

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.valeur = Integer.valueOf(this.tfValeur.getText());
		this.leControlleur.action();
	}

}
