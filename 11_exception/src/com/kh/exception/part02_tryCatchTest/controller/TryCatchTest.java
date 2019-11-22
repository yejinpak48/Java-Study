package com.kh.exception.part02_tryCatchTest.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TryCatchTest {
	
	public void methodA() {
		System.out.println("methodA() 호출됨...");
		
		try {
			methodB();
			
			System.out.println("예외 발생시에는 출력되지 않음");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행됨...");
		}
		
		System.out.println("methodA() 종료됨...");
	}
	public void methodB() throws Exception {
		System.out.println("methodB() 호출됨...");
		
		throw new Exception("강제로 예외를 발생시켰습니다.");
		
		/*System.out.println("methodB() 종료됨...");*/
	}
	
	public void ioTest() {
		BufferedReader in = null;
		
		try {
			//FileReader라는 객체를 생성시 예외가 발생한다.
			//사용하려는 쪽에서 반드시 예외처리를 해야 하기 때문에
			//try-catch블럭 안에서 작성해야 한다.
			in = new BufferedReader(new FileReader("test.dat"));
			String s;
			
			//readLine메소드도 API에서 확인해보면
			//IOException을 발생시켜 놓았기 때문에
			//catch블럭을 추가해서 예외처리 구문을 작성해야 한다.
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
			//FileNotFoundException과 EOFException을 동시에 처리할 수 있다.
			//같은 레벨의 자손을 한번에 처리할 수 있는 것이다.
		} catch (FileNotFoundException | EOFException e) {
			//읽으려고 하는 파일이 존재하지 않는 경우 발생하는 예외이다.
			//java.io.FileReader 생성자에 예외를 위임하는
			//throws구문이 작성되어 있기 때문에
			//사용하는 측에서 (호출하는 구문) 반드시 예외처리를 해 주어야 한다.
			e.printStackTrace();
		} catch (IOException e) {
			//입출력에 관한 예외로, 파일의 데이터를 읽는 과정에서 발생하는
			//예외를 정의해 놓은 클래스이다.
			//FileNotFoundException은 IOException의 후손이다.
			
			//catch블럭은 여러개를 작성할 시 상위타입이 하단에 오고
			//후손 타입이 먼저 작성되어야 한다.
			e.printStackTrace();
		} finally {
			//예외처리 구문과 상관 없이 반드시 수행해야 하는 경우 작성을 하며
			//보통 사용한 자원을 반납할 목적으로 사용하게 된다.
			try {
				//실행하면 NullPointerException이 발생한다.
				//파일을 찾지 못해서 객체를 생성하지 못하고 null값을 가진다.
				//null을 참조하고 있는 것을 닫을 수 없기 때문에 발생하는 예외이다.
				//NullPointerException은 unchecked exception으로
				//try-catch로 처리하기 보다는
				//보통 if-else 구문으로 해결한다.
				if(in != null) {
					//입출력에 사용한 스트림을 닫아주는 메소드이다.
					//API에서 확인하면 IOException을 위임한 메소드이기 때문에
					//finally 블럭 내에서 예외처리를 중첩으로 해 주어야 한다.
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ioTest2() {
		//반납할 자원이 있는 경우 try-with-resource구문으로 처리할 수 있다.
		//꼭 반납을 해야 하는 경우 try() 괄호 안에 객체를 생성할 수 있으며,
		//여러 객체를 한번에 생성할 수 도 있다.
		//하지만 선언한 레퍼런스는 try 블럭 내에서만 사용 가능하다.
		try(BufferedReader br 
				= new BufferedReader(
						new InputStreamReader(System.in));
				BufferedWriter bw 
					= new BufferedWriter(
							new OutputStreamWriter(System.out));){
			
			System.out.print("숫자 한 개 입력 : ");
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			bw.write("입력한 숫자의 2배는 : " + (num * 2));
			
		}catch(Exception e) {
			//가장 상위의 Exception만 catch블럭으로 처리하면
			//발생한 하위 Exception클래스의 처리를 한번에 할 수 있지만,
			//예외별로 처리 구문을 따로 작성할 수 없기 때문에
			//권장하는 사항은 아니다.
			e.printStackTrace();
		}
	}
}




















