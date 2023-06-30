package Week2_01;


public class String02
{

	public static void main(String[] args)
	{
		//주민등록번호에서 성별에 해당하는 7번째 문자를 읽어서 남자 또는 여자인지 판단하여 출력 
		
		String ssn = "9506241230123";
		
		char gender = ssn.charAt(6);  //index는 항상 0부터 시작하므로 6번째 문자 지정
		int len = ssn.length();  //공백을 포함하여 센다.  "자바 프로그래밍" 
		System.out.println("ssn 문자열의 길이 :" + len);
		switch (gender)
		{
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여성");
		default:
			break;
		}
		
		//문자열 대체 : replace()  기존 문자열은 그대로 두고 새로운 문자열을 리턴한다. 
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		System.out.println(oldStr == newStr);

	}

}










