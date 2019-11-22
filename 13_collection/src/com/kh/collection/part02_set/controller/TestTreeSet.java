package com.kh.collection.part02_set.controller;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public void testTreeSet() {
		//TreeSet test
		//자동 오름차순 정렬 기능이 내장되어 있음
		TreeSet tset = new TreeSet();
		Set tset2 = new TreeSet();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("html");
		tset.add("css");
		
		//자동 오름차순 정렬함
		System.out.println(tset);
		
		Iterator tIter = tset.iterator();
		
		while(tIter.hasNext()) {
			System.out.println(((String) tIter.next()).toUpperCase());
		}
	}
}

















