package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class A_if {
	public void testIf() {
		//�ܵ� if��
		//���ǽ��� ��� ���� ��(true)�̸� { } �ȿ� �ִ� �ڵ带 �����ϰ�,
		//���ǽ��� ��� ���� ����(false)�̸� { } �ȿ� �ִ� �ڵ带 �����ϰ� �Ѿ
		
		//[ǥ����]
		//if(���ǽ�){
		//  ���ǽ��� true�� �� ������ �ڵ� �ۼ�
		//}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//¦������ ������ Ȯ����
		if(num % 2 == 0) {
			//����� ���� �� ������
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		}
		
		//¦���� �ƴ��� ������ Ȯ����(��, Ȧ������ Ȯ��)
		if(num % 2 != 0) {
			//����� ���� �� ������
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		
		//���ǰ� ��� ���� �����
		System.out.println("���α׷� ����");
	}
}















