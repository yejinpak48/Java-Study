package com.kh.chap00_beforeTest;

import java.util.Random;

public class MathTest {
	/*
	 * �ڹٿ����� Ŭ������ �����ϴ� �ʵ�(��������)�� �޼ҵ� ����
	 * �ݵ�� new�� ����� ��ü�� �����ؾ� ����� �� �ִ�.
	 * �ش��ϴ� �ּҸ� ���� ���۷����� �̿��� �����ؾ߸� �Ѵ�.
	 * Ŭ������ ���۷��������� = new Ŭ������();
	 * ���۷���������.�޼ҵ��();  -> non-static �޼ҵ� �� ���
	 * 
	 * static �޼ҵ��� ��� ȣ���ϱ� ���� new�� ������� �ʾƵ� �ȴ�.
	 * Ŭ������.�޼ҵ��();  -> static �޼ҵ��� ��쿡 �޼ҵ� ȣ�� ���
	 * Ŭ������.�ʵ��; -> static �ʵ忡 ���� ����
	 * 
	 * */
	
	//java.lang.MathŬ���� �׽�Ʈ
	public void testMath() {
		
		System.out.println("��� PI : " + Math.PI);
		
		System.out.println("-7�� ���밪 : " + Math.abs(-7));
		System.out.println("-123.5�� ���밪 : " + Math.abs(-123.5));
		
		//���� : ������ ��, �������� ��������� �� �� ���� ��
		System.out.println("������ ���� : " + Math.random());
		
	}
	public void testRandom() {
		//1���� 100������ ���� ���ϱ�
		//int random = (int)(Math.random() * 100) + 1;
		
		//1���� 3������ ���� �߻�
		int random = new Random().nextInt(3) + 1;
		
		System.out.println("random : " + random);
	}
	
	public void practiceRandom() {
		//����ڰ� ���ϴ� ���� ������ �� �����ϱ�
		//0~9������ ������
		//1~10������ ������
		//20~35������ ������
		//0 �Ǵ� 1
		
		//���� 4���� ������ ������ ����ϴ� ������
		//Math.random()�� RandomŬ������ nextInt()�� �̿��Ͽ� ���
		
		
	}

	public static void main(String[] args) {
		MathTest mt = new MathTest();
		//mt.testMath();
		mt.testRandom();
	}

}















