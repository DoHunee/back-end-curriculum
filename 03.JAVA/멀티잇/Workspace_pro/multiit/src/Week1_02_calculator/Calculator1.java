package Week1_02_calculator;

import java.util.Scanner;

public class Calculator1
{
	public static void main(String[] args)
	{
		// 변수 num1 , num2 , result

		int num1 = 0, num2 = 0, result = 0;
		String op = "";
		// 사용자한테 숫자를 입력받도록 Scanner
		Scanner input = new Scanner(System.in); // ctrl+shict+o
		System.out.println("=====Calculator ver.1========");
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = input.nextInt();
		System.out.println("연산의 종류는 +,-,*,/ 기호중 한가지를 선택해 주세요");
		op = input.next();

		System.out.println(num1 + " " + num2 + " " + op);

		if (op.equals("+"))
		{
			result = num1 + num2;
			System.out.printf("%d + %d = %d%n", num1, num2, result);

		} else if (op.equals("-"))
		{
			result = num1 - num2;
			System.out.printf("%d - %d = %d%n", num1, num2, result);

		} else if (op.equals("*"))
		{
			result = num1 * num2;
			System.out.printf("%d * %d = %d%n", num1, num2, result);
		} else if (op.equals("/"))
		{
			result = num1 / num2;
			System.out.printf("%d / %d = %d%n", num1, num2, result);
		} else
		{
			System.out.println("해당 연산자가 지원이 안됩니다. 연산자를 다시 선택하여 주세요!");
		}

	}
}