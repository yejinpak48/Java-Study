package com.kh.silsub4.member.controller;

import java.util.Scanner;

import com.kh.silsub4.member.model.vo.Member;


public class MemberManager {
	private static Member m[] = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);

	public void insertMember() {
		System.out.print("���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		System.out.print("�н����带 �Է��ϼ��� : ");
		String userPwd = sc.nextLine();
		System.out.print("�̸��� �Է��ϼ��� : ");
		String userName = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸����� �Է��ϼ��� : ");
		sc.nextLine();
		String email = sc.nextLine();
		
		m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
		
		ctn++;
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		
	}

	public void searchId() {
		boolean result = false;
		
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.println("======== �˻��� ȸ�� ���� ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		}
		
	}


	public void searchName() {
		boolean result = false;
		
		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserName().equals(userName)){
				result = true;
				System.out.println("======== �˻��� ȸ�� ���� ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public void searchEmail() {
		boolean result = false;
		
		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getEmail().equals(email)){
				result = true;
				System.out.println("======== �˻��� ȸ�� ���� ========");
				printOne(m[i]);
				System.out.println("=============================");
			}
		}
		
		if(result == false){
			System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		}
	}

	public void updatePwd() {
		boolean result = false;
		
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.print("�н����带 ������ ��й�ȣ�� �Է��ϼ��� : ");
				String userPwd = sc.nextLine();
				
				m[i].setUserPwd(userPwd);
				
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				
			}
		}
		
		if(result == false){
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public void updateName() {
		boolean result = false;
		
		System.out.print("�̸��� ������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				String userName = sc.nextLine();
				
				m[i].setUserName(userName);
				
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				
			}
		}
		
		if(result == false){
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public void updateEmail() {
		boolean result = false;
		
		System.out.print("�̸����� ������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.nextLine();
		
		for(int i = 0; i < ctn; i++){
			if(m[i].getUserId().equals(userId)){
				result = true;
				System.out.print("������ �̸����� �Է��ϼ��� : ");
				String email = sc.nextLine();
				
				m[i].setEmail(email);
				
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
				
			}
		}
		
		if(result == false){
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
		}
		
	}

	public void deleteOne() {
		boolean result = false;
		
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
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
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
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
		
		System.out.println("��ü ȸ���� ���� �Ϸ� �Ǿ����ϴ�.");
		
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
