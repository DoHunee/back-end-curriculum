package Week2_03_Access;

import java.util.Scanner;

//클래스를 어디에서나 사용할 수 있는 것은 아니다.
//클래스가 어떤 접근 제한자를 갖느냐에 따라 사용가능여부가 결정된다. 
//클래스는 public , default 접근제한자를 가질 수 있다. 
// protected는 자식 객체만 쓸 수 있다


class A{}    //default 접근제한자를 가진 클래스 A  default접근제한자의 의미는 같은 패키지에서는 아무제한 없이 접근가능 
 
class B{}    //default 접근제한자를 가진 클래스 B


public class AB   //public의 의미는 같은패키지 뿐만 아니라 다른 패키지에서도 사용할 수 있는 클래스
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		

	}

}
