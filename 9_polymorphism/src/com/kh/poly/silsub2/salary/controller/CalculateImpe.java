package com.kh.poly.silsub2.salary.controller;

import com.kh.poly.silsub2.salary.model.vo.Salary;
import com.kh.poly.silsub2.salary.view.Output;
import com.kh.poly.silsub2.salary.view.OutputImpl;

public class CalculateImpe implements Calculate{

	@Override
	public void calc(Salary[] sarr) {
		/*1. 가족수당 : 가족이 3명 미만이면 가족수 *20000, 3명 이상이면 무조건 60000
		2. 시간외수당 : 시간외근무 * 5000
		3. 세금 : 기본급의 10%
		4. 성과금 : 인센티브 * 기본급
		5. 실수령액 : 기본급 + 가족수당 + 성과금 + 시간외수당 - 세금*/
		for(int i = 0; i < sarr.length; i++){
			if(sarr[i].getFamily() < 3){
				sarr[i].setFamilyP(sarr[i].getFamily() * 20000);
			}else{
				sarr[i].setFamilyP(60000);
			}
			
			sarr[i].setOvertimeP(sarr[i].getOvertime() * 5000);
			
			sarr[i].setTax(sarr[i].getPay() / 10);
			
			sarr[i].setIncenP((long)(sarr[i].getIncentive() * sarr[i].getPay()));
			
			sarr[i].setTotalPay(sarr[i].getPay() + sarr[i].getFamilyP() + sarr[i].getIncenP() + sarr[i].getOvertimeP() - sarr[i].getTax());
			
			
		}
		
		Output o = new OutputImpl();
		o.out(sarr);
		
	}

	

}
