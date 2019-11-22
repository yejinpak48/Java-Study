package com.kh.io.part03_addStream.chap01_byteToChar.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChange {
	//기본 스트림이 byte 스트림이고
	//보조스트림이 char 스트림인 경우에 사용한다.
	//입출력을 문자 단위로 할 수 있게 byte스트림을
	//char 스트림으로 변경해주는 기능을 제공한다.
	public void input() {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("문자열 입력 : ");
			String value = br.readLine();
			
			System.out.println("value : " + value);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	}
	
	public void output() {
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



















