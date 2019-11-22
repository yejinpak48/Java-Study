package com.kh.exception.part04_userException.controller;

import java.util.Scanner;

import com.kh.exception.part04_userException.exception.MyException;

public class MyExceptionTest {
	
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void checkAge(int age) throws MyException {
		if(age < 19) {
			throw new MyException("����Ұ�!");
		}else {
			System.out.println("��");
		}
	}
}


















