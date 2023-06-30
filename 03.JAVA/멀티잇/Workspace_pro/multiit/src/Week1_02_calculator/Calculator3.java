package Week1_02_calculator;

import java.util.Scanner;

public class Calculator3
{
	public static void main(String[] args)
	{
		menu();
		System.out.println("계산기를 종료합니다.");
	}

	public static void menu()
	{
		int num1 = 0, num2 = 0, result = 0;
		String op = "";
		// 사용자한테 숫자를 입력받도록 Scanner
		Scanner input = new Scanner(System.in); 
		
		// menu
		System.out.println("=====Calculator ver.3========");
		while (true)
		{
			System.out.println();
			System.out.println("메뉴를 번호로 선택하세요.");
			System.out.println("1. 더하기");
			System.out.println("2. 뻬기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 끝내기");
			
			int num = input.nextInt();
			
			if (num == 0)
			{
				System.out.println("끝내기를 선택하셨습니다.");
				break;
			} else
			{ 
				if (num > 4)
				{
					System.out.println("메뉴선택을 잘못 선택했습니다.");
					continue;
				}

				System.out.println("첫번째 숫자를 입력하세요");
				num1 = input.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				num2 = input.nextInt();
				
				switch(num) {
				
				case 1: plus(num1,num2); break;
				case 2: minus(num1,num2); break;	  
				case 3: multi(num1,num2); break;
				case 4: div(num1,num2); break;
				case 0: System.out.println("끝내기를 선택하셨습니다.");break;
				}
				
			}
			
		}
		

	}

	
	public static void plus(int num1, int num2)
	{
		int result = num1 + num2;
		System.out.printf("%d + %d = %d%n", num1, num2, result);
	}

	public static void minus(int num1, int num2)
	{
		int result = num1 - num2;
		System.out.printf("%d - %d = %d%n", num1, num2, result);
	}

	public static void multi(int n1, int n2)
	{
		int result = n1 * n2;
		System.out.printf("%d - %d = %d%n", n1, n2, result);
	}

	public static void div(int s1, int s2)
	{
		int result = s1 - s2;
		System.out.printf("%d - %d = %d%n", s1, s2, result);
	}

}