package com.kh.exception.silsub1.controller;

import com.kh.exception.silsub1.exception.NumberRangeException;
import com.kh.exception.silsub1.view.ConsoleIO;

public class NumberProcess {

	public void checkDouble(int num1, int num2) throws NumberRangeException {
		
		boolean isTrue = false;
		
		if(num2 == num1 * 2){
			isTrue = true;
		}
		
		if(num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100){
			throw new NumberRangeException("1부터 100 사이의 값이 아닙니다!");
		}
		
		ConsoleIO cio = new ConsoleIO();
		cio.numberOutput(isTrue);
		
	}

}
