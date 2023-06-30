package Week2_01;

public class String05_split
{

	public static void main(String[] args)
	{
		String board = "1 , 자바 학습 ,참조타입 String을 학습합니다. , 홍길동";
		
		//문자열 분리 
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		
		System.out.println("번호 :" + tokens[0]);
		System.out.println("제목 :" + tokens[1]);
		System.out.println("내용1 :" + tokens[2]);
		System.out.println("내용2 :" + tokens[3]);
		//System.out.println("성명 :" + tokens[4]);
		
		
		for(int i=0; i<tokens.length;i++) {  //일반for 
			System.out.println(tokens[i]);
		}

		for (String string : tokens)   //foreach문
		{
			System.out.println(string);
		}
	}

}
