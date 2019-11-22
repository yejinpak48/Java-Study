package com.kh.silsub3.member.controller;

import java.util.Scanner;

import com.kh.silsub3.member.model.vo.Member;

public class MemberManager {
	Scanner sc = new Scanner(System.in);

	//��� ����
	public static final int SIZE = 10;
	private int memberCount = 0;
	int i = 0;
	public static Member[] mar = new Member[10];


	public void memberInput() {
		// �� ȸ�� ��� (��ü �迭 ���)

		while(i < mar.length){		
			mar[i] = new Member();

			System.out.print((i+1) + "��° ���̵� : ");
			mar[i].setId(sc.next());
			System.out.print("�н����� : ");
			mar[i].setPassword(sc.next());
			System.out.print("�̸� : ");
			mar[i].setName(sc.next());
			System.out.print("�̸��� : ");
			mar[i].setEmail(sc.next());
			System.out.print("����(��/��) : ");
			mar[i].setGender(sc.next().charAt(0));
			System.out.print("���� : ");
			mar[i].setAge(sc.nextInt());
			System.out.print("ȸ�� ������ ���������� ����Ǿ����ϴ�.");
			System.out.print("\n" + "�߰��� �ٸ� ȸ�� ������ �Է��Ͻðڽ��ϱ�?(y/n) : ");
			char ch = sc.next().charAt(0);  i++;
			if(ch == 'n' || ch == 'n') return;	
		}
	}
	//ȸ�� �˻�
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
		// ȸ�� ����
		for(int i = 0; i < mar.length; i++){
			mar[i] = new Member();

		}
		System.out.println("��� ���� �Ǿ����ϴ�.");
		i=i-i;
	}

	//ȸ�� �� ī��Ʈ
	public int memberCount(){
		memberCount = i;
		return memberCount;
	}

	public void printAllMember() {
		// ��� ���		
		for(int c = 0; c < i; c++){
			System.out.println("ȸ�� ���� : " + mar[c].memberInfo());

		}

	}
	public void printMember(int index) {
		// �Ѹ����
		System.out.println("ȸ������ : " + mar[index].memberInfo());
	}
	public void sortIDAsc() {
		// ���̵� �������� ����
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
		// ���̵� �������� ����
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
		// ���� �������� ����
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
		// ���� �������� ����
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
		// ���� �������� û��
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
