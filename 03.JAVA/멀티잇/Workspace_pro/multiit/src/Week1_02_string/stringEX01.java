package Week1_02_string;

public class stringEX01
{
	public static void main(String[] args) 
	{
		/* 
		 * 문장 사이에 역슬래시  표현 가능!!		  
		 * * String name = "김멀티";
		 *  String job = "자바프로그래머"; 
		 *  System.out.println(name+"의 직업은"+job + "입니다.");
		 * 
		 * String str = "나는\"자바\"를 배웁니다."; 
		 * System.out.println(str);
		 * 
		 * str = "\t번호\t이름\t직업"; 
		 * System.out.println(str);
		 * 
		 * System.out.println("나는\n"); 
		 * System.out.println("나는");
		 * System.out.println("자바를 배웁니다 .");
		 * 
		 */
		
		
		
		  // java13버전 이상부터 블록문법 제공 큰따옴표 3개로 감싸서 이스케이프 하거나 
		  // 라인피드 필요없이 작성한 그대로 문자열 저장
		
		String str1 = "" + "\n " 
		  + "\t\"id\":\"winter\",\n" 
		  + "\t\"name\":\"눈송이\"\n"
		  +"}"; 
		  
		 
		
		 String str2 = """ 
		 		{
		 		"id" : "winter",
		 		"name": "눈송이"
		 		}
		 		""";
		 
			/*
			 * // java 14버전 부터@@ String str3 ="""
			 * 
			 * 나는 자바를 \ 학습합니다. 나는 최고의 자바프로그래머가 되고 싶습니다.
			 * 
			 * 
			 * """; System.out.println(str3);
			 */
		 
		 
		 System.out.println(str1);
		 System.out.println(str2);
	}

}
