package Week1_02_operator;

public class Overflow_Underflow
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Overflow");
		byte var1 = 125;
		for(int i =0;i<5;i++) {
			var1++;
			System.out.println("var1 :" + var1);
		}
		
		System.out.println("-----------------------");
		
		// TODO Auto-generated method stub
		System.out.println("Underflow");
		byte var2 = -125;
		for(int i =0;i<5;i++) {
			var2--;
			System.out.println("var2 :" + var2);
			}
		
		System.out.println("-----------------------");
		
		int var3= 1000000;
		int var4= 1000000;
		int var5= var3 * var4;
		System.out.println(var5);
		
		}
}

/*
 * 오버플로우란? 타입이 허용하는 최댓값을 벗어나는 것 
 * 언더플로우? 타입이 허용하는 최솟값을 넘어가는 것
 **/