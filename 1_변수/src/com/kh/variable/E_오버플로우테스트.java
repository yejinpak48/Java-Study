package com.kh.variable;

public class E_�����÷ο��׽�Ʈ {
	public void printVarSize() {
		//�⺻ �ڷ����� ������ �׽�Ʈ
		//�����θ� Ȯ���ϴ� �뵵��
		System.out.println("byte�� ũ�� : " + Byte.BYTES + "byte");
		System.out.println("short�� ũ�� : " + Short.BYTES + "byte");
		System.out.println("int�� ũ�� : " + Integer.BYTES + "byte");
		System.out.println("long�� ũ�� : " + Long.BYTES + "byte");

		System.out.println("float�� ũ�� : " + Float.BYTES + "byte");
		System.out.println("double�� ũ�� : " + Double.BYTES + "byte");

		System.out.println("char�� ũ�� : " + Character.BYTES + "byte");
	}

	public void testOverflow() {
		//byte bnum = 128;  //����, ������ �����
		
		byte bnum = 127;
		bnum = (byte)(bnum + 1);	//byte + int -> int(����ȯ�ʿ�)
		
		System.out.println("bnum : " + bnum);
		
	    
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
		//������ �߻������� ������ ����Ǵ� ������� ������ �ʱ� ������ �����ؾ� ��
		/*int multi = num1 * num2;
		
		System.out.println("����� : " + multi);*/
		
		//�ذ���
		//=> �����÷ο츦 ����Ͽ� �� ū �ڷ����� ����Ѵ�.
		long multi = (long)num1 * num2;
		
		System.out.println("����� : " + multi);
	}


	public static void main(String[] args) {
		E_�����÷ο��׽�Ʈ test = new E_�����÷ο��׽�Ʈ();
		//test.printVarSize();
		//test.testOverflow();
		test.calc();
	}

}











