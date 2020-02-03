package com.ss.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaThree {
	List<String> list = null;

	public LambdaThree() {
		list = new ArrayList<String>();
		list.add("abc");
		list.add("abcd");
		list.add("fabc");
		list.add("bac");
		list.add("ab");
		list.add("abb");
	}
	
	public List<String> aThreeLambda() {
		return list.stream().filter(e -> {
			if (e.charAt(0) == 'a' && e.length() == 3)
				return true;
			return false;
		}).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		LambdaThree lbThree = new LambdaThree();
		for (String str : lbThree.aThreeLambda())
			System.out.println(str);
	}

}
