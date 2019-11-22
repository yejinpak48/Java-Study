package com.kh.chap05_method.part02_methodTest;

import static com.kh.chap05_method.part02_methodTest.StaticMethodTest.*;

public class Run {

	public static void main(String[] args) {
		NonStaticMethodTest test = new NonStaticMethodTest();
		test.method1();
		
		//�Ű������� ���� ��ȯ���� �ִ� �޼ҵ� ȣ���� ���
		//����Ÿ�԰� ��ġ�ϴ� �ڷ����� ������
		//�޼ҵ� ���� ����� ��Ƽ� ����Ѵ�.
		
		/*String str = test.method2();
		System.out.println(str);*/
		
		System.out.println(test.method2());
		
		
		//�Ű������� �ְ� ��ȯ���� ���� �޼ҵ��� ȣ���� ���
		//�ݵ�� ���ڷ� �Ű������� Ÿ��, ����, ������ ��ġ�ϴ� ���� �Ѱ���� �Ѵ�.
		int a = 10;
		int b = 20;
		test.method3(a, b);
		
		
		int result = test.method4(10, 20);
		System.out.println("result : " + result);
		
		//static �޼ҵ� ȣ��ÿ��� ��ü�� �������� �ʰ� ȣ���Ѵ�.
		//������� Ŭ������.�޼ҵ��()���� ����Ѵ�.
		//Ŭ�������� ������� �������� static import�� �ؾ� �Ѵ�.
		//import static ��Ű����.Ŭ������.*;
		StaticMethodTest.staticMethod1();
		
		System.out.println("10�� 20�� ���� : " + StaticMethodTest.staticMethod2() + "�Դϴ�.");
		
		StaticMethodTest.staticMethod3("����ȣ");
		
		System.out.println(StaticMethodTest.staticMethod4("����ȣ"));
	}

	
}


















