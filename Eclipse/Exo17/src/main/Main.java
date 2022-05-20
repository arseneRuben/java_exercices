package main;

import model.Counter;
import model.IObserver;
import view.ConsolObserver;
import view.SwingObserver;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		IObserver firstObserver = new SwingObserver("Ecouteur du compteur");
		ConsolObserver secondObserver = new ConsolObserver();
		c.addListener(firstObserver);
		c.addListener(secondObserver);
		Thread ct = new Thread(c);
		ct.start();
	}

}
