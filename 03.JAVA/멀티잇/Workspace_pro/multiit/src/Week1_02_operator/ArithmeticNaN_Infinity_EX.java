package Week1_02_operator;

public class ArithmeticNaN_Infinity_EX
{

	public static void main(String[] args)
	{
		/*
		 *  // 0으로 나누는게 안된다고 오류 뜸!!! 
		 * int x = 5; 
		 * int y = 0; 
		 * int result = x/y;
		 * System.out.println(result);
		 */
		
		/*
		 * // infinity 출력! 
		 * int x = 5; 
		 * double y = 0.0; 
		 * double result = x/y;
		 * System.out.println(result); // 0으로 나누는게 안된다고 오류 뜸!!!
		 */ 
		
		
		/*
		 * // NaN 출력 
		 * int x = 5; 
		 * double y = 0.0; 
		 * double result = x%y;
		 * System.out.println(result);
		 */
		
		//검사하기
		 int x = 5; 
		 double y = 0.0; 
		 double result = x / y;
		 
		 if(Double.isInfinite(result) || Double.isNaN(result)) {
			 System.out.println("값 산출 불가");
		 }else {
			 System.out.println(result + 2);
		 }
		 
		
		
		

	}

}

/*
 * 어떤 연산을 수행할 때 Infinity가 나오거나 NaN가 나오면 데이터가 엉망이 된다 
 * 그러므로 /,%의 결과가 Infinity 나 NaN가 나오늕 확인하고 다음 연산을 수행하는게 현명하다 
 * <검사법> 
 * Double.isInfinite() Double.isNaN()
 */

