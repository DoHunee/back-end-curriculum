package Week2_04_Exception;

public class NullPointEx
{

	public static void printLength(String data) {
		int result =0;
		try
		{
			 result = data.length();	
		} catch (NullPointerException e)
		{
			System.out.println(e.getMessage());   //예외 정보를 얻는 3가지 방법 
			//System.out.println(e.toString());
			//e.printStackTrace();    
		}catch (Exception e1) {
			  System.out.println(e1.getMessage());
		}
		
		System.out.println("문자 수:" + result);
	}
	
	public static void classNotfoundEx(String message) {
		  try
		{
			Class.forName(message);
			System.out.println("자바표준API에 " + message +"클래스가 존재합니다.");
		} catch (ClassNotFoundException e)
		{
			
			//e.printStackTrace();
			System.out.println("표준API에 없는 클래스입니다. ");
		}
		
	}
	
	public static void main(String[] args)
	{
		//예외처리 해 주세요! 
		
		System.out.println("프로그램 시작");
		printLength("[프로그램시작]");
		printLength(null);
		classNotfoundEx("java.lang.String2");
		
        System.out.println("프로그램 종료");
        }

}
