package com.kh.inherit.part01_inheritTest.beforeInherit.run;

import java.util.Date;

import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.Desktop;
import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.SmartPhone;
import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		Desktop d 
		= new Desktop("�Ｚ", "01", "S-01234", "���������̼�2",
				"i7", 500, 8, "window8", 
				1000000, new Date(), true);
		
		SmartPhone s 
		= new SmartPhone("�Ｚ", "02", "G-01234", "�����ó�Ʈ8",
				"����", 1024, 8, "android", 
				800000, new Date(), "SK"); 
		
		Television t = new Television("�Ｚ", "03", 
									"T-01234", "�ＺTV",
									500000, new Date(), 46);
		
		d.printInformation();
		s.printInformation();
		t.printInformation();
	}

}














