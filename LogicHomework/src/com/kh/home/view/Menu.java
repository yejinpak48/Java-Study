package com.kh.home.view;

import java.util.Scanner;

import com.kh.home.controller.Function;

public class Menu {
	public static void displayMenu() {
		Scanner sc = new Scanner(System.in);
		Function func = new Function();
		
		do {
			System.out.println("*** ��������/������/��� �������α׷� ***");
			System.out.println();
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū ������ �հ� ���ϱ�");
			System.out.println("3. �Ż� ���� Ȯ���ϱ�");
			System.out.println("4. �л� ���� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ�");
			System.out.println("6. �������� �հ� ���ϱ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : func.calculator(); break;
			case 2 : func.totalCalculator(); break;
			case 3 : func.profile(); break;
			case 4 : func.sungjuk(); break;
			case 5 : func.printStarNumber(); break;
			case 6 : func.sumRandomNumber(); break;
			case 7 : func.continueGugudan(); break;
			case 8 : func.shutNumber(); break;
			case 9 : return;
			default : System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.");
			          System.out.println("�ٽ� �Է��Ͻʽÿ�.\n");
			}
			
		}while(true);
	}
}






















