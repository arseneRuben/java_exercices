package model;

import java.util.ArrayList;

import exception.InvalideCapaciteException;

public class Bain extends Thread {

	private double capacite;
	private double niveau;
	private boolean bouchonEnPlace;
	private boolean robinetOuvert;
	private ArrayList<NiveauListener> listeners = new ArrayList<NiveauListener>();

	public double getNiveau() {
		return niveau;
	}

	private void setNiveau(double niveau) {
		this.niveau = niveau;
		this.notification();
	}

	public double getCapacite() {
		return capacite;
	}

	public boolean isBouchonEnPlace() {
		return bouchonEnPlace;
	}

	public boolean isRobinetOuvert() {
		return robinetOuvert;
	}

	public Bain(double capacite, double niveau, boolean bouchonEnPlace, boolean robinetOuvert,
			ArrayList<NiveauListener> listeners) throws InvalideCapaciteException {
		if ((capacite < 125) || (capacite > 225))
			throw new InvalideCapaciteException();
		else {
			this.capacite = capacite;
			this.niveau = niveau;
			this.bouchonEnPlace = bouchonEnPlace;
			this.robinetOuvert = robinetOuvert;
			this.listeners = listeners;
		}
	}

	public void ouvrirRobinet() {
		this.robinetOuvert = true;
	}

	public void fermerRobinet() {
		this.robinetOuvert = true;
	}

	public void mettreBouchon() {
		this.bouchonEnPlace = true;
	}

	public void enleverBouchon() {
		this.bouchonEnPlace = false;
	}

	public void addNiveauListener(NiveauListener listener) {
		this.listeners.add(listener);
	}

	public void run() {
		while (true) {
			if (!this.bouchonEnPlace) {
				if (this.niveau - 1.3 >= 0) {
					this.setNiveau(this.niveau - 1.3);
				}
			}
			if (this.isRobinetOuvert()) {
				if (this.niveau + 1 >= 0) {
					this.setNiveau(this.niveau + 1);
				}
			}

			wait(500);
		}
	}

	private static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void notification() {
		for (NiveauListener i : this.listeners) {
			i.changeNiveau(this.niveau);
		}
	}
}
