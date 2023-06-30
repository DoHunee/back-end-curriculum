package Week1_02_operator;

import java.util.Scanner;

public class LogicalOperatorEX
{
	public static void main(String[] args)
	{
		
		  Scanner input =new Scanner(System.in);
		  System.out.println("대문자 or 소문자 or 숫자를 넣어주세요");
		  char ch = input.next().charAt(0); // 첫번쨰 문자 판별
		  
		  if (ch>='A' && ch <= 'Z') {
			  System.out.println(ch +"는 대문자입니다.");
		  }
		  
		  else if (ch>='a' && ch <= 'z') {
			  System.out.println(ch +"는 소문자입니다.");
		  }
		  
		  else if (ch>='0' && ch <= '9') {
			  System.out.println(ch +"는 0~9사이의 숫자입니다 ");
		  } 
		  else { 
			  System.out.println(ch +"은 0과 9사이의 숫자가 아닙니다."); 
			  }
		  input.close();
		  
		  System.out.println("--------------------------"); 
		
		 	}

}
