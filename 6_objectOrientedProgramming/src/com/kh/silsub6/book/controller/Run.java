package com.kh.silsub6.book.controller;

import com.kh.silsub6.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.information();
		
		Book b2 = new Book("자바의 정석", "도우출판", "남궁성");
		b2.information();
		
		Book b3 = new Book("홍길동전", "활빈당", "허균", 5000000, 0.5);
		b3.information();

	}

}
