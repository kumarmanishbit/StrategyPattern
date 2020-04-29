package com.mani.operationstrategy;

public class Add implements Strategy {

	@Override
	public void operation(int a, int b) {

		System.out.println("Add Result of a and b is " + (a + b));
	}

}
