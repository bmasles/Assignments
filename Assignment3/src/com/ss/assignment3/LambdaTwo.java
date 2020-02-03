package com.ss.assignment3;

import java.util.ArrayList;
import java.util.List;

public class LambdaTwo {
	List<Integer> arr = new ArrayList<Integer>();

	public LambdaTwo() {
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
	}
	
	public StringBuilder oddEvenString() {
		StringBuilder str = new StringBuilder();
		arr.forEach(num -> {
			if (num % 2 == 0)
				str.append(",e" + num);
			else
				str.append(",o" + num);
		});
		return str;
	}

	public static void main(String[] args) {
		LambdaTwo lbTwo = new LambdaTwo();
		System.out.println(lbTwo.oddEvenString());
	}

}
