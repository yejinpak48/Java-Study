package com.kh.objectArray.person.controller;

import com.kh.objectArray.person.model.vo.Person;

public class PersonManager {
	public void testObjectArray() {
		//�������� �������� �׽�Ʈ
		Person p = new Person("����ȣ", 20);
		System.out.println(p.showPersonInfo());
		System.out.println(p.hashCode());
		shallowCopyTest(p);
		System.out.println(p.showPersonInfo());
	}
	public void shallowCopyTest(Person p) {
		System.out.println(p.showPersonInfo());
		System.out.println(p.hashCode());
		
		p.setName("ȫ�浿");
		System.out.println(p.showPersonInfo());
	}
	
	public void testObjectArray2() {
		//��������ڸ� �̿��� ���� ���� �׽�Ʈ
		Person p1 = new Person("����ȣ", 20);
		System.out.println(p1.showPersonInfo());
		System.out.println(p1.hashCode());
		
		Person p2 = new Person(p1);
		System.out.println(p2.showPersonInfo());
		System.out.println(p2.hashCode());
		
		p2.setName("ȫ�浿");
		
		System.out.println(p2.showPersonInfo());
		System.out.println(p1.showPersonInfo());
	}
	
	public void testObjectArray3() {
		//��ü �迭�� ���۷��� ������ ���� �迭�̴�.
		Person[] parr = new Person[5];
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println(parr[i]);
		}
		
		//�� �ε������� ��ü�� �����ؼ� �����ؾ� �Ѵ�.
		parr[0] = new Person("ȫ�浿", 25, '��', 185.5, 75.3);
		parr[1] = new Person("�̼���", 44, '��', 193.5, 79.3);
		parr[2] = new Person("������", 16, '��', 160.3, 45.3);
		parr[3] = new Person("������", 38, '��', 195.5, 88.0);
		parr[4] = new Person("Ȳ����", 22, '��', 167.4, 48.5);
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println(parr[i].showPersonInfo());
			System.out.println(parr[i].hashCode());
		}
	}
	
	public void testObjectArrayInit() {
		//��ü �迭�� �Ҵ�� ���ÿ� �ʱ�ȭ �� �� �ִ�.
		Person[] parr = {
				new Person("ȫ�浿", 25),
				new Person("�Ż��Ӵ�", 40),
				new Person("������", 30),
				new Person("�Ӳ���", 44),
				new Person("������", 34)
		};
		
		System.out.println("�迭 ���� : " + parr.length);
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println("�̸� : " + parr[i].getName());
			System.out.println("���� : " + parr[i].getAge());
		}
	}
}


















