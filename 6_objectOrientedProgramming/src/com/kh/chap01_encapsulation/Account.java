package com.kh.chap01_encapsulation;

public class Account {
	//private ���������� ������� �ʰ� �ʵ� ����
	/*String name = "����ȣ";				//������
	String accNo = "010-7660-7771";		//���¹�ȣ
	String pwd = "1234";				//��й�ȣ
	int bankCode = 20;					//�����ڵ�
	int balance = 0;					//�ܾ�
*/	
	
	//private ���������� ���
	private String name = "����ȣ";
	private String accNo = "010-7660-7771";
	private String pwd = "1234";
	private int bankCode = 20;
	private int balance = 0;
	
	
	//������(��ü�� �����ϱ� ���� ������ �޼ҵ�)
	public Account() {}
	
	
	//�Ա��� ���� �޼ҵ�
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		}else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//����� ���� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��� �Ǿ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���");
		}
	}
	
	//�ܾ��� ��ȸ�ϴ� �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���� �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
}


















