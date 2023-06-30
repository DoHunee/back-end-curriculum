package Week2_02_Quiz;

import java.util.Scanner;

public class MemberService
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("회원가입");
		System.out.println("id를 입력하세요");
		String id = in.next();
		System.out.println("비밀번호를 입력하세요");
		String pwd = in.next();
		
		Member m1 = new Member(id,pwd);
		
		//System.out.println(m1.id + m1.password);
		System.out.println("회원 가입완료되었습니다. 로그인하시려면 아이디와 패스워드를 입력해 주세요");
		
		System.out.println("id를 입력하세요");
		 id = in.next();
		System.out.println("비밀번호를 입력하세요");
		 pwd = in.next();
		boolean login = m1.login(id,pwd);
		
		if(login) System.out.println("로그인 성공!");
		else System.out.println("로그인 실패!");
		
		m1.logout(id);

	}

}
