package com.kh.collection.part01_list.arrayListSort.model.comparator;

import java.util.Comparator;

import com.kh.collection.part01_list.arrayListSort.model.vo.Customer;

public class AscendingName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Customer cob1 = (Customer) o1;
		Customer cob2 = (Customer) o2;
		
		//String Ŭ������ compareTo�� �̿�
		//���ڿ��� ���� ���Ͽ� ������������ �Ǿ� �ִ� ��� ������ �����ϰ�,
		//���ڿ��� ���� ������ 0��, ������������ �Ǿ� �ִ� ��� ����� �����Ѵ�.
		
		return cob1.getName().compareTo(cob2.getName());
	}

}















