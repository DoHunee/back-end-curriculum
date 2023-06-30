package Week2_02_EX02;

public class KoreanEX
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Korean k1 = new Korean("123456-1234567","장건욱");
		
		//필드값 읽기
		System.out.println(k1.ssn);
		System.out.println(k1.nation);
		System.out.println(k1.name);
		
		/*
		 * //final 필드값 변경 >> 변경 불가!! 
		 * k1.nation = "USA";  
		 * k1.ssn = "1234555555";
		 * 
		 */
		k1.name = "장도훈";
		System.out.println(k1.name); //final 아니니까 바뀌네~
		System.out.println(Korean.PI); //이렇게 바로!!
		

	}

}
