package com.kh.operator;

public class B_���������� {
	// ++ : 1 ������ �ǹ��̴�, ++�� Ȥ�� ��++ �� ����Ѵ�.
	// -- : 1 ������ �ǹ��̴�, --�� Ȥ�� ��-- �� ����Ѵ�.
	
	//�� ��ü�� ������Ű�ų� ���ҽ�ų ���� ��� ��ġ�� ������ �ص� ������ ����� ���´�.
	public void test1() {
		int age = 20;
		
		System.out.println("���� ���̴� ? " + age);
		
		++age;
		System.out.println("++age�� ����� ? " + age);
		
		age++;
		System.out.println("age++�� ����� ? " + age);
		
		--age;
		System.out.println("--age�� ����� ? " + age);
		
		age--;
		System.out.println("age--�� ����� ? " + age);
		
	}
	
	public void test2() {
		int num1 = 20;
		
		//����� ���� ó���ϰ� �� �� ���� ó�� ��
		int result = num1++ * 3;
		
		System.out.println("result : " + result);
		System.out.println("num1 : " + num1);
		
		int num2 = 20;
		
		int result2 = ++num2 * 3;
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
		
	}

	public static void main(String[] args) {
		B_���������� test = new B_����������();
		//test.test1();
		test.test2();
	}

}












