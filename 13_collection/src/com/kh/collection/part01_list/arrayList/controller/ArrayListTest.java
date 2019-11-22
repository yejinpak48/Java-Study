package com.kh.collection.part01_list.arrayList.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public void testArrayList() {
		//ArrayList test
		
		//ArrayList는 객체를 생성하게 되면 내부적으로 10칸짜리 배열을 생성한다.
		ArrayList alist = new ArrayList();
		
		List list = new ArrayList();
		Collection clist = new ArrayList();	
		
		//arrayList는 저장 순서가 유지되며 index(순번)이 적용된다.
		//arrayList는 객체만 저장할 수 있다.
		alist.add("apple");
		/*alist.add(new Integer(123));*/
		alist.add(123);		//autoBoxing처리됨(값 -> 객체)
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist : " + alist);
		
		//내부 배열에 인덱스가 지정되어 있기 때문에 for문으로도 접근 가능하다.
		//arrayList에 저장된 객체 수는 size()메소드로 확인할 수 있다.
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//ArrayList는 데이터의 중복 저장을 허용한다.
		alist.add("apple");
		System.out.println("alist : " + alist);
		
		//원하는 인덱스 위치에 객체 추가
		alist.add(1, "banana");
		System.out.println("alist : " + alist);
		
		//저장된 객체를 삭제할 때 remove() 메소드를 사용한다.
		alist.remove(2);
		System.out.println("alist : " + alist);
		
		//지정된 위치의 객체를 수정할 때에도 인덱스를 활용할 수 있다.
		//set()메소드를 사용한다.
		alist.set(1, new Boolean(true));
		System.out.println("alist : " + alist);
	}
	
	public void testArrayListSort() {
		//ArrayList는 오름차순 정렬을 할 수 있도록 sort() 메소드를 사용할 수 있다.
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println("list : " + list);
		
		Collections.sort(list);
		//sort()메소드를 사용하면 list가 오름차순 정렬 처리된 후 정렬상태를 유지한다.
		
		System.out.println("listSort : " + list);
		
		//내림차순 정렬
		Iterator dIter = new LinkedList(list).descendingIterator();
		
		/*while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		//한번 꺼내면 다시 쓸 수 없다.
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}*/
		
		ArrayList descList = new ArrayList();
		
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		
		System.out.println("descList : " + descList);
		
		
	}
}






















