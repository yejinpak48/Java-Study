package com.kh.collection.part03_map.hashMap.controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public void testHashMap() {
		//HashMap Test
		HashMap hmap = new HashMap();
		Map hmap2 = new HashMap();
		
		//Ű�� ���� ������ �����Ѵ�.
		//Ű�� ���� �Ѵ� �ݵ�� ��ü���� �Ѵ�.
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		//autoBoxing ó���� : 12 -> new Integer(12)
		
		System.out.println("hmap : " + hmap);
		
		//Ű�� �ߺ� �������� ����(set) : �ֱ� Ű�� override��(���)
		hmap.put(12, "yellow banana");
		
		System.out.println("hmap : " + hmap);
		
		//�� ��ü ������ �ߺ� �����
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
		
		System.out.println("hmap : " + hmap);
		
		//�� ��ü�� ������ ������ ��
		System.out.println("Ű 9�� ���� ��ü : " + hmap.get(9));
		
		//Ű ���� ������ ���� ó��
		hmap.remove(9);
		System.out.println("hmap : " + hmap);
		
		//����� ��ü ���� Ȯ���� ��
		System.out.println("hmap�� ����� ��ü �� : " + hmap.size());
		
	}
	
	public void testHashMap2() {
		//Map�� ����� ��ü ���� ���� ó�� �׽�Ʈ
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("one", "java 8");
		hmap.put("two", "oracle 11g");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		System.out.println("hmap : " + hmap);
		
		//1. keySet()�� �̿��ؼ� Ű�� ���� set���� �����
		//iterator()�� Ű�� ���� ��� ����
		/*Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();*/
		
		Iterator keyIter = hmap.keySet().iterator();
		
		while(keyIter.hasNext()) {
			String key = (String) keyIter.next();
			String value = hmap.get(key);
			System.out.println(key + " = " + value);
		}
		
		//2. ����� value��ü�鸸 values()�� Collection���� ����
		Collection values = hmap.values();
		
		//2-1. iterrator()�� ��� ���� ó��
		Iterator valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		//2-2. �迭�� ���� ó��
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}
		
		//3. Map�� ����Ŭ���� EntrySet�� �̿� : entrySet()
		Set<Map.Entry<String, String>> set = hmap.entrySet();
		//entry : Ű ��ü�� �� ��ü�� ������ ���� ��
		
		Iterator<Map.Entry<String, String>> entryIter = 
				set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}






















