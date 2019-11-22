package com.kh.poly.silsub2.salary.view;

import com.kh.poly.silsub2.salary.model.vo.Salary;

public class OutputImpl implements Output{

	@Override
	public void out(Salary[] sarr) {
		System.out.println("                                    **** 급여 명세서 ****                                ");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("  이름     기본급     가족수   가족수당    시간외근무     시간외수당       세금        인센티브(%)   성과금         실수령액");
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(int i = 0; i < sarr.length; i++){
			System.out.println(sarr[i].getName() + "   " + sarr[i].getPay() + "   " + sarr[i].getFamily() + "    " +  sarr[i].getFamilyP() + "      " + sarr[i].getOvertime() + "       " 
							+ sarr[i].getOvertimeP() + "    " + sarr[i].getTax() + "      " + sarr[i].getIncentive() + "      " + sarr[i].getIncenP() + "   " + sarr[i].getTotalPay());
		}
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("인원수 : " + sarr.length + "명");
	}

}
