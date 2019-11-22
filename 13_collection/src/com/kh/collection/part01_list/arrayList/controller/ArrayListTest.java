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
		
		//ArrayList�� ��ü�� �����ϰ� �Ǹ� ���������� 10ĭ¥�� �迭�� �����Ѵ�.
		ArrayList alist = new ArrayList();
		
		List list = new ArrayList();
		Collection clist = new ArrayList();	
		
		//arrayList�� ���� ������ �����Ǹ� index(����)�� ����ȴ�.
		//arrayList�� ��ü�� ������ �� �ִ�.
		alist.add("apple");
		/*alist.add(new Integer(123));*/
		alist.add(123);		//autoBoxingó����(�� -> ��ü)
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist : " + alist);
		
		//���� �迭�� �ε����� �����Ǿ� �ֱ� ������ for�����ε� ���� �����ϴ�.
		//arrayList�� ����� ��ü ���� size()�޼ҵ�� Ȯ���� �� �ִ�.
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//ArrayList�� �������� �ߺ� ������ ����Ѵ�.
		alist.add("apple");
		System.out.println("alist : " + alist);
		
		//���ϴ� �ε��� ��ġ�� ��ü �߰�
		alist.add(1, "banana");
		System.out.println("alist : " + alist);
		
		//����� ��ü�� ������ �� remove() �޼ҵ带 ����Ѵ�.
		alist.remove(2);
		System.out.println("alist : " + alist);
		
		//������ ��ġ�� ��ü�� ������ ������ �ε����� Ȱ���� �� �ִ�.
		//set()�޼ҵ带 ����Ѵ�.
		alist.set(1, new Boolean(true));
		System.out.println("alist : " + alist);
	}
	
	public void testArrayListSort() {
		//ArrayList�� �������� ������ �� �� �ֵ��� sort() �޼ҵ带 ����� �� �ִ�.
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("mango");
		list.add("grape");
		
		System.out.println("list : " + list);
		
		Collections.sort(list);
		//sort()�޼ҵ带 ����ϸ� list�� �������� ���� ó���� �� ���Ļ��¸� �����Ѵ�.
		
		System.out.println("listSort : " + list);
		
		//�������� ����
		Iterator dIter = new LinkedList(list).descendingIterator();
		
		/*while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		//�ѹ� ������ �ٽ� �� �� ����.
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






















