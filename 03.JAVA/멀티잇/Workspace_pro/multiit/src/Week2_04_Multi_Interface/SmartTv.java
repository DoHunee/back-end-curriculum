package Week2_04_Multi_Interface;

public class SmartTv implements totalinterface
{

	@Override
	public void search(String url)
	{
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn()
	{
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff()
	{
		System.out.println("Tv를 끕니다.");
		
	}

}
