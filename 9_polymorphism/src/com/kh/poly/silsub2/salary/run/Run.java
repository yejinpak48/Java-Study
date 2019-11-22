package com.kh.poly.silsub2.salary.run;

import com.kh.poly.silsub2.salary.controller.Calculate;
import com.kh.poly.silsub2.salary.controller.CalculateImpe;
import com.kh.poly.silsub2.salary.model.vo.PayTable;
import com.kh.poly.silsub2.salary.model.vo.Salary;

public class Run {

	public static void main(String[] args) {
		Salary[] sarr = new Salary[3];
		sarr[0] = new PayTable("�Ҽ���",750000,2,3);
		sarr[1] = new PayTable("���ָ�",800000,1,4);
		sarr[2] = new PayTable("���ȸ�",650000,6,2);
		
		Calculate c = new CalculateImpe();
		c.calc(sarr);
	}

}
