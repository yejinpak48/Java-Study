package com.kh.silsub3.member.view;

import java.util.Scanner;

import com.kh.silsub3.member.controller.MemberManager;
import com.kh.silsub3.member.model.vo.Member;

public class MemberMenu {
	//키보드 입력용 객체 초기화
	Scanner sc = new Scanner(System.in);
	//회원관리 클래스 객체 생성 초기화
	MemberManager mManager = new MemberManager();
	Member m = new Member();

	//디폴트생성자
	public MemberMenu(){}

	//메소드 작성
	public void mainMenu(){
		do{
			System.out.println();
			System.out.println("최대 등록 가능한 회원 수는 " + mManager.SIZE + "명 입니다.");
			System.out.println("현재 등록된 회원수는 "  + mManager.memberCount() + "명 입니다.");

			System.out.println();
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println();
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : mManager.memberInput(); break;
			case 2 : searchMenu(); break;
			case 3 : modifyMenu(); break;
			case 4 : sortMenu(); break;
			case 5 : mManager.deleteMember(); break;
			case 6 : mManager.printAllMember(); break;
			case 9 : 
				System.out.print("정말로 끝내시겠습니까?(y/n) : ");
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y') return;
			}
		}while(true);

	}

	public void searchMenu(){
		// 회원 조회 (equals 사용)
		do{
			System.out.println();
			System.out.println("***** 회원 정보 검색 메뉴 *****");
			System.out.println();
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				System.out.print("검색할 아이디를 입력하세요 : ");
				int index =	mManager.searchMemberId(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;
			case 2 : 
				System.out.print("검색할 이름을 입력하세요 : ");
				index = mManager.searchMemberName(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;
			case 3 : 
				System.out.print("검색할 이메일 주소를 입력하세요 : ");
				index =	mManager.searchMemberEmail(sc.next());
				if(index > -1)
					mManager.printMember(index); 
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;
			case 9 : 
				System.out.println("메인 메뉴로 이동합니다.");
				return;
			}
		}while(true);

	}

	public void sortMenu(){
		//회원 정보 정렬 (compareto 사용)
		do{
			System.out.println();
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
			System.out.println();
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력");
			System.out.println("9. 이전메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				mManager.sortIDAsc();
				break;
			case 2 : mManager.sortIDDes(); break;
			case 3 : mManager.sortAgeAsc(); break;
			case 4 : mManager.sortAgeDes(); break;
			case 5 : mManager.sortGenderDes(); break;
			case 9 : 
				System.out.println("메인 메뉴로 화면 이동 합니다.");
				return;
			}
		}while(true);
	}

	public void modifyMenu(){
		//회원 정보 수정 (setter 사용)
		do{
			System.out.println();
			System.out.println("***** 회원 정보 수정 메뉴 *****");
			System.out.println();
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();

			switch(no){
			case 1 : 
				System.out.print("변경할 아이디를 입력하세요 : ");
				int index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("변경할 패스워드를 입력하세요 : ");
					mManager.mar[index].setPassword(sc.next());
					mManager.printMember(index); 
					System.out.println("회원님의 정보가 변경되었습니다.");
				}
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;				
			case 2 :
				System.out.print("변경할 아이디를 입력하세요 : ");
				index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("변경할 이메일 주소를 입력하세요 : ");
					mManager.mar[index].setEmail(sc.next());
					mManager.printMember(index); 
					System.out.println("회원님의 정보가 변경되었습니다.");
				}
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;
			case 3 :
				System.out.print("변경할 아이디를 입력하세요 : ");
				index =	mManager.searchMemberId(sc.next());
				if(index > -1){
					mManager.printMember(index); 
					System.out.print("변경할 나이를 입력하세요 : ");
					mManager.mar[index].setAge(sc.nextInt());
					mManager.printMember(index); 
					System.out.println("회원님의 정보가 변경되었습니다.");
				}
				else 
					System.out.println("회원 정보가 존재하지 않습니다.");
				break;
			case 9 :
				System.out.println("메인 메뉴로 이동합니다.");
				return;
			}
		}while(true);
	}
}
