package com.kh.silsub1.member.model.vo;

/*import java.lang.*;*/

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//�⺻������(default constructor)
	//��ü�� �����ϱ� ���ؼ� ����Ѵ�.
	public Member() {}
	
	//setter �޼ҵ�
	//�ʵ尪 ������ ���� ����ϴ� �޼ҵ��̴�.
	//��ȣ �ȿ� ����� ������ �Ű�������� �ϸ�,
	//���޹��� �Ű����� ������ �ʵ� ���� �����Ѵ�.
	public void setMemberId(String memberId) {
		/*memberId = changeMemberId;*/
		//�ʵ��� ���������� ���� �̸��̸� ���������� �켱���� ������.
		//���� �̸��� �ʵ带 ����� ���� this.�� ����ؾ� �Ѵ�.
		this.memberId = memberId;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
		/*return;*/
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//getter�޼ҵ�
	//�ʵ忡 ���� �����Ͽ� ���� �� �� ���� ������,
	//�ش� ��ü�� ���� ���� �˰� ���� ���� getter�޼ҵ带 ����Ѵ�.
	public String getMemberId() {
		return /*this.*/memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
}






















