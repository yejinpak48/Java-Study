package com.kh.chap03_field.part01_kindsOfVariable;

//static Ű���忡 ���� ����
public class KindsOfVariable2 {
	//������������ static Ű���� ��� �����ϴ�.
	//�������� �׽�Ʈ
	public static int staticNum;
	
	//public ���������ڿ� static�� final Ű���带 �Բ� ����ϴ� ����
	//'����ʵ�' ��� �Ѵ�.
	//����ʵ�� �ݵ�� ����� ���ÿ� �ʱ�ȭ�� �Ǿ�� �Ѵ�.
	//���α׷� ���� �� static Ű���尡 ���� ����� ���� Ŭ��������(static area)��
	//����Ǳ� �빮�̴�.
	//���α׷� ���� �� ���� ����Ǹ� ������� �ʰ� ����� �������� ����Ѵ�.
	/*public static final int STATIC_NUM;*/
	
	//static ������ ��� ��ü�� ������ �������� ���Ǳ� ������ 
	//ĸ��ȭ ��Ģ�� ����ȴ�.
	//���� static Ű����� Ư���ϰ� ��Ȯ�� ������ ���� ��츸 ����Ѵ�.
	public static final int STATIC_NUM1 = 1;
	//static�� final�� ������ �ٲ㵵 ��� ����.
	public final static int STATIC_NUM2 = 1;
	
	public void methodTest() {
		//�������������� static Ű���� ����� �Ұ����ϴ�.
		//non-static �޼ҵ�� ��ü�� ��������� ȣ���ؾ߸� �����ϱ� ������
		//static Ű���带 ������ ���� �� ����.
		/*static int localStaticNum;*/
		
	}
	
	public static void staticMethodTest() {
		//static �޼ҵ� �������� static ���� ����� �Ұ����ϴ�.
		//static �޼ҵ� ���� ������ �������� �̰�,
		//�޼ҵ� ȣ�� �� stack�� �Ҵ��� �޴� �����̱� ������
		//static ������ �Ҵ��� �϶�� Ű����� ��� �Ұ����ϴ�.
		/*static int localStaticNum;*/
		
	}
	
}

















