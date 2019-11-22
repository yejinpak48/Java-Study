package com.kh.inherit.part01_inheritTest.beforeInherit.run;

import java.util.Date;

import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.Desktop;
import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.SmartPhone;
import com.kh.inherit.part01_inheritTest.beforeInherit.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		Desktop d 
		= new Desktop("»ï¼º", "01", "S-01234", "¸ÅÁ÷½ºÅ×ÀÌ¼Ç2",
				"i7", 500, 8, "window8", 
				1000000, new Date(), true);
		
		SmartPhone s 
		= new SmartPhone("»ï¼º", "02", "G-01234", "°¶·°½Ã³ëÆ®8",
				"ÄþÄÄ", 1024, 8, "android", 
				800000, new Date(), "SK"); 
		
		Television t = new Television("»ï¼º", "03", 
									"T-01234", "»ï¼ºTV",
									500000, new Date(), 46);
		
		d.printInformation();
		s.printInformation();
		t.printInformation();
	}

}














