package com.kh.io.part03_addStream.chap03_dataType.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataTypeStream {
	public void addDataTypeStream() {
		//������ �ڷ��� ���� ó���ϴ� ����� �߰��� ������Ʈ��
		
		try(DataInputStream din = 
				new DataInputStream(new FileInputStream("score.dat"));
			DataOutputStream dout =
				new DataOutputStream(new FileOutputStream("score.dat"));){
			
			//���Ͽ� �ڷ������� ���
			dout.writeUTF("ȫ�浿");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("�̼���");
			dout.writeInt(87);
			dout.writeChar('B');
			dout.writeUTF("��ö��");
			dout.writeInt(73);
			dout.writeChar('C');
			
			while(true) {
				System.out.println(din.readUTF() + ", " 
							+ din.readInt() + ", " 
							+ din.readChar());
			}
			
			
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e){
			//���Ͽ� �� �̻� ���� ������ ���� �� �߻��ϴ� Exception�̴�.
			//�߻��� �� �ۿ� ���� Exception�̱� ������ ���� ó�� ������ �ۼ����ش�.
			System.out.println("���� �б� �Ϸ�");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}









