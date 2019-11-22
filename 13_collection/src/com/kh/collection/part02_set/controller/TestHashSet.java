package com.kh.collection.part02_set.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		HashSet hset = new HashSet();
		
		//������ �����Ͽ� ���� ����
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		hset.add(new Date());
		
		//���� ���� ���� �ȵ�
		System.out.println("hset : " + hset);
		
		//�ߺ� ��� ����
		hset.add(new String("java"));
		hset.add(new Integer(123));
		
		System.out.println("hset : " + hset);
		
		System.out.println("����� ��ü �� : " + hset.size());
		System.out.println("����Ȯ�� : " + hset.contains(new Integer(123)));
		
		
		//����� ��ü�� �ϳ��� ������ ����� ����
		//�ذ���
		//1. toArray()�޼ҵ�� �迭�� �ٲٰ� for loop ���
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		//2. Iterator()�� ��� ���� ���� ó��
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
	}
}
















