package com.kh.io.silsub3.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.kh.io.silsub3.model.vo.Sungjuk;

public class SungjukDao {

	public void sungjukSave(Sungjuk s) {
		DataOutputStream dout = null;
		
		try {
			dout = new DataOutputStream(new FileOutputStream("score.dat", true));
			
			dout.writeInt(s.getKor());
			dout.writeInt(s.getEng());
			dout.writeInt(s.getMath());
			dout.writeDouble(s.getTotal());
			dout.writeDouble(s.getAvg());
			
			System.out.println("score.dat �� ���� �Ϸ�...");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				dout.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	public void sungjukOpen() {
		double totalSum = 0;
		double totalAvg = 0;
		int count = 0;
		
		try(DataInputStream din = 
				new DataInputStream(new FileInputStream("score.dat"))){
			do{
				int kor = din.readInt();
				int eng = din.readInt();
				int mat = din.readInt();
				double total = din.readDouble();
				double avg = din.readDouble();
				
				System.out.printf("���� : %-5d ���� : %-5d ���� : %-5d  ���� : %.2f ��� : %.2f\n", 
						kor, eng, mat, total, avg);
				
				totalSum += total;
				totalAvg += avg;
				count++;

			}while(true);
			
		}catch(EOFException e){
			System.out.printf("�ο��� : %-5d ���� ���: %.2f ��ü ��� : %.2f\n", 
					count, totalSum/count, totalAvg/count);
			System.out.println("score.dat ���� �б� �Ϸ�...");
			
		}catch(IOException e){
			System.out.println("score.dat ���� �б� ����...");
			e.printStackTrace();
		}
		
	}

}
