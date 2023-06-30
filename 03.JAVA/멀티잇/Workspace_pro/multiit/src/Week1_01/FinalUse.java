package Week1_01;

import java.util.Scanner;

public class FinalUse
{

	public static void main(String[] args)
	{
       final int MAX_NUM = 100;
       final int MIN_NUM;
       MIN_NUM = 60;
       Scanner input = new Scanner(System.in);     
	   System.out.println("학생 점수 입력: ");
       int myScore = input.nextInt();
	     	   
	   if(myScore < MIN_NUM) {
		   
		   System.out.println("넌 F 야!");
	   }else {
		   
		   System.out.println("통과");
	   }
	   
	}

}
