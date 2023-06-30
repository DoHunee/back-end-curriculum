package Week1_02_operator;

public class AccuracyEX
{

	public static void main(String[] args)
	{
		
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		// 10조각에서 남은 조각수 >> 3
		// 사과 1개에서 남은 양 => 0.3
		
		int result = totalPieces - number;
		
		System.out.println(result);
		System.out.println(result / 10.0);
		// 초보 개발자들이 많이 하는 실수!!
		

	}

}
