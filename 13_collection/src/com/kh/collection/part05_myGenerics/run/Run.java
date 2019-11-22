package com.kh.collection.part05_myGenerics.run;

import com.kh.collection.part05_myGenerics.controller.TestMyGenerics;

public class Run {

	public static void main(String[] args) {
		String[] sarr = {"apple", "melon", "banana", "grape"};
		TestMyGenerics<String> my = new TestMyGenerics<String>(sarr);
		my.output();
		
		Integer[] iarr = {11,22,33,44,55};
		TestMyGenerics<Integer> my2 = new TestMyGenerics<Integer>(iarr);
		my2.output();

	}

}











