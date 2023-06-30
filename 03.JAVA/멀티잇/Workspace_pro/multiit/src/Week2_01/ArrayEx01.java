package Week2_01;

public class ArrayEx01
{

	public static void main(String[] args)
	{
		// score 정수형 배열을 선언하세요.
		int[] score;
		
		//score배열을 5개의 값을 저장할 수 있도록 인스턴스 하세요.
		score = new int[5];
		
		//총합과 평균을 구하여 출력하세요. 
		int total = 0;
		double avg = 0.0;
		
		//index 0 => 50  1=>80  2 =>95 3=>88  4=>70 할당 하세요 
		
		score[0] = 50;
		score[1] = 80;
		score[2] = 95;
		score[3] = 88;
		score[4] = 70;
		
		//배열의 모든 요소를 출력 for   , foreach 버전으로 출력 
		
		//입력된 점수의 합을 구하세요. 
		//total = score[1] + score[2]+score[3]+score[4]; 
		
		for(int i=0; i<score.length;i++) {
			total +=score[i];
			System.out.println(score[i]);
		}
		
		
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + (double)total/score.length);
		System.out.println("================");
		
		for(int jumsu: score) {
			//total += jumsu;
			System.out.println(jumsu);
		}

	}

}








