package com.kh.operator;

import java.util.Scanner;

public class F_���׿����� {
	public void opTest() {
		//�׸��� 3���� ������
		//(���ǽ�)?���϶�����Ұ�:�����϶�����Ұ�;
		//���ǽ��� �ݵ�� ����� true Ȥ�� false�� �����Բ� �ۼ��ؾ� ��
		//��/�������ڰ� �ַ� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//String result = (num > 0)? "�����":"����� �ƴϴ�";
		
		//��ø���� ��뵵 �����ϴ�
		String result = (num > 0)?"�����":(num == 0)?"0�̴�":"����� �ƴϴ�";
		
		System.out.println(result);
		
	}
	
	
	public static void main(String[] args) {
		new F_���׿�����().opTest();
	}

}














