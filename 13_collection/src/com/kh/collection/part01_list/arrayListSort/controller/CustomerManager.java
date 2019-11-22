package com.kh.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.comparator.AscendingName;
import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class CustomerManager {
	public void testArrayListSort() {
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("홍길동", 25, '남', 1250.5));
		list.add(new Customer("박문수", 33, '남', 3457.8));
		list.add(new Customer("김춘추", 38, '남', 2485.6));
		
		/*System.out.println("list : " + list);*/
		
		for(Customer obj : list) {
			System.out.println(obj);
		}
		
		//이름 오름차순 정렬
		list.sort(new AscendingName());
		
		System.out.println("이름 오름차순 정렬 =====================");
		for(Customer c : list) {
			System.out.println(c);
		}
		
		//나이 오름차순 정렬
		list.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Customer cob1 = (Customer) o1;
				Customer cob2 = (Customer) o2;
				
				int result = 0;
				
				if(cob1.getAge() == cob2.getAge()) {
					result = 0;
				}
				if(cob1.getAge() > cob2.getAge()) {
					result = 1;
				}
				if(cob1.getAge() < cob2.getAge()) {
					result = -1;
				}
				
				return result;
			}
			
		});
		
		System.out.println("나이순 오름차순 정렬 ==================");
		for(Customer c : list) {
			System.out.println(c);
		}
		
		//성별순 오름차순 정렬
		
		//포인트 순 오름차순 정렬
		
		//이름순 내림차순 정렬
		
		//나이 순 내림차순 정렬
		
		//성별 순 내림차순 정렬
		
		//포인트 순 내림차순 정렬
		
		
		
	}
}

















