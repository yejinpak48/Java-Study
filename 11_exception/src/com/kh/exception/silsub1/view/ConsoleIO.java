package com.kh.exception.silsub1.view;

import java.io.*;

import com.kh.exception.silsub1.controller.CharacterProcess;
import com.kh.exception.silsub1.controller.NumberProcess;
import com.kh.exception.silsub1.exception.CharCheckException;
import com.kh.exception.silsub1.exception.NumberRangeException;

public class ConsoleIO {

	public void charInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		try {
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			str = br.readLine();
			
			CharacterProcess cp = new CharacterProcess();
			cp.countAlpha(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public void charOutput(String str, int count){
		System.out.println("�Է��Ͻ� ���ڿ� " + str + "�� ���Ե� ���ĺ� ���� " + count + "�� �Դϴ�.");
	}
	
	public void numberInput(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		
		try {
			System.out.print("ù ��° ���� �Է� : ");
			String str1 = br.readLine();
			System.out.print("�� ��° ���� �Է� : ");
			String str2 = br.readLine();
			
			num1 = Integer.parseInt(str1);
			num2 = Integer.parseInt(str2);
			
			NumberProcess np = new NumberProcess();
			np.checkDouble(num1, num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void numberOutput(boolean isTrue){
		System.out.println("���� ����� " + isTrue + "�Դϴ�.");
	}

}
