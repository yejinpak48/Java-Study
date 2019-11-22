package com.kh.collection.part01_list.arrayListSort.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.comparator.AscendingName;
import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class CustomerManager {
	public void testArrayListSort() {
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("ȫ�浿", 25, '��', 1250.5));
		list.add(new Customer("�ڹ���", 33, '��', 3457.8));
		list.add(new Customer("������", 38, '��', 2485.6));
		
		/*System.out.println("list : " + list);*/
		
		for(Customer obj : list) {
			System.out.println(obj);
		}
		
		//�̸� �������� ����
		list.sort(new AscendingName());
		
		System.out.println("�̸� �������� ���� =====================");
		for(Customer c : list) {
			System.out.println(c);
		}
		
		//���� �������� ����
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
		
		System.out.println("���̼� �������� ���� ==================");
		for(Customer c : list) {
			System.out.println(c);
		}
		
		//������ �������� ����
		
		//����Ʈ �� �������� ����
		
		//�̸��� �������� ����
		
		//���� �� �������� ����
		
		//���� �� �������� ����
		
		//����Ʈ �� �������� ����
		
		
		
	}
}

















