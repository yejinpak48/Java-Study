package com.kh.silsub1.member.controller;

import com.kh.silsub1.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		
		//���� ��� ��ü�� �� ���
		//�⺻�����ڸ� ȣ���Ͽ� ��ü�� �����ϰ� �Ǹ�
		//JVM�� ������ �⺻������ �ʱ�ȭ�� �ȴ�.
		System.out.println("memberId : " + m.getMemberId());
		System.out.println("memberPwd : " + m.getMemberPwd());
		System.out.println("memberName : " + m.getMemberName());
		System.out.println("age : " + m.getAge());
		System.out.println("gender : " + m.getGender());
		System.out.println("phone : " + m.getPhone());
		System.out.println("email : " + m.getEmail());
		
		//setter�� �� ����
		m.setMemberId("user01");
		m.setMemberPwd("pass01");
		m.setMemberName("ȫ�浿");
		m.setAge(20);
		m.setGender('M');
		m.setPhone("010-7660-7771");
		m.setEmail("hong123@kh.or.kr");
		
		//getter�� ����� �� ���
		System.out.println("���� �� memberId : " + m.getMemberId());
		System.out.println("���� �� memberPwd : " + m.getMemberPwd());
		System.out.println("���� �� memberName : " + m.getMemberName());
		System.out.println("���� �� age : " + m.getAge());
		System.out.println("���� �� gender : " + m.getGender());
		System.out.println("���� �� phone : " + m.getPhone());
		System.out.println("���� �� email : " + m.getEmail());
		
	}

}






















