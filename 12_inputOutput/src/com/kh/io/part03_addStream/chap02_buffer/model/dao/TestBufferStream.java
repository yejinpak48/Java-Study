package com.kh.io.part03_addStream.chap02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	
	public void inputBufferStream() {
		try(BufferedWriter bw 
				= new BufferedWriter(new FileWriter("sample2.txt"));){
			
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�\n");
			bw.write("�ȳ��ϼ���\n");
			
			bw.flush();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputBufferStream() {
		try(BufferedReader br =
				new BufferedReader(new FileReader("sample2.txt"))){
			
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}


















