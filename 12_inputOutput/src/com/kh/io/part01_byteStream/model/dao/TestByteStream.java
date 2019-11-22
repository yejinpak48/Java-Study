package com.kh.io.part01_byteStream.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	public void fileOpen() {
		//���Ϸκ��� byte������ �����͸� �о� �� �� �ִ� ��Ʈ��
		FileInputStream fin = null;
		
		try {
			//�о������ ������ ������ FileNotFoundException�� �߻��ϱ� ������
			//�ݵ�� ����ó�� �ؾ� ��
			fin = new FileInputStream("sample.dat");
			
			//���� ��ü�� ����� �ش� ������ ũ�� ��������
			/*int fileSize = (int) new File("sample.dat").length();
			
			//������ �о ������ ũ���� byte�迭 ����
			byte[] bar = new byte[fileSize];
			
			//IOException �߻��ϱ� ������ catch�� �߰�
			fin.read(bar);
			
			for(int i = 0; i < bar.length; i++) {
				//�����ڵ尪���� �о�´�.
				//System.out.print(bar[i] + " ");
				
				//char�� ����ȯ���ָ� ���ڷ� �о�� �� �ִ�.
				System.out.print((char) bar[i] + " ");
			}*/
			
			//byte�迭�� ������� �ʰ� �ٷ� �ϳ��� �д� ���
			int value;
			while((value = fin.read()) != -1) {
				System.out.print((char) value + " ");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//��Ʈ���� ������ �����Ͱ� ���� �� �ֱ� ������ �ݾ��ִ� ���� ����.
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
			//��� ������ �������� ������ �ڵ����� ������ ����
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



















