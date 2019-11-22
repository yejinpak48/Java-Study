package com.kh.poly.silsub2.salary.controller;

import com.kh.poly.silsub2.salary.model.vo.Salary;

public interface Calculate {
	//급여 계산용 메소드
	void calc(Salary[] sarr);
}
