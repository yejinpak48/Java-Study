package com.kh.inherit.part01_inheritTest.afterInherit.run;

import java.util.Date;

import com.kh.inherit.part01_inheritTest.afterInherit.model.vo.Desktop;
import com.kh.inherit.part01_inheritTest.afterInherit.model.vo.Television;

public class Run {

	public static void main(String[] args) {
		Television t 
		= new Television("»ï¼º", "03", "T-01234", "»ï¼ºTV", 
				500000, new Date(), 46);
		
		System.out.println(t.printInformation());
		
		Desktop d 
		= new Desktop("»ï¼º", "01", "S-01234", "¸ÅÁ÷½ºÅ×ÀÌ¼Ç2",
					1000000, new Date(), "ÄþÄÄ", 500, 8,
					"window10", false);
		
		System.out.println(d.printInformation());
		
		System.out.println(d.getBrand());
		
		
	}

}












