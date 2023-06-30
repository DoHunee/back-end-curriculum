package Week2_05_basemodule.Math ;

import java.util.Arrays;
import java.util.Random;

public class RandomEx
{

	public static void main(String[] args)
	{
		//선택번호 6개가 저장될 정수형 배열 생성 
		int[] selectNumber = new int[6];
		Random random = new Random(3);   //선택번호를 얻기 위해 Random객체 생성 
		
		System.out.println("선택번호: ");
		
		// 선택번호 6개를 얻어 selectNumber 배열에 저장 for문 작성해 보세요! 
		for(int i = 0 ; i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;   //1~45까지의 정수를 얻기 
			System.out.println(selectNumber[i] + " ");
		}
		
		System.out.println("====================");
		
		//당첨번호 6개가 저장될 정수형 배열 생성 
				int[] winningNumber = new int[6];
				random = new Random(5);   //선택번호를 얻기 위해 Random객체 생성 
				
				System.out.println("당첨번호: ");
				
				// 당첨번호 6개를 얻어 winningNumber 배열에 저장 for문 작성해 보세요!
				for(int i = 0 ; i<6;i++) {
					winningNumber[i] = random.nextInt(45)+1;   //1~45까지의 정수를 얻기 
					System.out.println(winningNumber[i] + " ");
				}
				
		System.out.println("=====================");
		
		
		//당첨여부 확인
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부");
		if(result) {
			System.out.println("로또 1등에 당첨되었습니다. 1천억!!!!");
		}else {
			   System.out.println("꽝! 다음 기회에 ");
		}
		
		
		
		
		

	}

}
