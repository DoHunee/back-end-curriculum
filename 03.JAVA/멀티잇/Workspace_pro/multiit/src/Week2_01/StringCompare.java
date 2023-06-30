package Week2_01;

public class StringCompare
{

	public static void main(String[] args)
	{
		//자바는 문자열리터럴 값이 동일하다면 String객체를 공유하도록 설계 (리터럴풀)
		
		String str1 ="자바";
		String str2 ="자바";
		
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode() + " " + str2.hashCode());
		
		
		String str3 = new String("자바");
		String str4 = new String("자바");
		
		boolean result = str1.equals(str4);
		boolean result2 =  !str1.equals(str3);
		
		System.out.println("result " + result ); //문자열이 같은지 검사(대소문자 검사)
        //동일한 String 객체든 다른 String 객체든 상관없이 내부 문자열만을 비교할때는 equals() 사용
	}

}
