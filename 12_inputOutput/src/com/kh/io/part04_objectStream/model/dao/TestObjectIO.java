package com.kh.io.part04_objectStream.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.io.part04_objectStream.model.vo.Member;

public class TestObjectIO {
	
	public void fileSave() {
		Member[] mar = {
			new Member("user01", "pass01", "ȫ�浿", 
					"hong123@kh.or.kr", 25, '��', 1520.7),
			new Member("user02", "pass02", "������", 
					"yoo123@kh.or.kr", 16, '��', 1250.7),
			new Member("user03", "pass03", "�̼���", 
					"lee123@kh.or.kr", 22, '��', 1320.5)
		};
		
		try(ObjectOutputStream objOut =
				new ObjectOutputStream(
						new FileOutputStream("member.dat"))){
			
			for(int i = 0; i < mar.length; i++) {
				objOut.writeObject(mar[i]);
			}
			
			objOut.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Member[] mar = new Member[3];
		
		try(ObjectInputStream objIn =
				new ObjectInputStream(
						new FileInputStream("member.dat"))) {
			for(int i = 0; i < mar.length; i++) {
				mar[i] = (Member) objIn.readObject();
			}
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}






















