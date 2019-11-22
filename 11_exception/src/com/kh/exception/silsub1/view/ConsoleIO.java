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
			System.out.print("문자열을 입력하세요 : ");
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
		System.out.println("입력하신 문자열 " + str + "에 포함된 알파벳 수는 " + count + "개 입니다.");
	}
	
	public void numberInput(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		
		try {
			System.out.print("첫 번째 정수 입력 : ");
			String str1 = br.readLine();
			System.out.print("두 번째 정수 입력 : ");
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
		System.out.println("수행 결과는 " + isTrue + "입니다.");
	}

}
