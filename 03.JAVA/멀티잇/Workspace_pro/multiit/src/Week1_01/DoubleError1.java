package Week1_01;

public class DoubleError1
{

	public static void main(String[] args)
	{
		
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result = num1 + num2;
		System.out.println(result);
		
		
		double dNum = 0.0;
		for(int i = 0; i<1000;i=i+1) {
			  
			dNum = dNum + 0.1;
			
		}
		System.out.println(dNum);
		
		float f1 = (float)10.2;
		
		// 결론 : 실수는 정확한 값이 아니고, 수식에 의해 저장되는 근사치 (연산 시 오차가 발생함)
		// float 형은 4바이트, double 8byte 자바는 double 형을 기본 실수형으로 사용하며 float 사용시 값에 float임을 명시해줘야 함.

	}
         // 2시 15분 시작하겠습니다. 
}
