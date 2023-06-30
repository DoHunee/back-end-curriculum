package Week2_01;

public class String03
{

	public static void main(String[] args)
	{
		//문자열 잘라내기 subString() : 특정 위치의 문자열을 잘라내어 가져온다. 
		
		//subString(int beginindex)
		//subString(int beginindex, int endindex)
		
		String ssn = "960123-1057819";
		
		int len = ssn.length();
		System.out.println(len);
		String firstNum =null;
		String secondNum = null;
		
		firstNum = ssn.substring(0, 6);
		secondNum = ssn.substring(7,len);
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		/*
		 * 결과) 960123 1057819
		 */

		

	}

}
