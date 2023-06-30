package Week2_02_EX02;

public class Television
{
	static String company = "SAMSUNG";
	final static String model = "LED1900";
	static String info;
	int speed;
	void m1( ) {}

	static {
		String menu = "Tv 메뉴안내 입니다 .";
		info = menu + company + "-" + model;
		//m1() 정적멤버와 인스턴스 멤버는 같은 공간에서 사용할 수 없다
	}


}
