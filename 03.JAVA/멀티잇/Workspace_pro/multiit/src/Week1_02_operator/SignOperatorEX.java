package Week1_02_operator;

public class SignOperatorEX
{

	public static void main(String[] args)
	{
		// 1. 부호 연산자
		byte b =100;
		int result = -b;
		System.out.println(result + 1);  // -99
		
		int x = 100;
		x = -x;
		System.out.println(x);   // -100
		
		byte b1 = 100;
		int y = -b1;
		System.out.println(y);   // -100
		
		
		
		
		
		
		
		// 2. 증감 ++ / 감소 --
		int x1 = 10;
		int y1 = 10;
		int z; 
		
		x1++;    // x = x + 1;  11
		++x1;    // x = x + 1;  12
		System.out.println(x1);   //12
		System.out.println("--------------------");   
		
		y1--;    // y = y - 1;  9
		--y1;    // y = y - 1;  8
		System.out.println(y1);   //8
		System.out.println("--------------------");   
		
		
		// prefic 선증가
		z = x1++;     // 1. z에 12인 x1을 먼저 대입하교!!
		              // 2. x1에 1 증가!!
		System.out.println("x1="+x1); // 13
		System.out.println("z="+z);   // 12
		System.out.println("--------------------");   
		
		// postfix 후증가
		z = ++x1;     // 1. 13인 x1에 1을 먼저 더하고 
		              // 2. z에 대입
		System.out.println("x1="+x1); // 14
		System.out.println("z="+ z );   // 14
		System.out.println("--------------------");  
		
		//Quiz

		z = ++x1 + y1++; // x1=14 , y1= 8
		System.out.println(z);  // 23 
		System.out.println(x1);  // 15
		System.out.println(y1);  // 9
		System.out.println("--------------------");  
		
		
		int x2 = 10;
		int y2 = 20; 
		int z2 = (++x2) + (y2--); 
		System.out.println(z2); //31
		System.out.println(x2); //11
		System.out.println(y2); //19
		System.out.println("--------------------");  
		
		
		
		
		
		z2 = (++x1) + (y1--);  // x1=15 , y1= 9
		System.out.println(z2); //25
		System.out.println(x1); //16
		System.out.println(y1); //8
		System.out.println("--------------------");  
		
		
		
		

		

	}

}
