package Week1_02_casting;

public class CastingEx1
{

	public static void main(String[] args)
	{

		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		
		System.out.println(longValue + " " + floatValue + " " + doubleValue);
        
		char charValue = 'A';
		int  exchar = charValue;
		System.out.println(exchar);
		
		byte byteValue = 65;
		//char charValue1 = byteValue; 
		//자동타입에서 예외상황, char타입의 허용범위는 음수를 포함하지 않고, byte타입은 음수를 포함하기 때문이다. 
		
	}

}

/*
 * 1. 자동 타입 변환 : 자동으로 타입 변환이 일어난다. 값의 허용범위가 작은 타입이 허용범위가 큰타입으로 대입될때 발생한다. -기본타입의
 * 허용범위 순서 : byte<short , char<int<long<float<double -예) byte byteValue = 10;
 * int intValue = byteValue; // 자동타입 변환
 * 
 * long longValue = 5000000000L; float floatValue = longValue; double
 * doubleValue = longValue;
 * 
 */
