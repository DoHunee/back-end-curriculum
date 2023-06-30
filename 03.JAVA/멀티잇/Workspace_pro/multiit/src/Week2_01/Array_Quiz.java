package Week2_01;

import java.util.Scanner;
public class Array_Quiz
{

	public static void main(String[] args)
	{
		/* 1번 최댓값 출력 idea
		 * // TODO Auto-generated method stub int[] 
		 * 
		 * arr = {1,5,3,8,2};
		 * 
		 * int max = arr[0]; 
		 * for (int i =0; i<arr.length-1; i++ ) { 
		 * if(arr[i] > max) {
		 * max = arr[i]; } }
		 * 
		 * System.out.println(max);
		 */
		
		
		/* 2차원 배열 이중for문을 사용한 꺼내기와 합 , 평균 구하기
		 * int[][] array = { {95, 86}, {83,92,96}, {78, 83, 93, 87, 88} };
		 * 
		 * int sum = 0; 
		 * double avg = 0.0; 
		 * int cnt = 0;
		 * 
		 * for(int i=0; i<array.length; i++) { 
		 * for(int j=0; j<array[i].length; j++) {
		 * sum += array[i][j]; // 2차원 배열의 값 총합 
		 * cnt += 1; 
		 * } }
		 * 
		 * avg = sum / cnt;
		 * 
		 * System.out.println(sum); 
		 * System.out.println(avg);
		 */
		
		boolean button = true; //while문을 조종할 장치
		int[] score =null;  //학생 점수 담을 배열!!!
		
		while(button) {
			Scanner sc = new Scanner(System.in);
			 
			// 초기 보여지는 부분
			 System.out.println("-----------------------------------"); 
			 System.out.println("1.학생수 | 2.점수입력 |3.점수리스트 |4.분석 |5.종료"); 
			 System.out.println("-----------------------------------"); 
			 System.out.print("선택>"); 
			
			 //숫자를 입력 받으면@@
			 int n = sc.nextInt();
			 
			 switch(n){
				 case 1: //학생수 입력!! 배열을 지정하기 위해 가장 먼저 해야지!!!
					 System.out.print("학생수>"); 
					 int num = sc.nextInt(); //학생수
					 score = new int[num]; //입력된 학생 수만큼 할당
					 break;
					 
				 
				 case 2: //score 받는 부분
					 for(int i=0;i<score.length;i++) {
						 System.out.print("score["+i+"] : ");
						 score[i] = sc.nextInt();
					 }
					 break;
				 
				 
				 case 3://리스트 보여주기만 하면 돼!!
					 for(int i=0;i<score.length;i++) {
						 System.out.println("score["+i+"]"+score[i]);
					 }
					 break;
				 
				 case 4: // 최댓값 카운트 평균
					 int max =score[0];
					 int sum =0;
					 int cnt =0;
					 for(int i=0;i<score.length-1;i++) {
						 if(score[i]<score[i+1]) {
							 max = score[i+1];
						 }
						 sum += score[i];
						 cnt++; 
					 }
					 
					 double avg = (double) sum / cnt;
					 System.out.println("최고 점수"+max);
					 System.out.println("평균 점수"+avg);
					 break;
					 
				 case 5:
					 System.out.println("프로그랩 종료");
					 button = false; // while문 종료
					 break;
					 
				 
			 }
			
		}
		
		
	}
			

}
