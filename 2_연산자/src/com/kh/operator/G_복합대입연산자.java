package com.kh.operator;

public class G_���մ��Կ����� {
	public void opTest() {
		//�ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� �����ڸ� ����
		//��� ���� ������ : +=, -=, *=, /=, %=
		//���� ó���ӵ��� �ξ� �����Ƿ� ��� ������
		/*
		 * += : ���ʰ� �������� ���� ���� �� ���� ���� ����(����)�� ����
		 * -= : ���ʰ� �������� ���� �� �� ���� ���� ����(����)�� ����
		 * *= : ���ʰ� �������� ���� ���� �� ���� ���� ����(����)�� ����
		 * /= : ���ʰ� �������� ���� ���� �� ���� ���� ����(����)�� ����
		 * %= : ���ʰ� �������� ���� ������ ������ ���� ���� ����(����)�� ���� 
		 * 
		 * */
		int num = 12;
		
		System.out.println("num : " + num);
		
		num = num + 3;
		System.out.println("num : " + num);
		
		num += 3;	//���� �ӵ��� �� ����, �޸𸮿� ���� ���� ����
		System.out.println("num : " + num);
		
		num -= 5;	//num = num - 5;
		System.out.println("num : " + num);
		
		num *= 2;	//num�� 2�� ����
		System.out.println("num : " + num);
		
		num /= 2;	//num�� 2�� ����
		System.out.println("num : " + num);
 		
	}

	public static void main(String[] args) {
		new G_���մ��Կ�����().opTest();

	}

}


















