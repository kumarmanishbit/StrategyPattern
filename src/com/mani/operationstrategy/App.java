package com.mani.operationstrategy;

public class App {

	public static void main(String[] args) {

		OppManager manager = new OppManager();

		manager.setStrategy(new Add());
		
		manager.execute(5, 3);
		// Add Result of a and b is 8
		
		manager.setStrategy(new Multiply());
		
		manager.execute(5, 3);
		// Multiply Result of a and b is 15

	}

}
