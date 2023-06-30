package Week2_01;

import java.util.Scanner;

public class Ex01
{

	public static void main(String[] args)
	{
		int[] arr1=null;
		int[] arr2;
		int[] arr3;
		System.out.println(arr1);
		arr1 = new int[] {1,2,3};  // 배열 {1,2,3}을 생성하고 arr1 변수에 대입 

		
		// 배열 {1,2,3}을 생성하고 arr2 변수에 대입
		arr2 = new int[] {1,2,3};
		
		String refVar1 = "자바";
		String refVar2 = null;

		System.out.println("refVar1 :" + refVar1.hashCode());
		//System.out.println("refVar2 :" + refVar2.hashCode());
		
		// 배열 변수 arr2의 값을 배열 변수 arr3에 대입 코드 
		arr3 = arr2;
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
	    String hobby = in.next();
	    System.out.println(name + "의 취미는" + hobby );
		
		
		

	}

}
