package com.kh.chap01_decisionMarkingStatement;

import java.util.Scanner;

public class C_ifElseIf {
	//if else if ������ ���� ������ �� �� �ִ� �����̴�.
	
	//[ǥ����]
	//if(���ǽ�){
	//		ù ��° ���ǽ��� �� �� ��� ������ ����
	//}else if(���ǽ�){
	//		�� ��° ���ǽ��� �� �� ��� ������ ����
	//}else{
	//		��� ������ ������ ��� ������ ����
	//}
	
	public void testIfElseIf() {
		//������ �ϳ� �Է� �޾� ����� ������ ������ ����� ����ϼ���
		//�����, 90�� �̻��� A���
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C���
		//70�� �̸� 60�� �̻��� D���
		//60�� �̸��� F������� ������.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point >= 90) {
			grade = 'A';
		}else if(/*point < 90 &&*/ point >= 80) {
			grade = 'B';
		}else if(/*point < 80 &&*/ point >= 70) {
			grade = 'C';
		}else if(/*point < 70 &&*/ point >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("����� ������  %d���̰�, ����� %c�Դϴ�.", point, grade);

		//printf ����
		//���˹��ڿ� ���� ������ �ڷ����� ��ġ�ؾ� �Ѵ�.
		//System.out.printf("%����", ��(Ȥ�� ����)); �� ���·� ����Ѵ�.
		//-> ������ �ִ� ���Ŀ� ���缭 �� ���Ŀ� �´� ��(����)�� �ٹٲ� ���� �ʰ� ����Ѵ�.
		
		//���˹���
		// %d : ������
		// %o : 8����
		// %x : 16����
		// %f : �Ǽ�(�Ҽ��� �Ʒ� 6�ڸ�)
		// %e : ����ǥ����(������ ǥ���)
		// %c : ����
		// %s : ���ڿ�
		// %b : ����
		// %5d : 5ĭ�� Ȯ���ϰ� ������ ����
		// %-5d : 5ĭ�� Ȯ���ϰ� ���� ����
		// %.2f : �Ҽ��� �Ʒ� 2�ڸ� ������ ǥ��
		
		//Ư������(escape ����)
		// tab : \t         ������ ������ŭ ����
		// new line : \n    ����ϰ� ���� �������� �ű�
		// �������� : \\       Ư������(\)���
		// ��������ǥ : \'     Ư������(') ���
		// ū����ǥ : \"       Ư������(") ���
		// �����ڵ� : \u0001     �����ڵ� ǥ���� �� ���
	}
	public void testIfElseIf2() {
		//���� �������� �� ��޺� �߰� ���� �̻��� ��쿡��
		//��޿� "+"��� ���ڸ� �߰��Ͽ� ����ϼ���
		//��) 95�� �̻��� ����� A+�� ��µǰ� ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int point = sc.nextInt();
		String grade = "";
		
		if(point >= 90) {
			grade = "A";
			if(point >= 95) {
				grade += "+";
			}
		}else if(point >= 80) {
			grade = "B";
			if(point >= 85) {
				grade += "+";
			}
		}else if(point >= 70) {
			grade = "C";
			if(point >= 75) {
				grade += "+";
			}
		}else if(point >= 60) {
			grade = "D";
			if(point >= 65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("����� ������ %d�̰�, ����� %s�Դϴ�.", point, grade);
	}
}






















