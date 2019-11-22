package com.kh.io.part03_addStream.chap01_byteToChar.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChange {
	//�⺻ ��Ʈ���� byte ��Ʈ���̰�
	//������Ʈ���� char ��Ʈ���� ��쿡 ����Ѵ�.
	//������� ���� ������ �� �� �ְ� byte��Ʈ����
	//char ��Ʈ������ �������ִ� ����� �����Ѵ�.
	public void input() {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("���ڿ� �Է� : ");
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



















