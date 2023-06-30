package Week1_01;

import java.util.Scanner;

public class VariableType
{
	public static void main(String[] args) 
	{
		/*
		 * <자료형> 
		 * 기본자료형 (정수 , 실수) 
		 * 객체자료형 (문자 , 불리언 , 문자열)
		 */
		
		
		 /* 
		 * 1-1.정수형
		 * 전체 주석 >> ctrl + shift +/
		 * byte num1 = 1; 
		 * short num2 = 1; 
		 * int num3 = 1; 
		 * long num4 = 1;
		 * 
		 * System.out.println(num1); 
		 * System.out.println(num2); 
		 * System.out.println(num3);
		 * System.out.println(num4);
		 */		
		
		
		
			/*
			 * //1-2.실수형 
			 * //float num1 = 1.25f; 
			 * //double num2 =1.25d; 
			 * double num1 =1.0000001; 
			 * System.out.println(num1); 
			 * double num2 = 2.0000001;
			 * System.out.println(num2);
			 * 
			 * double result = num1 + num2; 
			 * System.out.println(result); //3.0000001999999997
			 * 결과가 이렇게 나온다!!!! // 실수부분은 정확하게 안 나올 수 있다
			 * 
			 * double dNum =0.0;
			 *  for(int i=0;i<1000;i++) { 
			 *  dNum+=0.1;
			 *   }
			 * System.out.println(dNum);
			 */
		  
		  
	
		
		
		
		
		/*
		 * 2-1.문자형
		 * char / 2byte / 유니코드와 아스키 코드(128개 , 영문자 , 숫자 , 특수문자) 
		 * 인코딩과 디코딩 
		 * 인코딩 'A'==> 0000 0000 0100 0001 
		 * 디코딩 0000 0000 0100 0001 ==> 'A'
		 * char ch1 = 'A';
		 * char ch2 = 65;
		 * char ch3 = 0x41;
		 * char ch4 = 0b0000000001000001;
		 * 
		 * System.out.println(ch1); 
		 * System.out.println(ch2); 
		 * System.out.println(ch3);
		 * System.out.println(ch4);
		 */
		
        
		
		/*
		 * 2-2.불리언형
		 * 어떤 변수의 참 거짓의 값을 나타내는데 사용 boolean / 1byte
		 * boolean check1 = true;
		 * boolean check2 = false;
		 * boolean check3 = (1<2); //true
		 * boolean check4 = (1>2); //false
		 * 
		 * System.out.println(check1);
		 * System.out.println(check2);
		 * System.out.println(check3);
		 * System.out.println(check4);
		 */
		
		
		/*
		 * //2-3문자열 
		 * String str1 = "나는 \n장도훈"; 
		 * String str2 = "\n나는\n 권영주";
		 * 
		 * System.out.printf("%s%n%s",str1,str2);
		 * 
		 */
		 
		
		
		/*
		 * <예제>
		 * int myVar = 20; System.out.println(myVar);
		 * 
		 * int time=30; 
		 * int speed = 20; 
		 * System.out.println(time +" " +speed);
		 */
		
		/*
		 * final int speed = 20; //상수 고정값 
		 * // speed = 40; 상수값이라 값을 바꿀 수 없는거지!!!
		 * System.out.println(speed);
		 */	
		
		
		/*
		 * // PI값 3.14로 고정하고 원의 넚이 구하기 
		 * final double PI = 3.14; 
		 * int r =20; //double
		 * result = r * r * PI; //실수형 
		 * int result =(int) (r * r * PI); //정수형
		 * 
		 * System.out.println("원의 넓이의 값 : "+result);
		 */
		
		
		/*
		 * // print 응용 
		 * System.out.printf("%10s%10s%10s%n","item","count","price");
		 * System.out.printf("%10s%10s%10s%n","pen","20","100"); 
		 * ///%S10는 10개의 공간 확보해서
		 * 출력
		 */		
		
		/*
		 * int _studentNameNumber = 10; // 카멜 표기법 
		 * // 코드 가독성이 좋아짐(한눈에 해석하기 좋음!)
		 */		
		
		
		/*
		 * final int MAX_NUM = 100; 
		 * final int MIN_NUM; 
		 * MIN_NUM = 60;
		 * 
		 * Scanner input = new Scanner(System.in); 
		 * System.out.println("학생 점수 입력: "); 
		 * int myScore =input.nextInt();
		 * 
		 *
		 * if (myScore < MIN_NUM) { 
		 * System.out.println("넌 F야 !"); }
		 * else 
		 * {
		 * System.out.println("통과");
		 *  }
		 * 
		 */
		
		
		
	
		
	}

}

