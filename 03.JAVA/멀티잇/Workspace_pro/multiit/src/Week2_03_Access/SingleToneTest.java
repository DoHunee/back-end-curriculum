package Week2_03_Access;

public class SingleToneTest
{

    private static SingleToneTest sigletone = new SingleToneTest();
	
	private SingleToneTest() {}
	
	public static SingleToneTest getInstance() {
		return sigletone;
	}
	
	
}



//어플리케이션을 전체에서 단 한 개의 객체만을 생성해서 사용하고 싶다면 싱글톤패턴을 적용할 수 있다.
//싱글톤 패턴의 핵심은 생성자를 private 접근 제한해서 외부에서 new연산자로 생성자를 호출할 수 없도록 막는것

/*public class 클래스{
	
	private static 클래스 sigletone = new 클래스();
	
	private 클래스() {}
	
	public static 클래스 getInstance() {
		return sigletone;
	}*/
	
