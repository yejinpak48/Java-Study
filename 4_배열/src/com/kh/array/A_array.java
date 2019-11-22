package com.kh.array;

import java.util.Scanner;

public class A_array {
	public void testArray() {
		//�迭 ��� ����
		//�迭�� ������� ������ ������ ������ ����ؾ� �Ѵ�.
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int sum = 0;
		
		//�ݺ����� ������� ����
		/*for(int i = 1; i < 6; i++) {
			sum += numi;
		}*/
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		//�迭 �̿�
		int[] arr = new int[5];
		
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;*/
		
		//���� ������ ���� �ݺ����� ����� �� �ִ�.
		for(int i = 0, value = 0; i < arr.length; i++) {
			arr[i] = value += 10;
		}
		
		int sum2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
	}
	
	public void testArray2() {
		//�迭�� ��� ���
		//�迭�� ����
		//�ڷ���[] ������;
		//�ڷ��� ������[]; �� �������� ������ �� �ִ�.
		
		//������ stack�� �迭�� �ּҸ� ������ �� �ִ� ������ ����� ���̴�.
		int[] iarr;
		char carr[];
		
		//������ ���۷��������� �迭�� �Ҵ��Ͽ� ������ �� �ִ�.
		/*iarr = new int[];*/	//ũ�⸦ ������ ���� �ʾƼ� ���� �߻�
		iarr = new int[5];
		carr = new char[10];
		
		//����� �Ҵ��� ���ÿ� �� ���� �ִ�.
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		System.out.println("iarr2 : " + iarr2);
		System.out.println("carr2 : " + carr2);
		
		//�ؽ��ڵ�� ���� �ּҰ��� �ƴϰ�, ���� �ּҸ� ã�� ���� key������ �Ѵ�.
		//�ڹٿ����� ���������� �ϵ��� ������ �� ���� ������ ��Ȯ�� �޸� �ּҸ�
		//�� �� ����.
		//���� �ؽ��ڵ尡 �ּҶ�� ������ �� ������, ��������� �ּҶ�� �����ص�
		//��� ����.
		System.out.println("iarr2 : " + iarr2.hashCode());
		System.out.println("carr2 : " + carr2.hashCode());
		
		System.out.println("iarr2�� ���� : " + iarr2.length);
		System.out.println("carr2�� ���� : " + carr2.length);
		
		//��ĳ�ʸ� ���� �Է¹��� ������ �迭�� ���̸� �����Ͽ�
		//�迭�� �Ҵ��� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Ҵ��� �迭�� ���̸� �Է��ϼ��� : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr�� hashcode : " + darr.hashCode());
		System.out.println("darr�� ���� : " + darr.length);
		
		darr = new double[30];
		
		System.out.println("���� �� darr�� hashcode : " + darr.hashCode());
		System.out.println("���� �� darr�� ���� : " + darr.length);
		
		//�ѹ� �Ҵ�� �迭�� ���� �� ����.
		//�ٸ� ���۷��� ������ null�� �����Ͽ� �� �̻� ������ �ּҰ� ���� �� �迭��
		//���� �ð��� ���� �� heap�� old�������� �̵��Ͽ� GC(������ �÷���)�� ������Ų��.
		//�׸��� �ٽô� ������ �����ϴ� �迭�� �ٽ� ������ �� ����.
		darr = null;
		
		//NullPointerException�� �߻���
		//�ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� ��
		//�߻��ϴ� �����̴�.
		//System.out.println("���� �� darr�� ���� : " + darr.length);
		
		//���� NullPointerException�� �����Ϸ���
		//if������ null check�� �� �־�� �Ѵ�.
		if(darr != null) {
			System.out.println("���� �� darr�� ���� : " + darr.length);
		}
	}
	public void testArray3() {
		//�⺻������ �迭�� �����ϰ� �Ҵ��� �ϸ� JVM�� ������ ������
		//�迭�� �ʱ�ȭ �ȴ�.
		//heap������ ���� ���� ������ ������ �� ���� �����̴�.
		int[] iarr = new int[5];
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.println("iarr[" + i + "]�� �� : " + iarr[i]);
		}
		//jvm�� ���� �⺻�� ���� ������ �ʱ�ȭ�� �ϰ� ���� ��� ���� �̿��Ѵ�.
		//���� ����ϴ� ��� new�� ������� �ʾƵ� �Ǹ�,
		//���� ������ŭ �ڵ����� ũ�Ⱑ �����ȴ�.
		/*int[] iarr2 = {11,22,33,44,55};*/
		int[] iarr2 = new int[] {11,22,33,44,55};
		
		System.out.println("iarr2�� ���� : " + iarr.length);
		
		//���ڿ��� �迭�� ����� �� �ִ�.
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}
}






















