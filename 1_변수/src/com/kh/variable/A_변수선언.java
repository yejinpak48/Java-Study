//��Ű�� �����
//Ŭ������ ���� ��Ű���� ���� ������ �ݵ�� �� �־�� �Ѵ�.
//��� Ŭ���� ������ ���� ù �ٿ� �ۼ��Ѵ�.
package com.kh.variable;

public class A_�������� {
	//��Ű���� �ٸ��� ���� �̸��� Ŭ������ ���� �� �ִ�.
	//Ŭ������ �̸��� ��� ��Ű���� ������ �̸��̴�.
	//ex) com.kh.variable.A_�������� <- Ŭ������ fullName�̴�.
	public void declareVariable() {
		//������
		//������
		byte bnum;
		short snum;
		int inum;
		long lnum;

		//�Ǽ���
		float fnum;
		double dnum;

		//������
		char ch;

		//����
		boolean isTrue;

		//���ڿ�(������)
		String str;

		//���� �� ���� �� ���
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;

		fnum = 4.0f;  //float�� ���ͷ��� �ݵ�� f�� �ٿ��� �Ѵ�.
		dnum = 8.0;   //double�� �Ǽ� ���� �ٷ� �Է��ص� �ȴ�.

		isTrue = true;  //true or false ���� ������ �� �ִ�.

		ch = 'a';
		str = "a";  //���ڸ� �� ���� �ᵵ ���ͷ��� String ���ͷ��� ����ؾ� �Ѵ�.

		System.out.println("bnum�� �� : " + bnum);
		System.out.println("snum�� �� : " + snum);
		System.out.println("inum�� �� : " + inum);
		System.out.println("lnum�� �� : " + lnum);

		System.out.println("fnum�� �� : " + fnum);
		System.out.println("dnum�� �� : " + dnum);

		System.out.println("isTrue�� �� : " + isTrue);

		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);


	}

	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ

		//������
		//������
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8L;

		//�Ǽ���
		float fnum = 4.0f;
		double dnum = 8.0;

		//����
		boolean isTrue = true;

		//������
		char ch = 'a';

		//���ڿ�
		String str = "a";

		//���� �� ����ϱ�
		System.out.println("bnum�� �� : " + bnum);
		System.out.println("snum�� �� : " + snum);
		System.out.println("inum�� �� : " + inum);
		System.out.println("lnum�� �� : " + lnum);

		System.out.println("fnum�� �� : " + fnum);
		System.out.println("dnum�� �� : " + dnum);

		System.out.println("isTrue�� �� : " + isTrue);

		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);

	}
	
	public void namingRuleTest() {
		//1. ��ҹ��� �����Ѵ�.
		String userName;
		String username;
		
		//2. ���� ����ϸ� �ȵȴ�.
		//boolean true;    //����� ����ؼ� ���� �߻�
		boolean True;      //�Ϲ����� ��Ģ�� ���� �������� ����
		
		//3. ���ڷ� �����ϸ� �ȵȴ�.
		int age1;
		//int 1age;    //���ڷ� �����ؼ� ���� �߻�
		
		//4. Ư�� ���ڴ� '_'�� '$'�� ����Ѵ�.
		//double sh@rp;   //�ٸ� Ư�� ���� ���� ���� �߻�
		double $harp;
		
		//5. ���� �ܾ��� �̸��� �� ��° �ܾ��� �� ���ں��� ù ��¥���� �빮�ڷ� ǥ��
		//��Ÿ�� ǥ���(camel case)
		String ageOfVampire;
		String ageofvampire;  //������ �߻����� ������ �������� ����(ū�ϳ�)
		
		//6. �ѱ� ��� ����(�������� ���� ->�ü���� ���ڵ� ����� �ٸ�)
		String �̸�;
		
		//7. ����� ��� �빮�ڷ� ǥ��
		final int AGE;
		final int age;  //�Ϲ����� ��Ģ�� ��߳�
		
		//8. ����� �ܾ�� �ܾ� ���̸� '_'�� �����Ѵ�.
		final int MAXAGE;  //�Ϲ����� ��Ģ�� ��߳�
		final int MAX_AGE;
	}

	public static void main(String[] args) {
		A_�������� test = new A_��������();
		//test.declareVariable();
		test.initVariable();
	}

}












