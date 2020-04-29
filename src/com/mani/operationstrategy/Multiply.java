package com.mani.operationstrategy;

public class Multiply implements Strategy{

	@Override
	public void operation(int a, int b) {

		System.out.println("Multiply Result of a and b is " + (a * b));
	}

}
