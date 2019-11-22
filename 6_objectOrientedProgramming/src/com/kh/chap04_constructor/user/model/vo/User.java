package com.kh.chap04_constructor.user.model.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//�������� ��� ����
	//1. ��ü�� ������ �ֱ� ���� ����
	//2. �Ű������� ���� ���� ������ �ʵ带 �ʱ�ȭ �� ����
	
	//������ ���� ���ǻ���
	//1. �ݵ�� Ŭ������� �����ؾ� �Ѵ�(��/�ҹ���)
	//2. ������ �������� �ʴ´�(void, int, char, ...)
	
	//�⺻ ������ -> �ʵ��� �ʱ�ȭ ������ �������� ���ϰ� ��ü�� ������ �� ���
	//�Ű����� �ִ� �����ڸ� 1�� �̻� �ۼ��ϰ� �Ǹ�
	//�ڵ������� ���� �ʱ� ������ �ݵ�� ����ؾ� �Ѵ�.
	public User() {}
	
	//���� �̸��� ������ Ȥ�� �޼ҵ��� ��� ���� �߻��Ѵ�.
	/*public User() {}*/
	
	//�Ű����� �ִ� ������ -> ��ü ������  �ʵ带 �ʱ�ȭ�ϴ� �� ���� �������� ���ȴ�.
	//���� �̸��� ������ Ȥ�� �޼ҵ带 �ۼ��Ϸ��� �ϴ� ��� �����ε��� ����Ѵ�.
	public User(String userId, String userPwd, String userName) {
		//this.�� �޼ҵ� ���� ������ ä �����ϴ� ���۷��� ������,
		//�Ҵ�� ��ü �ڽ��� �ּҸ� �����Ѵ�.
		//���������� �ʵ� �̸��� ������ ��� ���������� �켱�� �Ǳ� ������
		//�ʵ带 �����ϱ� ���ؼ� �ݵ�� this.�� ����� �־�� �Ѵ�.
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, 
				String userName, Date enrollDate) {
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		//�ߺ��Ǵ� ������ �ʱ�ȭ �ϴ� ������ �����ڰ� �����ϴ� ���
		//this()�� ����� �� �ִ�.
		this(userId, userPwd, userName);
		
		this.enrollDate = enrollDate;
	}
	
	//setter/getter �ۼ�
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public void information() {
		System.out.println(userId + ", " + userPwd + ", " 
						+ userName + ", " + enrollDate);
	}
}


















