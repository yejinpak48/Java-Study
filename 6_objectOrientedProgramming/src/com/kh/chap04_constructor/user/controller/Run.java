package com.kh.chap04_constructor.user.controller;

import java.util.Date;
import java.util.Scanner;

import com.kh.chap04_constructor.user.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		u1.information();
		
		User u2 = new User("user01", "pass01", "����ȣ");
		u2.information();
		
		User u3 = new User("user02", "pass02", "ȫ�浿", new Date());
		u3.information();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String userPwd = sc.nextLine();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String userName = sc.nextLine();
		
		User u4 = new User(userId, userPwd, userName, new Date());
		u4.information();
	}

}

















