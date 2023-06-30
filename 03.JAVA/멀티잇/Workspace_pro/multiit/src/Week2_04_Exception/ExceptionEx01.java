package Week2_04_Exception;

public class ExceptionEx01
{
	// Exception handling 한다.
	public static void main(String[] args) throws Exception
	{
		int n1 = 5;
		int n2 = 5;
		int result = 0;

		// result = n1/n2;

		try   //생성자 / 메소드 내부에서 주로 작성된다.  
		{
			result = n1 / n2;

		} catch (ArithmeticException e)
		{ // e.printStackTrace();
			System.out.println("0으로 나눌수 없습니다.");
		} catch (Exception e1)
		{
			System.out.println("예외 처리 완료");
		} finally
		{
			System.out.println("예외가 발생했을때 예외처리 되었습니다.");
		}

		System.out.println(result);

		System.out.println("프로그램의 끝");

	}

}
