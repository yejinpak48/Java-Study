package com.kh.api.part03_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTestManager {
	
	public void testDate() {
		//DateŬ������ �⺻�����ڿ� long�� ���� �޴�
		//�� ���� ������ �ܿ��� Deprecated �Ǿ� �ִ�.
		
		//default constructor�� ���� �ð��� ���� ������ ������ ��ü�� �����Ѵ�.
		Date today = new Date();
		
		System.out.println(today);
		
		//1970�� 1�� 1�� 00�� 00�� 00�� ���ķ� �帥 �ð��� ms������ ����
		System.out.println(today.getTime());
		
		
		//Date(long date) ����ϴ� ���
		Date time = new Date(1555290191536L);
		
	}
	
	public void testCalandar() {
		//api�� Ȯ���� ���� CalendarŬ������ �߻�Ŭ�����̴�.
		//=>��ü�� �������� ���Ѵ�.
		//��ü�� �����Ϸ��� �ļ�Ŭ������ GregorianCalendar�� ��ü�� �����ϴ�
		//Ȥ�� getInstance()�޼ҵ带 ȣ���ؼ� ��ü�� �����ؾ� �Ѵ�.
		Calendar c = Calendar.getInstance();
		
		System.out.println(c);
		
		//������ �����Ͽ� �ļ� Ŭ������ ��ü ����
		Calendar gc = new GregorianCalendar();
		
		System.out.println(gc);
		
		//��, ��, ��, ��, ��, �� ���� ������ CalendarŬ������ ����� �����Ѵ�.
		//��¥ ���� ���ϱ� ���ؼ��� get�̶�� �޼ҵ忡 ������� �����Ͽ�
		//��¥�� ���Ϲ޾� ����Ѵ�.
		/*System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		System.out.println(c.get(Calendar.YEAR));*/
		
		int year = c.get(Calendar.YEAR);
		//���� 0���� �����ϱ� ������ �ݵ�� +1�� �� ��� �Ѵ�.
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int amPm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		//���� ������ ��� 0�� ����, 1�� ���ĸ� ��Ÿ����.
		String sAmPm = (amPm == Calendar.AM)?"����":"����";
		
		System.out.println(year + "�� "
				 		+ month + "�� "
				 		+ date  + "�� "
				 		+ sAmPm + " "
				 		+ hour + "�� "
				 		+ min + "�� " 
				 		+ sec + "��");
		
	}
	
	public void testDateFormat() {
		//�����Ͽ� ���� Date ��ü �����Ͽ� ���� ����ϱ�
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
				new SimpleDateFormat("yyyy-MM-dd E���� hh�� mm�� ss��");
		
		String fmtToday = sdf.format(endDay);
		
		System.out.println(fmtToday);
	}
}
























