package com.kh.operator;

import java.util.Scanner;

public class E_�Ϲݳ������� {
	public void opTest1() {
		//&&(�׸���, ~�鼭) : 11����
		//||(�Ǵ�, ~�ų�) : 12����
		//���� && ����, ���� || ����
		
		//����)
		//���� && ���� || ���� && ����
		//=> (���� && ����) || (���� && ����)
		
		// 1 <= ���� <= 100 �̷��� ��� ����
		// ���� >= 1 && ���� <= 100
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("1���� 100 �������� Ȯ�� : " 
							+ (num >= 1 && num <= 100));
		
		//5~10 ������ ������ �ش����� ���� ���̸� true ������ false�� ����
		System.out.println("5~10 ������ ���� �ƴ��� Ȯ�� : "
				            + !(num >= 5 && num <= 10));
		
		//���� �빮�ڳ�?
		//--> ���ں��� >= 'A' && ���ں��� <= 'Z'
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("���� �빮������ Ȯ�� : " 
							+ (ch >= 'A' && ch <= 'Z'));
		
		// || : ���� ���� �����ϰ� �� �߿� �ϳ��� �´°� �ִ��� ��� �� ���
		// �Է� ���ڰ� �� �ҹ��� ��� ���� 'y' Ȥ�� 'Y'���� ��� ��
		// ���ں��� == 'y' || ���ں��� == 'Y'
		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("������ y Ȥ�� Y���� Ȯ�� : " 
		                    + (ch2 == 'y' || ch2 == 'Y'));
		
		// ���ĺ� �빮�� �̰ų� �ҹ������� Ȯ��
		System.out.print("���� �ϳ� �Է� : ");
		char ch3 = sc.next().charAt(0);
		
		System.out.println("���ĺ����� Ȯ�� : " + 
					((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')));
		
	}
	public void opTest2() {
		//���� && ���� : ���� ����� false�̸� �ڸ� ���� ����
		//���� || ���� : ���� ����� true�̸� �ڸ� ���� ����
		int num = 10;
		
		int result = (false && ++num > 0)?num:num;
		
		System.out.println("&& Ȯ�� : " + num);
		
		result = (true || ++num > 0)?num:num;
		
		System.out.println("|| Ȯ�� : " + num);
		
		
	}

	public static void main(String[] args) {
		E_�Ϲݳ������� test = new E_�Ϲݳ�������();
		//test.opTest1();
		test.opTest2();
	}

}



















