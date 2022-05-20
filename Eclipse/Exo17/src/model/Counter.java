package model;

import java.util.ArrayList;

// Classe des ecoutes
public class Counter implements Runnable {
	private int counter = 0;
	private ArrayList<IObserver> listener = new ArrayList<IObserver>();

	private static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Counter() {

	}

	public void run() {
		while (true) {
			this.counter++;
			this.notification();
			wait(1000);
		}
	}

	public void notification() {
		for (IObserver i : this.listener) {
			i.changeCounter(this.counter);
		}
	}

	public void addListener(IObserver ob) {
		this.listener.add(ob);
	}
}
