package com.kh.collection.part02_set.run;

import java.util.TreeSet;

import com.kh.collection.part02_set.controller.TestHashSet;
import com.kh.collection.part02_set.controller.TestLinkedHashSet;
import com.kh.collection.part02_set.controller.TestTreeSet;

public class Run {
	public static void main(String[] args) {
		//new TestHashSet().testHashSet();
		//new TestLinkedHashSet().testLinkedHashSet();
		new TestTreeSet().testTreeSet();
	}
}
