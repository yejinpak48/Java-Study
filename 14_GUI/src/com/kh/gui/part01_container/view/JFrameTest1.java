package com.kh.gui.part01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JFrameTest1 extends JFrame{
	//프레임을 생성하는 방법1
	//javax.swing.JFrame 클래스를 상속받아 생성자에서 프레임에 대한 설정 후
	//다른 클래스에서 호출하는 방식
	public JFrameTest1() {
		//프레임의 크기 설정
		/*this.setLocation(300, 200);
		this.setSize(800, 500);*/
		
		//위치와 사이즈 지정을 한번에 할 수도 있다.
		this.setBounds(300, 200, 800, 500);
		
		this.setTitle("My Frame");
		
		try {
			this.setIconImage(ImageIO.read(new File("images/icon.PNG")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//나타난 프레임은 기본값으로 프레임 사이즈 조정이 활성화 되어 있음
		//true로 값을 넣으면 사이즈가 조정됨(기본값)
		//false로 변경하면 사이즈 조정이 안됨
		this.setResizable(false);
		
		//아래 두 개의 메소드는 필수 설정값이기 때문에 반드시 작성해야 하며
		//가장 하단에 작성해 주는 것이 좋다.
		
		//크기와 위치를 지정하더라도 프레임을 보여지게 하는 메소드를 호출해야 한다.
		this.setVisible(true);
		
		//닫기버튼(x 버튼)을 눌러도 프로세스는 계속 실행중이다.
		//아래 메소드를 실행시켜야 프레임을 종료 시 프로세스도 정상 종료된다.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

















