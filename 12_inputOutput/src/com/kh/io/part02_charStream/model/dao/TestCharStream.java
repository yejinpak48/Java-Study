package com.kh.io.part02_charStream.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	
	public void fileSave() {
		FileWriter fw = null;
		
		try {
			//파일이 존재하지 않으면 자동으로 생성해 준다.
			fw = new FileWriter("sample.txt");
			
			fw.write("우리나라 대한민국");
			fw.write('A');
			fw.write(' ');
			char[] carr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(carr);
			
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		FileReader fr = null;
		
		try {
			//대상 파일이 없으면 예외 발생함
			fr = new FileReader("sample.txt");
			
			int value;
			while((value = fr.read()) != -1) {
				System.out.print((char) value + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

















