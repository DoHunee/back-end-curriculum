package Week1_02_casting;

public class CastingEx
{
	//2시 10분 시작하겠습니다. ^^

	public static void main(String[] args)
	{
      int var1 = -12;
      byte var2 = (byte) var1;
      System.out.println(var2);
		
      long var3 = 300;
      int var4 = (int)var3;
      System.out.println(var4);
      
      int var5 = 65;
      char var6 = (char)var5;
      System.out.println(var6);
      
      double var7 = 3.14;
      int var8 = (int)var7;
      System.out.println(var8);
	}

}

/*
 * 2. 강제타입변환 : 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입변환이 안된다.
 *    타입캐스팅 연산자: ()
 *    
 *    작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용범위 타입 
 *    int -> byte
 *    long ->int
 *    int ->char
 *    실수 -> 정수 
 */