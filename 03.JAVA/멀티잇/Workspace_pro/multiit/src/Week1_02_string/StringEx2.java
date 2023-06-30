package Week1_02_string;

public class StringEx2 // 문자열(String)
{

	public static void main(String[] args)
	{

		// 숫자연산
		int result1 = 10 + 2 + 8;  // result1 = 20
		
		// 결합연산
		String result2 = 10 + 2 + "8";    // result2 = 128  
		System.out.println(result2);
		String result3 = 10 + "2" + 8;    // result3 =1028 
		System.out.println(result3);
		String result4 = "10" + 2 + 8;    // result4 =1028
		System.out.println(result4);
		String result5 = "10" + (2 + 8);  // result5 =1010
		System.out.println(result5);
  		
		

	}

}
