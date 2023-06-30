//package Week3_02_mini_project;
//import java.util.*;
//
///*
//1. 회원가입
//2. 로그인
//*/
//
//class MemberInfo // 한 명의 회원정보를 저정하기 위한 클래스  
//{
//	private String uid, pwd, name;
//	
//}
//
//class MemberHandler
//{
//	private MemberInfo[] members;
//	private int idx;
//
//	
//
//	public void memberInsert(){ //회원가입용 메소드
//		
//	}
//
//	private boolean isUniqueID(String uid){ // 아이디의 중복 여부를 리턴
//		return false;
//	}
//
//	public void memberLoginEx(){ // 회원로그인용 메소드
//		
//
//		/*
//		로그인 성공시 : "로그인 되었습니다." 메세지 출력
//		로그인 실패시 : "존재하지 않는 아이디 입니다." or "암호가 잘못되었습니다." 중 하나를 출력
//		*/
//	}
//
//	public void memberLogin(){
//		
//}
//
//public class MemberManage
//{
//	public static void main(String[] args) 
//	{
//		MemberHandler handler = new MemberHandler(100);
//
//		while (true)
//		{
//			System.out.println("------- 메뉴 선택 -------");
//			System.out.println("1. 회원가입");
//			System.out.println("2. 로 그 인");
//			System.out.println("9. 프로그램 종료");
//
//			Scanner sc = new Scanner(System.in);
//			int choice = sc.nextInt();
//
//			switch (choice)
//			{
//			case 1:
//				handler.memberInsert(); break;
//			case 2:
//				handler.memberLogin(); break;
//			case 9:
//				System.out.println("프로그램 종료");
//				return;
//			}
//
//		}
//	}
//}