package com.ss.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lambda {
	List<String> arr = new ArrayList<String>();

	public lambda() {
		arr.add("Burke");
		arr.add("Egad");
		arr.add("Eric");
		arr.add("Flipe");
		arr.add("Melissa");
		arr.add("Molly");
	}
	
	private void reset() {
		arr.clear();
		arr.add("Burke");
		arr.add("Egad");
		arr.add("Eric");
		arr.add("Flipe");
		arr.add("Melissa");
		arr.add("Molly");
	}

	public void sortLambda() {
		Collections.sort(arr, Comparator.comparing(String::length));
		arr.forEach(e -> System.out.println(e));
		reset();
		System.out.println();
	}
	
	public void reverseLambda() {
		arr.sort(Comparator.comparing(String::length).reversed());
		arr.forEach(e -> System.out.println(e));
		reset();
		System.out.println();
	}
	
	public void firstLetterLambda() {
		arr.sort(Comparator.comparing(e -> e.charAt(0)));
		arr.forEach(e -> System.out.println(e));
		reset();
		System.out.println();
	}

	public static void main(String[] args) {
		lambda lb = new lambda();
		lb.sortLambda();
		lb.reverseLambda();
		lb.firstLetterLambda();
	}

}
