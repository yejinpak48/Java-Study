package com.kh.io.part04_objectStream.model.vo;

//MVC ���������� : Model View Controller
//Model�� vo(value object)�� �ش��ϴ� Ŭ����
//vo : ���� Ÿ���� ����� �Ӽ��� �ϳ��� ���� ���� Ŭ������
//     �ַ� �����͸� ��� ������ �ϱ� ���� ����Ѵ�.
// == dto(data transfer object)

//vo�� �Ǳ� ���� ����
//1. ��� �ʵ�� �ݵ�� private���� ��
//2. ��� �ʵ忡 ���� getter�� setter�� �ۼ��Ǿ�� ��
//3. �ݵ�� �⺻�����ڿ� �Ű����� �ִ� �����ڸ� ������ �־�� ��
//(��� �ʵ带 �ʱ�ȭ�ϴ� ������)
//4. �ݵ�� ����ȭ ó�� �Ǿ�� ��
public class Member implements java.io.Serializable{
	
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private int age;
	private char gender;
	//transient Ű����� ����ȭ���� �����Ѵ�.
	private transient double point;
	
	public Member() {}

	public Member(String userId, String userPwd, String userName, String email, int age, char gender, double point) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
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

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getPoint() {
		return point;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", point=" + point + "]";
	}
	
	
	
}















