package com.kh.variable;

public class F_����ȯ�׽�Ʈ {
	//(�ٲ��ڷ���)�� �Ǵ� (�ٲ��ڷ���)����
	//casting������ : ���� �ڷ����� �ٲ� �� ����Ѵ�.
	//����ȯ : �ڵ�(������)����ȯ, ����(�����)����ȯ�� �ִ�.
	
	//��ǻ�Ϳ����� �� ó�� ��Ģ
	//1. ���� �ڷ��� ������ ������ �����ϴ�. �ٸ� �ڷ����� ���� ������ �� ����ȯ �ʿ�
	//2. ���� �ڷ��� ������ ����� �� ������, ����� ����� ���� �ڷ����̴�.
	//3. �⺻������ �������� �Ǽ������� �ڵ� ����ȯ�� ����������,
	//   �Ǽ����� ���������� ���� ����ȯ�� �ؾ� �Ѵ�.
	//   10 -> 10.0 �ڵ�����ȯ ����, 10.5 -> 10 ��������ȯ �ʿ�
	
	public void rule1() {
		boolean flag = true;
		//boolean �ڷ����� ������ true, false�� ����(����ȯ ����)
		//flag = (boolean)1;
		
		//�ڷ����� �ٸ����� ���� ũ���� ���� Ÿ���� ū ���� Ÿ������ ������ �� �ִ�
		//=> �ڵ�����ȯ
		//������ ū ���� Ÿ���� ���� ���� Ÿ������ �ڵ� ��ȯ���� �ʱ� ������
		//����ȯ�� ����� �־�� �Ѵ�.
		//=> ��������ȯ
		//������ �� �տ� (������Ÿ��)�� ������ �ָ� �ȴ�.
		
		//�ڵ� ����ȯ�� �Ͼ
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
		//char ch2 = -97;  //���ڴ� ������ ������ �� ����.
		
		//int �ڷ��� ������ ���� char �ڷ����� �����ϱ� ���� ���� ����ȯ�� �ؾ� �Ѵ�
		char ch2 = (char)num;
		System.out.println("ch2 : " + ch2);
		
		//������ ������ ������ char�� ���� ����ȯ�� �ϰ� �Ǹ�
		//char�� ��ȣ��Ʈ�� ���� ������ ���ڷ� �ν����� ���Ѵ�.
		//����ǥ�� ������ �ǹ̰� �ƴ� ���� ���ڶ�� ���̴�.
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		
	}
	
	public void rule2() {
		//�ٸ� �ڷ��������� ������ ū �ڷ������� �ڵ� ����ȯ �� ����ó�� �ȴ�.
		int inum = 10;
		long lnum = 100;
		
		//��� 1. ���� ����� int�� ���� ����ȯ �Ѵ�.
		int isum = (int)(inum + lnum);
		
		System.out.println("isum : " + isum);
		
		//��� 2. long�� ���� int�� ���� ����ȯ �Ѵ�.
		int isum2 = inum + (int)lnum;
		
		System.out.println("isum2 : " + isum2);
		
		//��� 3. long�� �ڷ������� �޴´�.
		long sum = inum + lnum;
		
		System.out.println("sum : " + sum);
		
		//������ ���������� byte�� short�� ���� ����� ������ int�� �ȴ�.
		byte bnum = 1;
		short snum = 2;
		
		//���� ����ȯ�� ������ ���
		short sum2 = (short)(bnum + snum);
		
		//Ȥ�� ���� ����� int������ �����ؾ� �Ѵ�.
		int sum3 = bnum + snum;
	
	}
	
	public void rule3() {
		//������ �Ǽ��� �ڵ� ����ȯ�� �ȴ�.
		long lnum = 100;	//8byte
		
		float fnum = lnum;  //4byte
		
		System.out.println("fnum : " + fnum);
		
		//�Ǽ��� ������ ����ȯ �� �� ���� ����ȯ�� �� �־�� �Ѵ�.
		double dnum = 10.5;
		
		//�Ǽ��� ������ �ٲ� �� �Ҽ��� ���ϸ� �����ϱ� ������ ������ �ս��� �Ͼ��.
		int inum = (int)dnum;
		
		System.out.println("inum : " + inum);
	}
	
	public void testDataloss() {
		//������ �ս� �׽�Ʈ
		int inum = 290;
		
		System.out.println("inum : " + inum);
		
		byte bnum = (byte)inum;
		
		System.out.println("bnum : " + bnum);
	}
	
	

	public static void main(String[] args) {
		F_����ȯ�׽�Ʈ test = new F_����ȯ�׽�Ʈ();
		//test.rule1();
		//test.rule2();
		//test.rule3();
		test.testDataloss();
	}

}















