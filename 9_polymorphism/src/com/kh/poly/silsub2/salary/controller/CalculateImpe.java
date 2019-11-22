package com.kh.poly.silsub2.salary.controller;

import com.kh.poly.silsub2.salary.model.vo.Salary;
import com.kh.poly.silsub2.salary.view.Output;
import com.kh.poly.silsub2.salary.view.OutputImpl;

public class CalculateImpe implements Calculate{

	@Override
	public void calc(Salary[] sarr) {
		/*1. �������� : ������ 3�� �̸��̸� ������ *20000, 3�� �̻��̸� ������ 60000
		2. �ð��ܼ��� : �ð��ܱٹ� * 5000
		3. ���� : �⺻���� 10%
		4. ������ : �μ�Ƽ�� * �⺻��
		5. �Ǽ��ɾ� : �⺻�� + �������� + ������ + �ð��ܼ��� - ����*/
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
