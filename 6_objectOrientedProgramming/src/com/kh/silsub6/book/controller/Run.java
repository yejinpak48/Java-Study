package com.kh.silsub6.book.controller;

import com.kh.silsub6.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.information();
		
		Book b2 = new Book("�ڹ��� ����", "��������", "���ü�");
		b2.information();
		
		Book b3 = new Book("ȫ�浿��", "Ȱ���", "���", 5000000, 0.5);
		b3.information();

	}

}
