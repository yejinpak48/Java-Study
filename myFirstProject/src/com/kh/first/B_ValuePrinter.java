package com.kh.first;

public class B_ValuePrinter {
	public void printValue1() {
		//���� ���� ������ ���� ���
		
		//����
		System.out.println(123);	//����
		System.out.println(1.23);   //�Ǽ�
		
		//����
		System.out.println('A');
		System.out.println('a');
		
		//���ڿ�
		System.out.println("�ȳ��ϼ���");
		System.out.println("A");
		
		//���� ���������� ������ ���� �ִ�.
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12);
		
		//���ڵ� ���ڷ� �ν��ϱ� ������ ������ �����ϴ�
		System.out.println('a' + 1);
		
		//���ڿ� + ���ڴ� ���ڿ��� ����� ������.
		System.out.println("�ȳ��ϼ���" + 123);
	}
	public void printValue2() {
		//���ڿ��� ������ + ����
		System.out.println(9 + 9);		//18
		System.out.println(9 + "9");	//99
		System.out.println("9" + 9);	//99
		System.out.println("9" + "9");	//99
		
		System.out.println(9 + 9 + "9");	//189
		System.out.println(9 + "9" + 9);	//999
		System.out.println("9" + 9 + 9);	//999
		System.out.println("9" + (9 + 9));	//918
	}
	
	public void printValue3() {
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		//���ʽ��� ���� ����Ʈ
		System.out.println(point + bonus);
		//���ʽ��� ���� ����Ʈ�� 10���� �شٸ� �ʿ��� ����Ʈ��?
		System.out.println((point + bonus) * personCount);
		//���ʽ��� ���� ����Ʈ�� 10���� �ְ� �����Ḧ 10����Ʈ �����Ѵٸ�?
		System.out.println(((point + bonus) * personCount) - fees);
		//���ʽ��� 10���� �ְ� �����Ḧ 10����Ʈ �����Ѵٸ�
		//10���� �޴� ����Ʈ�� ���� ���ΰ�?
		System.out.println((((point + bonus) * personCount) - fees) / personCount);
		
		//1. ������ ���� �ǹ̸� �ο��ϱ� ���� �������� ���ȴ�.
		//2. �ѹ� ���� ������ �ΰ� ��� ����� �������� ���ȴ�.
		//3. ������������ ������Ű�� ���� �������� ���ȴ�.
	}
	

	public static void main(String[] args) {
		B_ValuePrinter vp = new B_ValuePrinter();
		//vp.printValue1();
		//vp.printValue2();
		vp.printValue3();
	}

}









