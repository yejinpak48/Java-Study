package com.kh.variable;

public class D_����׽�Ʈ {
	public void testFinal() {
		//��� �׽�Ʈ
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + age);
		
		age = 30;
		//AGE = 30;  //���� �߻� -> ����� ���� �Ұ�
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		System.out.println("Math.PI : " + Math.PI);
		
	}

	public static void main(String[] args) {
		/*D_����׽�Ʈ test = new D_����׽�Ʈ();
		test.testFinal();*/
		new D_����׽�Ʈ().testFinal();

	}

}











