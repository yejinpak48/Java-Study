package com.kh.api.silsub1.date.run;

import java.util.Calendar;

import com.kh.api.silsub1.date.controller.DateCalculator;

public class ShowDate {

	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		
		Calendar today = Calendar.getInstance();

		System.out.println(totalDay.isLeapYear(today.get(Calendar.YEAR)) == true ? "���ش� �����Դϴ�." : "���ش� ����Դϴ�.");

		long total = totalDay.getDays();
		
		System.out.println("�ѳ�¥�� : " + total);

	}

}
