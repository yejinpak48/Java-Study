package com.kh.silsub3.member.main;

import com.kh.silsub3.member.view.MemberMenu;

public class Main {

	public static void main(String[] args) {
		// 메인 실행
		MemberMenu mMenu = new MemberMenu();
		mMenu.mainMenu();

		System.out.println("회원관리 프로그램을 종료합니다.");

	}

}
