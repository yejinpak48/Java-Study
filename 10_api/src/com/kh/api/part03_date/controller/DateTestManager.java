package com.kh.api.part03_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTestManager {
	
	public void testDate() {
		//Date클래스는 기본생성자와 long형 값을 받는
		//두 개의 생성자 외에는 Deprecated 되어 있다.
		
		//default constructor는 현재 시간에 대한 정보를 가지고 객체를 생성한다.
		Date today = new Date();
		
		System.out.println(today);
		
		//1970년 1월 1일 00시 00분 00초 이후로 흐른 시간을 ms단위로 리턴
		System.out.println(today.getTime());
		
		
		//Date(long date) 사용하는 방법
		Date time = new Date(1555290191536L);
		
	}
	
	public void testCalandar() {
		//api를 확인해 보면 Calendar클래스는 추상클래스이다.
		//=>객체를 생성하지 못한다.
		//객체를 생성하려면 후손클래스인 GregorianCalendar로 객체를 생성하던
		//혹은 getInstance()메소드를 호출해서 객체를 생성해야 한다.
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		
		//다형성 적용하여 후손 클래스로 객체 생성
		Calendar gc = new GregorianCalendar();
		
		System.out.println(gc);
		
		//년, 월, 일, 시, 분, 초 등의 정보를 Calendar클래스의 상수로 제공한다.
		//날짜 값을 구하기 위해서는 get이라는 메소드에 상수값을 전달하여
		//날짜를 리턴받아 사용한다.
		/*System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		System.out.println(c.get(Calendar.YEAR));*/
		
		int year = c.get(Calendar.YEAR);
		//월은 0부터 시작하기 때문에 반드시 +1을 해 줘야 한다.
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		//오전 오후의 경우 0은 오전, 1은 오후를 나타낸다.
		String sAmPm = (amPm == Calendar.AM)?"오전":"오후";
		
		System.out.println(year + "년 "
				 		+ month + "월 "
				 		+ date  + "일 "
				 		+ sAmPm + " "
				 		+ hour + "시 "
				 		+ min + "분 " 
				 		+ sec + "초");
		
	}
	
	public void testDateFormat() {
		//종강일에 대한 Date 객체 생성하여 포맷 출력하기
		int year = 2019;
		int month = 9;
		int day = 1;
		int hour = 15;
		int min = 20;
		int sec = 0;
		
		/*Calendar c 
			= new GregorianCalendar(year, month, day, hour, min, sec);
		long time = c.getTimeInMillis();
		Date endDay = new Date(time);*/
		
		Date endDay = new Date(
				new GregorianCalendar(
						year, month, day, hour, min, sec)
							.getTimeInMillis());
		
		System.out.println(endDay);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd E요일 hh시 mm분 ss초");
		
		String fmtToday = sdf.format(endDay);
		
		System.out.println(fmtToday);
	}
}
























