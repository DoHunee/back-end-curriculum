package Week2_05_basemodule.system;

import java.util.Arrays;

public class ByteToStringEx
{

	
	// String 클래스는 문자열을 저장하고 조작할때 사용하는 클래스 이다.
	//문자열 리터럴은 자동으로 String객체로 생성되지만, String클래스의 다양한 생성자를 이용하여 직접 객체를 생성할 수 있다. 
	
	public static void main(String[] args) throws Exception
	{
		//String 문자열을 byte배열로 변환시키고 다시 문자열로 복원하는 기능을 구현 
		
		
		String data = "자바";
		//String ==> byte배열 (기본: UTF-8 인코딩) 
		
		byte[] arr1 = data.getBytes();   //=  byte[] arr1 = data.getBytes("UTF-8");
	    System.out.println("arr1 :" + Arrays.toString(arr1));
	    
	    //byte배열을 => String(기본: UTF-8 디코딩  : 한글 1글자당 3byte)
	    String str1 = new String(arr1);
	    System.out.println("str1 :" + str1);
	   
	    data = "자바프로그래밍";
	  //String ==> byte배열 (기본: EUC-KR 인코딩 : 한글 1글자당 2byte) 
	    byte[] arr2 = data.getBytes("EUC-KR");
	    System.out.println("arr2 :" + Arrays.toString(arr2));
	    
	    String str2 = new String(arr2,"EUC-KR");  //String 클래스는 다양한 생성자를 제공하고 있어 원하는 문자열처리 가능 
	    System.out.println("str2 :" + str2);
	    
	    String data1 ="ABC";
	    data1 += "DEF";    //String 내부 문자열을 수정할 수 없다. 그런데, + 원래 문자열이 아닌 "ABC" + "DEF" ==> "ABCDEF"새로 생성
	    
	    //StringBulider(내부 버퍼 (데이터 저장 하는 메모리))에 문자열을 저장해 두고 그 안에서 추가,수정,삭제 작업을 할 수 있도록 확장클래스
	    
	    String data2 = new StringBuilder().append("DEF").insert(0, "ABC").delete(3, 4).toString(); //메소드 체이닝 패턴
	    System.out.println(data2);
	    
	    
	    
	}

}
