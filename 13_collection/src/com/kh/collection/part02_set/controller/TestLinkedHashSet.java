package com.kh.collection.part02_set.controller;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestLinkedHashSet {
	//LinkedHashSet
	//���� ���� ���� ����� �߰���
	public void testLinkedHashSet() {
		LinkedHashSet hset = new LinkedHashSet();
		
		hset.add("java");
		hset.add(123);
		hset.add(45.67);
		hset.add(true);
		hset.add(new Date());
		
		System.out.println("hset : " + hset);
		
		//�������� ������ ���ϸ� ���� Ŭ���� Ÿ���� ���� ������
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



















