package Week3_02_Colletion;

import java.awt.List;
import java.util.ArrayList;

public class Arraylist_Ex02
{

	public static void main(String[] args)
	{
		// 기능 소개
		final int LIMIT = 10;
		String source = "0123456789abcdefghiABCDEFGHIJ!@#$%^&()_";
		int length = source.length();
		ArrayList list = new ArrayList(length/LIMIT+10);
		System.out.println(list);
		
		for(int i=0;i<length; i+=LIMIT) {
			if(i+LIMIT < length)list.add(source.substring(i, i+LIMIT));
			else list.add(source.substring(i));
		}
		
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i)); 
			//@#$%^&()_
		}
		
		System.out.println(list.size()); //4
		
		char ch = '/';  // 이게 아스키 코드로 47번
		int n = ch;
		System.out.println(n); //47
		for(int i =0; i<97;i++) {
		   
			System.out.print(ch++ + " ");
		}
		System.out.println("");
		
		
		
		
//		char ch1 = 'A'; //65
//		char ch2 = 'z'; //122
//		int n1 = ch1;
//		int n2 = ch2;
//		
//		for(int i =n1; i <=n2;i++) {
//			System.out.print(ch1++ + " ");
//		}
		
		
		//Quiz
		// 출력하지 말고 대문자A ~소문자 z까지 문자열로 만들어서 10개씩 끊어서 list에 저장
	    //65 ~122 문자열로 만들어서 10개씩 끊어
		
		

	}

}
