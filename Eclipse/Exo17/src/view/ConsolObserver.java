package view;

import model.IObserver;

public class ConsolObserver implements IObserver {

	public void changeCounter(int value) {
		System.out.println(value);

	}

}
