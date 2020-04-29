package com.mani.strategypattern;

public class MergeSortImplementation implements Strategy {

	@Override
	public void sort() {

		System.out.println("Sorting with quick sort");
	}

}
