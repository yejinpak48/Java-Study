package com.kh.exception.part01.throwTest.run;

import com.kh.exception.part01.throwTest.controller.ThrowTest;

public class Run {

	public static void main(String[] args)/* throws Exception*/{
		ThrowTest tt = new ThrowTest();
		
		//try catch�� �ذ��ؾ� �Ѵ�.
		try {
			tt.methodA();
			
			System.out.println("���ܰ� �߻����� �ʾҽ��ϴ�.");
			
		}catch(Exception e) {
			//System.out.println("���ܻ�Ȳ�� �߻��Ͽ����ϴ�.");
			//���� ����� �߻� ��ġ�� �ֿܼ� ������ִ� �޼ҵ�
			/*e.printStackTrace();*/
			System.out.println(e.getMessage());
		}
		
		System.out.println("���������� �����...");
	}

}







