package Week2_05_basemodule;

import java.io.IOException;

public class ErrEx
{

	public static void main(String[] args) 
	{
		//1. out 필드 이용하면 콘솔에 원하는 문자열을 출력할 수 있다.
		/*
		 * try { int value = Integer.parseInt("1oo"); } catch (NumberFormatException e)
		 * { System.err.println("에러내용"); System.err.println(e.getMessage()); }
		 */
		
		//2. 키보드 입력기능 : 자바는 키보드로부터 입력된 키를 읽기 위해 System 클래스에서 in 필드를 제공한다.
		// int keyCode = System.in.read();   asicII : '0' => 48 'A' ==> 65  'a' ==>97 
		
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			
			//Enter(13)키를 읽지 않았을 경우에만 실행 
			if(keyCode != 13   && keyCode != 10) {
				if(keyCode == 49) speed++;
				
				else if(keyCode == 50)  speed--;
				
				else if(keyCode == 51) break;
			
			System.out.println("1.속도증가 2.감속  3.중지");
			System.out.println("-----------------------");
			System.out.println("현재 속도" + speed);
			System.out.println("번호를 선택하세요!");
			}
			
			try
			{
				keyCode = System.in.read();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
		}
			
		
	}
		System.out.println("프로그램 종료");
		//System.exit(0);    //프로세스 강제 종료   // 0 정상종료   // -1 , 1 비정상종료 
	}
}

