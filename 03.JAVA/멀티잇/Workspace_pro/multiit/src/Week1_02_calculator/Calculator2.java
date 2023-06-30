package Week1_02_calculator;

import java.util.Scanner;

public class Calculator2
{
	public static void main(String[] args)
	{
		// 변수 num1 , num2 , result

		int num1 = 0, num2 = 0, result = 0;
		String op = "";
		// 사용자한테 숫자를 입력받도록 Scanner
		Scanner input = new Scanner(System.in); // ctrl+shict+o

		// menu
		System.out.println("=====Calculator ver.2========");

		while (true)
		{ // 무한루프이므로 반드시 끝내기 기능이 필수!
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

				// System.out.println(num1 + " " + num2 + " " + op);

				if (num == 1)
				{
					result = num1 + num2;
					System.out.printf("%d + %d = %d%n", num1, num2, result);

				} else if (num ==2)
				{
					result = num1 - num2;
					System.out.printf("%d - %d = %d%n", num1, num2, result);

				} else if (num == 3)
				{
					result = num1 * num2;
					System.out.printf("%d * %d = %d%n", num1, num2, result);
				} else if (num == 4)
				{
					result = num1 / num2;
					System.out.printf("%d / %d = %d%n", num1, num2, result);
				} 

			}
			
		}
		System.out.println("계산기를 종료합니다.");

	}
}