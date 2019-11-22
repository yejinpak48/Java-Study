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
			
			bw.write("æ»≥Á«œººø‰\n");
			bw.write("π›∞©Ω¿¥œ¥Ÿ\n");
			bw.write("æ»≥Á«œººø‰\n");
			
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


















