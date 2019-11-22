package com.kh.silsub3.member.controller;

import java.util.Scanner;

import com.kh.silsub3.member.model.vo.Member;

public class MemberManager {
	Scanner sc = new Scanner(System.in);

	//상수 선언
	public static final int SIZE = 10;
	private int memberCount = 0;
	int i = 0;
	public static Member[] mar = new Member[10];


	public void memberInput() {
		// 새 회원 등록 (객체 배열 사용)

		while(i < mar.length){		
			mar[i] = new Member();

			System.out.print((i+1) + "번째 아이디 : ");
			mar[i].setId(sc.next());
			System.out.print("패스워드 : ");
			mar[i].setPassword(sc.next());
			System.out.print("이름 : ");
			mar[i].setName(sc.next());
			System.out.print("이메일 : ");
			mar[i].setEmail(sc.next());
			System.out.print("성별(남/여) : ");
			mar[i].setGender(sc.next().charAt(0));
			System.out.print("나이 : ");
			mar[i].setAge(sc.nextInt());
			System.out.print("회원 정보가 정상적으로 저장되었습니다.");
			System.out.print("\n" + "추가로 다른 회원 정보를 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);  i++;
			if(ch == 'n' || ch == 'n') return;	
		}
	}
	//회원 검색
	public int searchMemberId(String id){
		for(int i = 0; i < SIZE; i++){
			if(mar[i].getId().equals(id) ){
				return i;
			}	
		}return -1;	
	}

	public int searchMemberName(String name) {
		for(int i = 0; i < SIZE; i++){
			if(mar[i].getName().equals(name) ){
				return i;
			}	
		}return -1;	
	}

	public int searchMemberEmail(String email) {
		for(int i = 0; i < SIZE; i++){
			if(mar[i].getEmail().equals(email) ){
				return i;
			}	
		}return -1;	
	}

	public void deleteMember() {
		// 회원 삭제
		for(int i = 0; i < mar.length; i++){
			mar[i] = new Member();

		}
		System.out.println("모두 삭제 되었습니다.");
		i=i-i;
	}

	//회원 수 카운트
	public int memberCount(){
		memberCount = i;
		return memberCount;
	}

	public void printAllMember() {
		// 모두 출력		
		for(int c = 0; c < i; c++){
			System.out.println("회원 정보 : " + mar[c].memberInfo());

		}

	}
	public void printMember(int index) {
		// 한명출력
		System.out.println("회원정보 : " + mar[index].memberInfo());
	}
	public void sortIDAsc() {
		// 아이디 오름차순 정렬
		Member tmp[] = new Member[10];
		for(int c = 0; c < i-1; c++){
			for(int d = c +1; d < i; d++){
				int result = mar[c].getId().compareTo(mar[d].getId());
				if(result == 1) {
					tmp[0] = mar[c];
					mar[c] = mar[d];
					mar[d] = tmp[0];
				}
			}
		}
		for(int c = 0; c < i; c++){
			System.out.println(mar[c].memberInfo());
		}

	}
	public void sortIDDes() {
		// 아이디 내림차순 정렬
		Member tmp[] = new Member[10];
		for(int c = 0; c < i-1; c++){
			for(int d = c +1; d < i; d++){
				int result = mar[c].getId().compareTo(mar[d].getId());
				if(result != 1) {
					tmp[0] = mar[c];
					mar[c] = mar[d];
					mar[d] = tmp[0];
				}
			}
		}
		for(int c = 0; c < i; c++){
			System.out.println(mar[c].memberInfo());
		}
	}
	public void sortAgeAsc() {
		// 나이 오름차순 정렬
		Member tmp[] = new Member[10];
		for(int c = 0; c < i-1; c++){
			for(int d = c +1; d < i; d++){

				if(mar[c].getAge() > mar[d].getAge()) {
					tmp[0] = mar[c];
					mar[c] = mar[d];
					mar[d] = tmp[0];
				}
			}
		}
		for(int c = 0; c < i; c++){
			System.out.println(mar[c].memberInfo());
		}
	}
	public void sortAgeDes() {
		// 나이 내림차순 정렬
		Member tmp[] = new Member[10];
		for(int c = 0; c < i-1; c++){
			for(int d = c +1; d < i; d++){

				if(mar[c].getAge() < mar[d].getAge()) {
					tmp[0] = mar[c];
					mar[c] = mar[d];
					mar[d] = tmp[0];
				}
			}
		}
		for(int c = 0; c < i; c++){
			System.out.println(mar[c].memberInfo());
		}

	}
	public void sortGenderDes() {
		// 성별 내림차순 청렬
		Member tmp[] = new Member[10];
		for(int c = 0; c < i-1; c++){
			for(int d = c +1; d < i; d++){

				if(mar[c].getGender() < mar[d].getGender()) {
					tmp[0] = mar[c];
					mar[c] = mar[d];
					mar[d] = tmp[0];
				}
			}
		}
		for(int c = 0; c < i; c++){
			System.out.println(mar[c].memberInfo());
		}

	}
}
