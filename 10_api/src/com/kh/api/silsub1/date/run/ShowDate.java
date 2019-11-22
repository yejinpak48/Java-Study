package com.kh.api.silsub1.date.run;

import java.util.Calendar;

import com.kh.api.silsub1.date.controller.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		
		Calendar today = Calendar.getInstance();

		System.out.println(totalDay.isLeapYear(today.get(Calendar.YEAR)) == true ? "올해는 윤년입니다." : "올해는 평년입니다.");

		long total = totalDay.getDays();
		
		System.out.println("총날짜수 : " + total);

	}

}
