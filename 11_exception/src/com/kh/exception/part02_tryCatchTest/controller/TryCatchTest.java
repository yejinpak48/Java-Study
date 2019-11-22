package com.kh.exception.part02_tryCatchTest.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryCatchTest {
	
	public void methodA() {
		System.out.println("methodA() ȣ���...");
		
		try {
			methodB();
			
			System.out.println("���� �߻��ÿ��� ��µ��� ����");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� �߻� ���ο� ������� ������ �����...");
		}
		
		System.out.println("methodA() �����...");
	}
	public void methodB() throws Exception {
		System.out.println("methodB() ȣ���...");
		
		throw new Exception("������ ���ܸ� �߻����׽��ϴ�.");
		
		/*System.out.println("methodB() �����...");*/
	}
	
	public void ioTest() {
		BufferedReader in = null;
		
		try {
			//FileReader��� ��ü�� ������ ���ܰ� �߻��Ѵ�.
			//����Ϸ��� �ʿ��� �ݵ�� ����ó���� �ؾ� �ϱ� ������
			//try-catch�� �ȿ��� �ۼ��ؾ� �Ѵ�.
			in = new BufferedReader(new FileReader("test.dat"));
			String s;
			
			//readLine�޼ҵ嵵 API���� Ȯ���غ���
			//IOException�� �߻����� ���ұ� ������
			//catch���� �߰��ؼ� ����ó�� ������ �ۼ��ؾ� �Ѵ�.
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
			//FileNotFoundException�� EOFException�� ���ÿ� ó���� �� �ִ�.
			//���� ������ �ڼ��� �ѹ��� ó���� �� �ִ� ���̴�.
		} catch (FileNotFoundException | EOFException e) {
			//�������� �ϴ� ������ �������� �ʴ� ��� �߻��ϴ� �����̴�.
			//java.io.FileReader �����ڿ� ���ܸ� �����ϴ�
			//throws������ �ۼ��Ǿ� �ֱ� ������
			//����ϴ� ������ (ȣ���ϴ� ����) �ݵ�� ����ó���� �� �־�� �Ѵ�.
			e.printStackTrace();
		} catch (IOException e) {
			//����¿� ���� ���ܷ�, ������ �����͸� �д� �������� �߻��ϴ�
			//���ܸ� ������ ���� Ŭ�����̴�.
			//FileNotFoundException�� IOException�� �ļ��̴�.
			
			//catch���� �������� �ۼ��� �� ����Ÿ���� �ϴܿ� ����
			//�ļ� Ÿ���� ���� �ۼ��Ǿ�� �Ѵ�.
			e.printStackTrace();
		} finally {
			//����ó�� ������ ��� ���� �ݵ�� �����ؾ� �ϴ� ��� �ۼ��� �ϸ�
			//���� ����� �ڿ��� �ݳ��� �������� ����ϰ� �ȴ�.
			try {
				//�����ϸ� NullPointerException�� �߻��Ѵ�.
				//������ ã�� ���ؼ� ��ü�� �������� ���ϰ� null���� ������.
				//null�� �����ϰ� �ִ� ���� ���� �� ���� ������ �߻��ϴ� �����̴�.
				//NullPointerException�� unchecked exception����
				//try-catch�� ó���ϱ� ���ٴ�
				//���� if-else �������� �ذ��Ѵ�.
				if(in != null) {
					//����¿� ����� ��Ʈ���� �ݾ��ִ� �޼ҵ��̴�.
					//API���� Ȯ���ϸ� IOException�� ������ �޼ҵ��̱� ������
					//finally �� ������ ����ó���� ��ø���� �� �־�� �Ѵ�.
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ioTest2() {
		//�ݳ��� �ڿ��� �ִ� ��� try-with-resource�������� ó���� �� �ִ�.
		//�� �ݳ��� �ؾ� �ϴ� ��� try() ��ȣ �ȿ� ��ü�� ������ �� ������,
		//���� ��ü�� �ѹ��� ������ �� �� �ִ�.
		//������ ������ ���۷����� try �� �������� ��� �����ϴ�.
		try(BufferedReader br 
				= new BufferedReader(
						new InputStreamReader(System.in));
				BufferedWriter bw 
					= new BufferedWriter(
							new OutputStreamWriter(System.out));){
			
			System.out.print("���� �� �� �Է� : ");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			bw.write("�Է��� ������ 2��� : " + (num * 2));
			
		}catch(Exception e) {
			//���� ������ Exception�� catch������ ó���ϸ�
			//�߻��� ���� ExceptionŬ������ ó���� �ѹ��� �� �� ������,
			//���ܺ��� ó�� ������ ���� �ۼ��� �� ���� ������
			//�����ϴ� ������ �ƴϴ�.
			e.printStackTrace();
		}
	}
}




















