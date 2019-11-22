package com.kh.io.part01_byteStream.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	public void fileOpen() {
		//파일로부터 byte단위로 데이터를 읽어 올 수 있는 스트림
		FileInputStream fin = null;
		
		try {
			//읽어오려는 파일이 없으면 FileNotFoundException이 발생하기 때문에
			//반드시 예외처리 해야 함
			fin = new FileInputStream("sample.dat");
			
			//파일 객체를 만들어 해당 파일의 크기 가져오기
			/*int fileSize = (int) new File("sample.dat").length();
			
			//파일을 읽어서 저장할 크기의 byte배열 선언
			byte[] bar = new byte[fileSize];
			
			//IOException 발생하기 때문에 catch블럭 추가
			fin.read(bar);
			
			for(int i = 0; i < bar.length; i++) {
				//유니코드값으로 읽어온다.
				//System.out.print(bar[i] + " ");
				
				//char로 형변환해주면 문자로 읽어올 수 있다.
				System.out.print((char) bar[i] + " ");
			}*/
			
			//byte배열을 사용하지 않고 바로 하나씩 읽는 방법
			int value;
			while((value = fin.read()) != -1) {
				System.out.print((char) value + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//스트림이 많으면 데이터가 꼬일 수 있기 때문에 닫아주는 것이 좋다.
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave() {
		FileOutputStream fout = null;
		
		try {
			//대상 파일이 존재하지 않으면 자동으로 파일을 만듦
			fout = new FileOutputStream("sample.dat");
			
			fout.write(97);
			byte[] bar = {98, 99, 100, 101, 102, 10};
			fout.write(bar);
			fout.write(bar, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}



















