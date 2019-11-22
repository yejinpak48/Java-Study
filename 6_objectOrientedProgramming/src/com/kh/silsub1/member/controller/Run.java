package com.kh.silsub1.member.controller;

import com.kh.silsub1.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		
		//현재 멤버 객체의 값 출력
		//기본생성자를 호출하여 객체를 생성하게 되면
		//JVM이 지정한 기본값으로 초기화가 된다.
		System.out.println("memberId : " + m.getMemberId());
		System.out.println("memberPwd : " + m.getMemberPwd());
		System.out.println("memberName : " + m.getMemberName());
		System.out.println("age : " + m.getAge());
		System.out.println("gender : " + m.getGender());
		System.out.println("phone : " + m.getPhone());
		System.out.println("email : " + m.getEmail());
		
		//setter로 값 변경
		m.setMemberId("user01");
		m.setMemberPwd("pass01");
		m.setMemberName("홍길동");
		m.setAge(20);
		m.setGender('M');
		m.setPhone("010-7660-7771");
		m.setEmail("hong123@kh.or.kr");
		
		//getter로 변경된 값 출력
		System.out.println("변경 후 memberId : " + m.getMemberId());
		System.out.println("변경 후 memberPwd : " + m.getMemberPwd());
		System.out.println("변경 후 memberName : " + m.getMemberName());
		System.out.println("변경 후 age : " + m.getAge());
		System.out.println("변경 후 gender : " + m.getGender());
		System.out.println("변경 후 phone : " + m.getPhone());
		System.out.println("변경 후 email : " + m.getEmail());
		
	}

}






















