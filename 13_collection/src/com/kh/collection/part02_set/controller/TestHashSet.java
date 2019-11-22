package com.kh.collection.part02_set.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		HashSet hset = new HashSet();
		
		//다형성 적용하여 생성 가능
		Set hset2 = new HashSet();
		Collection hset3 = new HashSet();
		
		hset.add(new String("java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		hset.add(new Date());
		
		//저장 순서 유지 안됨
		System.out.println("hset : " + hset);
		
		//중복 허용 안함
		hset.add(new String("java"));
		hset.add(new Integer(123));
		
		System.out.println("hset : " + hset);
		
		System.out.println("저장된 객체 수 : " + hset.size());
		System.out.println("포함확인 : " + hset.contains(new Integer(123)));
		
		
		//저장된 객체를 하나씩 꺼내는 기능이 없음
		//해결방법
		//1. toArray()메소드로 배열로 바꾸고 for loop 사용
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		//2. Iterator()로 목록 만들어서 연속 처리
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hset.clear();
		System.out.println("empty? : " + hset.isEmpty());
	}
}
















