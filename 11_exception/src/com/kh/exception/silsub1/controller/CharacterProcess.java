package com.kh.exception.silsub1.controller;

import com.kh.exception.silsub1.exception.CharCheckException;
import com.kh.exception.silsub1.view.ConsoleIO;

public class CharacterProcess {
	public void countAlpha(String str) throws CharCheckException{
		int count = 0;
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
				count++;
			}
			
			if(ch == ' '){
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ���� ������ �� �����ϴ�.");
			}
		}
		
		ConsoleIO cio = new ConsoleIO();
		cio.charOutput(str, count);
	}
}
