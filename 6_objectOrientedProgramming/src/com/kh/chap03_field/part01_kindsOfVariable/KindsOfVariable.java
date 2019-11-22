package com.kh.chap03_field.part01_kindsOfVariable;

//���� ���� ��ġ�� ���� ����
public class KindsOfVariable {	//Ŭ���� ������ ����
	//Ŭ���� ������ �ۼ��ϴ� ������ �ʵ��� �Ѵ�.
	//�ʵ� == �������(Ŭ������ ������ ������ �ǹ�)
	//   == ��������(Ŭ���� �������� ����� �� �ִ� ������� �ǹ�)
	//   == �ν��Ͻ�����(�ν��Ͻ� ���� �� �Ҵ�޴� ������� �ǹ�)
	private int globalNum;
	
	public void testMethod(int num) {	//�޼ҵ� ������ ����
		//�޼ҵ� �������� �ۼ��ϴ� ������ ����������� �Ѵ�.
		//�޼ҵ��� ��ȣ �ȿ� �ۼ��ϴ� ������ �Ű�������� �Ѵ�.
		//�Ű������� ������ ���������� �����ϸ� �ȴ�.
		int localNum;
		
		//���� ������ ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ�� �Ǿ� �־�� �Ѵ�.
		/*System.out.println(localNum);*/
		
		//�Ű������� ȣ�� �� ���� �Ѿ�ͼ� ����Ǳ� ������ �ʱ�ȭ�� �ʿ� ����.
		System.out.println(num);
		
		//���������� Ŭ���� �������� ��� �����ϴ�.
		System.out.println(globalNum);
		
	}	//�޼ҵ� ������ ��
	
	public void testMethod2() {
		//���������� �ش� ����(���� ��)������ ��� �����ϴ�.
		/*System.out.println(localNum);*/
		//���������� �ٸ� �޼ҵ忡���� ��� �����ϴ�.
		System.out.println(globalNum);
	}
	
	
	
}	//Ŭ���� ������ ��















