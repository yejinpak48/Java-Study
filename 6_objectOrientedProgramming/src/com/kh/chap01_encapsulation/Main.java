package com.kh.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		
		//���� �ܾ� ��ȸ 0��
		a.displayBalance();
		
		//100���� �Ա�
		a.deposit(1000000);
		a.displayBalance();
		
		//�߰��� 150���� �Ա�
		a.deposit(1500000);
		a.displayBalance();
		
		//�뵷�� �ʿ��ؼ� 50���� ����
		a.withdraw(500000);
		a.displayBalance();
		
		//������ account ��ü�� ����� ����� �����ϰ� �ܾ��� ��� �����ذ���.
		/*a.balance -= 2000000;*/
		
		//���۽����� �������� ���� 50���� ����
		a.withdraw(500000);
		a.displayBalance();
		
	}

}














