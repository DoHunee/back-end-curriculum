package Week2_05_basemodule.rapper;

public class BoxUnBoxingEx
{
	
	public static void main(String[] args) {
		
		// 숫자100을 Intger클래스로 포장하세요. 
		Integer obj = 100;
		System.out.println("value:" + obj.intValue());
		
		Float obj1 = 1.5f;
		System.out.println("value:" + obj1.floatValue());
		
		
		//Unboxing
		int value = obj;
		System.out.println(value);
		
		//연산시 UnBoxing
		value = obj + 100;
		
		System.out.println(value);
		
		Character  ch1 = 'A';
		char ch2 = ch1;
		System.out.println(ch1.charValue()   + "  " + ch2);
		
		//문자열을 기본값으로 변환하는 코드 
		//-128~127 초과값일 경우 
		
		Integer ob1 = 300;
		Integer ob2 = 300;
		//System.out.println("== :" + (ob1 == ob2));
		System.out.println("equals() : " + (ob1.equals(ob2)));
		
		//-128~127 범위의 값 일 경우
		Integer ob3 = 100;
		Integer ob4 = 100;
		//System.out.println("== :" + (ob3 == ob4));
		System.out.println("equals() : " + (ob3.equals(ob4)));
		
		
	}

}














