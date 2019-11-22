package com.kh.collection.part02_set.controller;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
	//LinkedHashSet
	//저장 순서 유지 기능이 추가됨
	public void testLinkedHashSet() {
		LinkedHashSet hset = new LinkedHashSet();
		
		hset.add("java");
		hset.add(123);
		hset.add(45.67);
		hset.add(true);
		hset.add(new Date());
		
		System.out.println("hset : " + hset);
		
		//오름차순 정렬을 원하면 같은 클래스 타입일 때만 가능함
		LinkedHashSet hset2 = new LinkedHashSet();
		
		hset2.add("java");
		hset2.add("oracle");
		hset2.add("html");
		hset2.add("css");
		
		System.out.println("hset2 : " + hset2);
		
		TreeSet tset = new TreeSet(hset2);
		System.out.println("tset : " + tset);
		
		
		
	}
}



















