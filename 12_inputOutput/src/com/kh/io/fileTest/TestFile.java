package com.kh.io.fileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		//File클래스 테스트
		//파일이 없어도 파일 객체를 생성할 수 있다.
		File file = new File("person.txt");
		System.out.println("파일명 : " + file.getName());
		System.out.println("저장경로 : " + file.getAbsolutePath());
		System.out.println("저장경로 : " + file.getPath());
		System.out.println("파일용량 : " + file.length());
		System.out.println("상위폴더 : " + file.getParent());
		
		try {
			//파일이 없는 경우 파일을 생성하고
			//생성을 하면 true를 리턴하고
			//기존에 파일이 있는 경우 false를 리턴한다.
			boolean b = file.createNewFile();
			boolean b2 = file.delete();
			
			System.out.println(b);
			System.out.println(b2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}















