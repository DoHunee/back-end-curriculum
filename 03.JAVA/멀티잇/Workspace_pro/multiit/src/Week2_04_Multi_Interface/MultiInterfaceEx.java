package Week2_04_Multi_Interface;

public class MultiInterfaceEx
{

	public static void main(String[] args)
	{
		totalinterface ti =new SmartTv();;
		//RemoteControl 인터페이스 변수 선언 및 구현 객체(SmartTv) 대입
		 RemoteControl rc = new SmartTv();
		//RemoteControl 인터페이스에 선언된 메소드만 호출 해 주세요
		  rc.turnOn();
		  rc.turnOff();
		  
		  System.out.println("=================");
		  ti.turnOn();
		  ti.turnOff();
		  ti.search("https://www.youtube1.com");
		
		  
		  
		  System.out.println("=================");
		//Searchable 인터페이스 변수 선언 하고 구현객체 대입
		  Searchable s = new SmartTv();
		//Searchable 인터페이스에 선언된 추상 메소드만 호출해 주세요! 
		  s.search("https://www.youtube.com");
		
		  

	}

}
