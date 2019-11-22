package com.kh.silsub4.member.controller;

import java.util.Scanner;

import com.kh.silsub4.member.model.vo.Member;


public class MemberManager {
	private static Member m[] = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);

	public void insertMember() {
		System.out.print("아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		System.out.print("패스워드를 입력하세요 : ");
		String userPwd = sc.nextLine();
		System.out.print("이름을 입력하세요 : ");
		String userName = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일을 입력하세요 : ");
		sc.nextLine();
		String email = sc.nextLine();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		
		ctn++;
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		
	}

	public void searchId() {
		boolean result = false;
		
		System.out.print("검색할 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.println("======== 검색된 회원 정보 ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		}
		
	}


	public void searchName() {
		boolean result = false;
		
		System.out.print("검색할 이름을 입력하세요 : ");
		String userName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserName().equals(userName)){
				result = true;
				System.out.println("======== 검색된 회원 정보 ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		}
		
	}

	public void searchEmail() {
		boolean result = false;
		
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getEmail().equals(email)){
				result = true;
				System.out.println("======== 검색된 회원 정보 ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		}
	}

	public void updatePwd() {
		boolean result = false;
		
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.print("패스워드를 변경할 비밀번호를 입력하세요 : ");
				String userPwd = sc.nextLine();
				
				m[i].setUserPwd(userPwd);
				
				System.out.println("패스워드 수정이 완료되었습니다.");
				
			}
		}
		
		if(result == false){
			System.out.println("수정할 회원 정보가 존재하지 않습니다.");
		}
		
	}

	public void updateName() {
		boolean result = false;
		
		System.out.print("이름을 변경할 회원의 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				
				System.out.print("수정할 이름을 입력하세요 : ");
				String userName = sc.nextLine();
				
				m[i].setUserName(userName);
				
				System.out.println("이름 수정이 완료되었습니다.");
				
			}
		}
		
		if(result == false){
			System.out.println("수정할 회원 정보가 존재하지 않습니다.");
		}
		
	}

	public void updateEmail() {
		boolean result = false;
		
		System.out.print("이메일을 변경할 회원의 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.print("수정할 이메일을 입력하세요 : ");
				String email = sc.nextLine();
				
				m[i].setEmail(email);
				
				System.out.println("이메일 수정이 완료되었습니다.");
				
			}
		}
		
		if(result == false){
			System.out.println("수정할 회원 정보가 존재하지 않습니다.");
		}
		
	}

	public void deleteOne() {
		boolean result = false;
		
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				m[i] = m[i+1];
				for(int j = i; j < ctn-1; j++){
					m[j] = m[j+1];
				}
				
			}
		}
		
		
		if(result == false){
			System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
		}else{
			ctn = ctn - 1;
		}
		
	}

	public void deleteAll() {
		for(int i = 0; i < ctn; i++){
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setAge(0);
			m[i].setGender(' ');
			m[i].setEmail(null);
		}
		ctn = 0;
		
		System.out.println("전체 회원이 삭제 완료 되었습니다.");
		
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i++){
			System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + ", " + m[i].getUserName() + ", " + m[i].getAge() + ", " + m[i].getGender() + ", " + m[i].getEmail());
		}
	}
	private void printOne(Member m) {
		System.out.println(m.getUserId() + ", " + m.getUserPwd() + ", " + m.getUserName() + ", " + m.getAge() + ", " + m.getGender() + ", " + m.getEmail());
		
	}

}
