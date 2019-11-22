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
		
		//키와 값을 쌍으로 저장한다.
		//키와 값은 둘다 반드시 객체여야 한다.
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		//autoBoxing 처리됨 : 12 -> new Integer(12)
		
		System.out.println("hmap : " + hmap);
		
		//키는 중복 저장하지 않음(set) : 최근 키로 override됨(덮어씀)
		hmap.put(12, "yellow banana");
		
		System.out.println("hmap : " + hmap);
		
		//값 객체 저장은 중복 허용함
		hmap.put(11, "yellow banana");
		hmap.put(9, "yellow banana");
		
		System.out.println("hmap : " + hmap);
		
		//값 객체의 내용을 가져올 때
		System.out.println("키 9에 대한 객체 : " + hmap.get(9));
		
		//키 값을 가지고 삭제 처리
		hmap.remove(9);
		System.out.println("hmap : " + hmap);
		
		//저장된 객체 수를 확인할 때
		System.out.println("hmap에 저장된 객체 수 : " + hmap.size());
		
	}
	
	public void testHashMap2() {
		//Map에 저장된 객체 정보 연속 처리 테스트
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		hmap.put("one", "java 8");
		hmap.put("two", "oracle 11g");
		hmap.put("three", "jdbc");
		hmap.put("four", "html5");
		hmap.put("five", "css3");
		
		System.out.println("hmap : " + hmap);
		
		//1. keySet()을 이용해서 키만 따로 set으로 만들고
		//iterator()로 키에 대한 목록 만듦
		/*Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();*/
		
		Iterator keyIter = hmap.keySet().iterator();
		
		while(keyIter.hasNext()) {
			String key = (String) keyIter.next();
			String value = hmap.get(key);
			System.out.println(key + " = " + value);
		}
		
		//2. 저장된 value객체들만 values()로 Collection으로 만듦
		Collection values = hmap.values();
		
		//2-1. iterrator()로 목록 만들어서 처리
		Iterator valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		//2-2. 배열로 만들어서 처리
		Object[] valueArr = values.toArray();
		for(int i = 0; i < valueArr.length; i++) {
			System.out.println(i + " : " + valueArr[i]);
		}
		
		//3. Map의 내부클래스 EntrySet을 이용 : entrySet()
		Set<Map.Entry<String, String>> set = hmap.entrySet();
		//entry : 키 객체와 값 객체를 쌍으로 묶은 것
		
		Iterator<Map.Entry<String, String>> entryIter = 
				set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}






















