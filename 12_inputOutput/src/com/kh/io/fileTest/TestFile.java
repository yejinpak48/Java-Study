package com.kh.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		//FileŬ���� �׽�Ʈ
		//������ ��� ���� ��ü�� ������ �� �ִ�.
		File file = new File("person.txt");
		System.out.println("���ϸ� : " + file.getName());
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("������ : " + file.getPath());
		System.out.println("���Ͽ뷮 : " + file.length());
		System.out.println("�������� : " + file.getParent());
		
		try {
			//������ ���� ��� ������ �����ϰ�
			//������ �ϸ� true�� �����ϰ�
			//������ ������ �ִ� ��� false�� �����Ѵ�.
			boolean b = file.createNewFile();
			boolean b2 = file.delete();
			
			System.out.println(b);
			System.out.println(b2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}















