package com.kh.variable;

import java.util.Scanner;

public class C_�����������׽�Ʈ {
	public void changeValue() {
		//���� ����
		String name;	//�̸�
		char gender;	//����
		int age;		//����
		double height;	//Ű
		
		//�ʱ�ȭ
		name = "����ȣ";
		gender = 'M';
		age = 20;
		height = 180.5;
		
		System.out.println(name + "���� ���� ����");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		//Ű����� �Է� �޾� ������ ����� �� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		gender = sc.next().charAt(0);  //���ڸ� �о���� �޼ҵ尡 ����.
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		
		String str = "�ȳ��ϼ���";
		System.out.println(str.charAt(0));
		
		System.out.println("�ȳ��ϼ���".charAt(0));
		
	}

	public static void main(String[] args) {
		C_�����������׽�Ʈ test = new C_�����������׽�Ʈ();
		test.changeValue();
	}
}












