package com.kh.api.part02_wrapper.controller;

public class WrapperTestManager {
	
	public void boxingTest() {
		//�⺻ �ڷ����� ��ü�� ��ȯ�ϴ� ���� boxing�Ѵٰ� �ϸ�
		//��ü�� �⺻ �ڷ������� ��ȯ�ϴ� ���� unboxing�̶���Ѵ�.
		Integer num1 = new Integer(3);
		Integer num2 = 3;		//����ڽ�(autoboxing)ó����
		
		int num3 = num1;		//�����ڽ�(auto unboxing) ó����
		
	}
	
	public void parsingTest() {
		//���ڿ� (String)�ڷ����� �⺻�ڷ������� ��ȯ�ϴ� ���� parsing�Ѵٰ� ��
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");
		long l = Long.parseLong("8");
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("9.0");
		boolean bl = Boolean.parseBoolean("true");
		
		//Character�� parsing ����� �������� �ʴ´�
		char c = "abc".charAt(0);
		
	}
	
	public void valueOfTest() {
		//�⺻ �ڷ����� ���ڿ� ��ü�� ��ȯ�ϴ� ����� �����Ѵ�.
		//valueOf�� �⺻ �ڷ��� ���� ����Ŭ���� ��ü Ÿ������ �����ϴ� ���̰�
		//�ش� ���� Ŭ������ toString�̶�� �޼ҵ�� ��Ʈ������ ��ȯ���ش�.
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(4).toString();
		String l = Long.valueOf(8L).toString();
		String f = Float.valueOf(4.0f).toString();
		String d = Double.valueOf(8.0).toString();
		String bl = Boolean.valueOf(true).toString();
		String c = Character.valueOf('a').toString();
		
		//StringŬ������ valueOf�� ����� �� �ִ�.
		String str = String.valueOf(10);
		
		//���ڿ� ��ġ�⸦ �̿��� String���� ��ȯ�� ���� �ִ�.
		String str2 = 123 + "";
	}
}



















