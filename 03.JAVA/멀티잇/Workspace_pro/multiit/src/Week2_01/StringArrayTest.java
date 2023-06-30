package Week2_01;

public class StringArrayTest
{

	public static void main(String[] args)
	{
		// 문자열 배열 season 변수 선언과 배열 생성 초기값 "Spring", "Summer", "Fall", "Winter"
          //String[] season = new String[4];
		  String[] season = {"Spring", "Summer", "Fall", "Winter"};  //메모리생성 + 초기화 
          
		   printSeason(season);
		  
		// 인덱스 1번 항목의 값을 "여름" 변경하고 변경된 내용출력하세요
		  season[1] = "여름";
		  
		  System.out.println(season[1]);
		  printSeason(season);

	}
	
	public static void printSeason(String[] s) {
		
		// 배열의 항목값 읽기
		  for(String str : s) {
			  System.out.println(str);
		  }
	}
	

}
