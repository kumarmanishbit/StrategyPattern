package com.mani.operationstrategy;

public class OppManager {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(int a, int b) {
		this.strategy.operation(a, b);
	}

}
