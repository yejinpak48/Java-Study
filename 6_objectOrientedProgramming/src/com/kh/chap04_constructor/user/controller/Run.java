package com.kh.chap04_constructor.user.controller;

import java.util.Date;
import java.util.Scanner;

import com.kh.chap04_constructor.user.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		u1.information();
		
		User u2 = new User("user01", "pass01", "김진호");
		u2.information();
		
		User u3 = new User("user02", "pass02", "홍길동", new Date());
		u3.information();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String userPwd = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String userName = sc.nextLine();
		
		User u4 = new User(userId, userPwd, userName, new Date());
		u4.information();
	}

}

















