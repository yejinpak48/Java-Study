package com.kh.collection.part03_map.properties.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public void testProperties() {
		//Properties test
		//설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			prop.store(new FileWriter("driver.txt"), "jdbc driver");
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void testProperties2() {
		//파일로부터 읽어와서 Properties에 기록
		Properties prop = new Properties();
		
		try {
			//prop.load(new FileInputStream("driver.dat"));
			//prop.load(new FileReader("driver.txt"));
			prop.loadFromXML(new FileInputStream("driver.xml"));
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



















