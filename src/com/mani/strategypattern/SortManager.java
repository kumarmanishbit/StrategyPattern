package com.mani.strategypattern;

public class SortManager {

	public void sort(Strategy sortStrategy) {
		sortStrategy.sort();
	}

}
