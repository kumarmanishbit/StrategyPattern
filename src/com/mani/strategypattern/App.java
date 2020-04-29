package com.mani.strategypattern;

public class App {

	public static void main(String[] args) {

		
		SortManager manager = new SortManager();
		
		manager.sort(new QuickSortImplementation());
		
	}

}
