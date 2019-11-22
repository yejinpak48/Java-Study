package com.kh.objectArray.person.controller;

import com.kh.objectArray.person.model.vo.Person;

public class PersonManager {
	public void testObjectArray() {
		//얕은복사 깊은복사 테스트
		Person p = new Person("김진호", 20);
		System.out.println(p.showPersonInfo());
		System.out.println(p.hashCode());
		shallowCopyTest(p);
		System.out.println(p.showPersonInfo());
	}
	public void shallowCopyTest(Person p) {
		System.out.println(p.showPersonInfo());
		System.out.println(p.hashCode());
		
		p.setName("홍길동");
		System.out.println(p.showPersonInfo());
	}
	
	public void testObjectArray2() {
		//복사생성자를 이용한 깊은 복사 테스트
		Person p1 = new Person("김진호", 20);
		System.out.println(p1.showPersonInfo());
		System.out.println(p1.hashCode());
		
		Person p2 = new Person(p1);
		System.out.println(p2.showPersonInfo());
		System.out.println(p2.hashCode());
		
		p2.setName("홍길동");
		
		System.out.println(p2.showPersonInfo());
		System.out.println(p1.showPersonInfo());
	}
	
	public void testObjectArray3() {
		//객체 배열은 레퍼런스 변수에 대한 배열이다.
		Person[] parr = new Person[5];
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println(parr[i]);
		}
		
		//각 인덱스별로 객체를 생성해서 대입해야 한다.
		parr[0] = new Person("홍길동", 25, '남', 185.5, 75.3);
		parr[1] = new Person("이순신", 44, '남', 193.5, 79.3);
		parr[2] = new Person("유관순", 16, '여', 160.3, 45.3);
		parr[3] = new Person("김유신", 38, '남', 195.5, 88.0);
		parr[4] = new Person("황진이", 22, '여', 167.4, 48.5);
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println(parr[i].showPersonInfo());
			System.out.println(parr[i].hashCode());
		}
	}
	
	public void testObjectArrayInit() {
		//객체 배열도 할당과 동시에 초기화 할 수 있다.
		Person[] parr = {
				new Person("홍길동", 25),
				new Person("신사임당", 40),
				new Person("윤봉길", 30),
				new Person("임꺽정", 44),
				new Person("이율곡", 34)
		};
		
		System.out.println("배열 갯수 : " + parr.length);
		
		for(int i = 0; i < parr.length; i++) {
			System.out.println("이름 : " + parr[i].getName());
			System.out.println("나이 : " + parr[i].getAge());
		}
	}
}


















