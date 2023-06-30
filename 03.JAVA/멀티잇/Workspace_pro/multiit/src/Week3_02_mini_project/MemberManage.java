package Week3_02_mini_project;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
1. 회원가입
2. 로그인
*/

class MemberInfo // 한 명의 회원정보를 저정하기 위한 클래스 -VO (Value Object)
{
	private String uid, pwd, name,tel,email; //private로 정보 은닉!!
	
	//생성자를 통해 uid ,pwd , name 초기화 해주세요
	public MemberInfo() {} //디폴트는 그냥 만들어둬!!
	
	// 오버로딩 : 같은 이름을 가진 함수를 다른 기능으로
	public MemberInfo(String uid,String pwd,String name,String tel,String email)  // 파라미터 주고!!!
	{
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String getPwd()
	{
		return pwd;
	}

	public void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	

	public String getUid()
	{
		return uid;
	}

	public void setUid(String uid)
	{
		this.uid = uid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTel()
	{
		return tel;
	}

	public String getEmail()
	{
		return email;
	}
	



}





class MemberHandler  //회원의 가입과 로그인 관련 기능을 관리자 DAO ( Data Access Object)
{
	private MemberInfo[] members;  //배열은 순차적인 (입력되는 순서대로)저장하여 관리하는 데이터 자료구조
	private int idx;  //MemberInfo 타입의 배열만의 회원의 정보들은 접근하기 위한 인덱스 저장
	private int count;
	
	
	public MemberHandler() {} //기본 디폴트 후 오버로딩 해야지?
	
	public MemberHandler(int number) {
		
		//MemberHandler 생성자를 통해서 members(회원의 수)를 초기화 주세요
		// idx =0; 으로 초기화
		
		members = new MemberInfo[number];  
		//this.idx = idx; //그냥 초기화
		idx =0;
	}
	

	// 여기 중요
	public void memberInsert() throws MemberNotExitException{ //회원가입용 메소드
		
		String uid,pwd,name, tel = null, email = null; // 이 함수 안에서는 내가 control 할 수 있으니까
		Scanner in = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		uid = in.nextLine();
		
		//아이디 중복체크
		if (!isUniqueID(uid)) { //잘 따져봐!!!
			System.out.println("이미 사용중인 아이디입니다");
			return; // 여기서 끝
		}
		
		System.out.println("패스워드 : ");
		pwd = in.nextLine();
		
		System.out.println("이름 : ");
		name = in.nextLine();
		
		try
		{
			System.out.print("전화번호: ");
			tel = in.nextLine().trim();
			checkTel(tel);
			System.out.print("이메일: ");
			email = in.nextLine().trim();
			checkEmail(email);
		} catch (MemberNotExitException e)
		{
			System.out.println(e.getMessage());
			return;
		}
		
		//매우 중요!!! 
		//members에 입력 받은 회원의 정보(uid pwd,name) 저장
		members[idx] = new MemberInfo(uid, pwd, name, tel, email);
		idx++;
		System.out.println("가입 완료!!");
	}

	
	// 아이디의 중복 여부를 리턴
	private boolean isUniqueID(String uid){ 
		if(idx ==0 ) return true;  //중복
		for (int i =0;i<idx;i++) {
			if(members[i].getUid().equals(uid))  return false;
			// 
		}
		
		return true;
	}
	
	
	
	// MemberXNotExitException 생성해서 "존재하지 않는 아이디입니다"메세지 예외처리 해보기!
	public void searchId(String uid) throws MemberNotExitException
	{
		boolean check = false;
		
		for (int i = 0; i < idx; i++)
		{
			if (uid.equals(members[i].getUid()))
			{
				check = true;
				count = i;
			}
		}
		if (check == false)
		{
			throw new MemberNotExitException("존재하지 않는 아이디입니다");
		}

	}
	
	// MemberXNotExitException 생성해서  패스워드를 검증하는 searchPwd(pwd) 해당패스워드가 맞지않으면 패스워드 불일치 메세지를 전달
	public void searchPwd(String pwd) throws MemberNotExitException
	{
		boolean check = false;

		if (pwd.equals(members[count].getPwd()))
		{
			check = true;
		}

		if (check == false)
		{
			throw new MemberNotExitException("비밀번호가 다릅니다.");
		}

	}
	
	public boolean checkTel(String tel) throws MemberNotExitException
	{
		
		String pattern = "^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$";

		boolean check = Pattern.matches(pattern, tel);
		if (check)
			System.out.println("올바른 전화번호 입니다.");
		else
			throw new MemberNotExitException("올바르지 않은 전화번호입니다.");

		return check;

	}
	
	public boolean checkEmail(String email) throws MemberNotExitException
	{
		String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		boolean check = Pattern.matches(pattern, email);

		if (check)
		{
			System.out.println("올바른 이메일입니다.");
		} else
			throw new MemberNotExitException("올바르지 않은 이메일입니다.");

		return check;
	}
	
	
	
     //회원로그인용 메소드
	public void memberLogin()
	{
		// 존재하지 않는 아이디입니다. 메세지를 예외 MemberNotExitException 생성하여 처리해 주세요	
		Scanner in = new Scanner(System.in);
		String uid, pwd, name;
		try
		{
			System.out.print("아이디: ");
			uid = in.nextLine();
			searchId(uid);
			System.out.print("패스워드: ");
			pwd = in.nextLine();
			searchPwd(pwd);
			System.out.println("로그인 되었습니다.");
		} catch (MemberNotExitException e)
		{
			System.out.println(e.getMessage());
		}

	
		//2. MemberInfo tel, email 필드 추가 적용하여 / 전화번호 양식, 이메일 양식 검증하는 기능 추가하기 : regex 기능 추가
		//1시까지 미션! 
		
		
		// 예외 처리 안하고 조건문으로!
		
		/*
		로그인 성공시 : "로그인 되었습니다." 메세지 출력
		로그인 실패시 : "존재하지 않는 아이디 입니다." or "암호가 잘못되었습니다." 중 하나를 출력
		*/
		
		
//		String uid,pwd; // 이 함수 안에서는 내가 control 할 수 있으니까
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("아이디 : ");
//		uid = in.nextLine();
//		System.out.print("패스워드 : "); 
//		pwd = in.nextLine();
		
		
//		for (int i = 0 ; i < idx ; i++)
//		{
//			if (members[i].getUid().equals(uid) && members[i].getPwd().equals(pwd))
//			{
//				System.out.println("로그인 되었습니다. \n");
//				return;
//			}else if (!members[i].getUid().equals(uid))
//			{
//				System.out.println("존재하지 않는 아이디입니다. \n");
//				return;
//			}
//			else if (members[i].getUid().equals(uid) && !members[i].getPwd().equals(pwd))
//			{
//				System.out.println("암호가 잘못되었습니다. \n");
//				return;
//			}
//		}

	
	}
}
	

	
	
	


	
	
	
	
	
	
public class MemberManage
{
	public static void main(String[] args) throws MemberNotExitException 
	{
		MemberHandler handler = new MemberHandler(100);

		while (true)
		{
			System.out.println("------- 메뉴 선택 -------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로 그 인");
			System.out.println("9. 프로그램 종료");

			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();

			switch (choice)
			{
			case 1:
				handler.memberInsert(); break;
			case 2:
				handler.memberLogin(); break;
			case 9:
				System.out.println("프로그램 종료");
				return; // 프로그럄 종료
			}

		}
	}
}