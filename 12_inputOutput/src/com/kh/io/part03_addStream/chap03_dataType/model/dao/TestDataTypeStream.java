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
		//데이터 자료형 별로 처리하는 기능을 추가한 보조스트림
		
		try(DataInputStream din = 
				new DataInputStream(new FileInputStream("score.dat"));
			DataOutputStream dout =
				new DataOutputStream(new FileOutputStream("score.dat"));){
			
			//파일에 자료형별로 기록
			dout.writeUTF("홍길동");
			dout.writeInt(95);
			dout.writeChar('A');
			dout.writeUTF("이순신");
			dout.writeInt(87);
			dout.writeChar('B');
			dout.writeUTF("김철수");
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
			//파일에 더 이상 읽을 내용이 없을 때 발생하는 Exception이다.
			//발생할 수 밖에 없는 Exception이기 때문에 다음 처리 로직을 작성해준다.
			System.out.println("파일 읽기 완료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}









