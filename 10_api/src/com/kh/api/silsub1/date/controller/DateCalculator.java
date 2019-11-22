package com.kh.api.silsub1.date.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	public long getDays() {
		long sumDays = 0;
		
		Calendar today = new GregorianCalendar();
		Calendar cal = new GregorianCalendar(1, 0, 1);
		
		//작년 12월 31일까지 구하는 구문
		for(int i = cal.get(Calendar.YEAR); i < today.get(Calendar.YEAR); i++) {
			if(isLeapYear(i)) {
				sumDays += 366;
			}else {
				sumDays += 365;
			}
		}
		
		//올해 1월 1일부터 날 수 구하는 구문	
		int feb = isLeapYear(today.get(Calendar.YEAR))?29:28;
		
		for(int i = cal.get(Calendar.MONTH) + 1; i <= today.get(Calendar.MONTH); i++) { 
			if(i == 2) {
				sumDays += feb;
			}else if((i % 2 != 0 && i < 8) || (i % 2 == 0 && i > 7)) {
				sumDays += 31;
			} else {
				sumDays += 30;
			}
		}
		
		sumDays += today.get(Calendar.DATE);
		
		return sumDays;
	}
	
	public boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}
}
