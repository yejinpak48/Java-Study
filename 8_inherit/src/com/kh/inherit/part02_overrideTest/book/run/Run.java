package com.kh.inherit.part02_overrideTest.book.run;

import com.kh.inherit.part02_overrideTest.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("수학의 정석", "나수학", 100);
		Book b2 = new Book("칭찬은 고래도 춤추게한다", "고래", 300);
		
		System.out.println("b1 = " + b1.toString());
		System.out.println("b2 = " + b2.toString());
		
		//.toString()은 객체 호출 시 자동으로 뒤에 JVM에 의해 생성된다.
		//따라서 객체의 값 확인을 위해 많이 오버라이딩 해서 쓴다.
		System.out.println("b1 = " + b1/*.toString()*/);
		System.out.println("b2 = " + b2);
		
		
		System.out.println("b1과 b2는 같은 객체인가? : " + b1.equals(b2));
		
		//b1이 가진 주소를 b3이라는 레퍼런스에 얕은 복사
		Book b3 = b1;
		
		System.out.println("b1과 b3은 같은 객체인가? : " + b1.equals(b3));
		
		Book b4 = new Book("수학의 정석", "나수학", 100);
		
		System.out.println("b1과 b4는 같은 객체인가? : " + b1.equals(b4));
		
		//값은 같지만 주소가 다른 객체를 동등 객체라고 하며
		//주소값까지 같은 객체를 동일 객체라고 한다.
		System.out.println("b1의 해쉬코드 : " + b1.hashCode());
		System.out.println("b4의 해쉬코드 : " + b4.hashCode());
	}

}














