package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.model.vo.Member;

public class MemberMenu {
	//Ű���� �Է¿� ��ü �ʱ�ȭ
	Scanner sc = new Scanner(System.in);
	//ȸ������ Ŭ���� ��ü ���� �ʱ�ȭ
	MemberManager mManager = new MemberManager();
	Member m = new Member();

	//����Ʈ������
	public MemberMenu(){}

	//�޼ҵ� �ۼ�
	public void mainMenu(){
		do{
			System.out.println();
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mManager.SIZE + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ������ "  + mManager.memberCount() + "�� �Դϴ�.");

			System.out.println();
			System.out.println("***** ȸ�� ���� ���α׷� *****");
			System.out.println();
			System.out.println("1. �� ȸ�� ���");
			System.out.println("2. ȸ�� ��ȸ");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ����");
			System.out.println("6. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : mManager.memberInput(); break;
			case 2 : searchMenu(); break;
			case 3 : modifyMenu(); break;
			case 4 : sortMenu(); break;
			case 5 : mManager.deleteMember(); break;
			case 6 : mManager.printAllMember(); break;
			case 9 : 
				System.out.print("������ �����ðڽ��ϱ�?(y/n) : ");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') return;
			}
		}while(true);

	}

	public void searchMenu(){
		// ȸ�� ��ȸ (equals ���)
		do{
			System.out.println();
			System.out.println("***** ȸ�� ���� �˻� �޴� *****");
			System.out.println();
			System.out.println("1. ���̵�� �˻�");
			System.out.println("2. �̸����� �˻�");
			System.out.println("3. �̸��Ϸ� �˻�");
			System.out.println("9. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
				int index =	mManager.searchMemberId(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			case 2 : 
				System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
				index = mManager.searchMemberName(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			case 3 : 
				System.out.print("�˻��� �̸��� �ּҸ� �Է��ϼ��� : ");
				index =	mManager.searchMemberEmail(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			case 9 : 
				System.out.println("���� �޴��� �̵��մϴ�.");
				return;
			}
		}while(true);

	}

	public void sortMenu(){
		//ȸ�� ���� ���� (compareto ���)
		do{
			System.out.println();
			System.out.println("***** ȸ�� ���� ���� ��� �޴� *****");
			System.out.println();
			System.out.println("1. ���̵� �������� ���� ���");
			System.out.println("2. ���̵� �������� ���� ���");
			System.out.println("3. ���� �������� ���� ���");
			System.out.println("4. ���� �������� ���� ���");
			System.out.println("5. ���� �������� ���� ���");
			System.out.println("9. �����޴��� ����");
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				mManager.sortIDAsc();
				break;
			case 2 : mManager.sortIDDes(); break;
			case 3 : mManager.sortAgeAsc(); break;
			case 4 : mManager.sortAgeDes(); break;
			case 5 : mManager.sortGenderDes(); break;
			case 9 : 
				System.out.println("���� �޴��� ȭ�� �̵� �մϴ�.");
				return;
			}
		}while(true);
	}

	public void modifyMenu(){
		//ȸ�� ���� ���� (setter ���)
		do{
			System.out.println();
			System.out.println("***** ȸ�� ���� ���� �޴� *****");
			System.out.println();
			System.out.println("1. ��ȣ ����");
			System.out.println("2. �̸��� ����");
			System.out.println("3. ���� ����");
			System.out.println("9. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				System.out.print("������ ���̵� �Է��ϼ��� : ");
				int index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("������ �н����带 �Է��ϼ��� : ");
					mManager.mar[index].setPassword(sc.next());
					mManager.printMember(index); 
					System.out.println("ȸ������ ������ ����Ǿ����ϴ�.");
				}
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;				
			case 2 :
				System.out.print("������ ���̵� �Է��ϼ��� : ");
				index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("������ �̸��� �ּҸ� �Է��ϼ��� : ");
					mManager.mar[index].setEmail(sc.next());
					mManager.printMember(index); 
					System.out.println("ȸ������ ������ ����Ǿ����ϴ�.");
				}
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			case 3 :
				System.out.print("������ ���̵� �Է��ϼ��� : ");
				index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("������ ���̸� �Է��ϼ��� : ");
					mManager.mar[index].setAge(sc.nextInt());
					mManager.printMember(index); 
					System.out.println("ȸ������ ������ ����Ǿ����ϴ�.");
				}
				else 
					System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
				break;
			case 9 :
				System.out.println("���� �޴��� �̵��մϴ�.");
				return;
			}
		}while(true);
	}
}
