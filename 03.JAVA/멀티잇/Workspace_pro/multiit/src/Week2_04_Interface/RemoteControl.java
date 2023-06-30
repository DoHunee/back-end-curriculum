package Week2_04_Interface;

public interface RemoteControl
{
	// public static final 상수
	int MAX_VOLUME =100;
	int MIN_VOLUME =10;
	
	//추상메소드 : 바디 (={})가 없는 메소드의 선언부만 가지고 있는 메소드
	// 구현 클래스에서 재정의 해야한다
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	
	//디폴트 메소드 : 인터페이스에 널을 수 있는 완전한 실행코드를 가진 우일한 메소드
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 기능 해제합니다");
		}
	}
	
	//정적 메소드 : 추상메소드와 디폴트 메소드는 구현객체가 필요하지만,
	//정적 메소드는 구현객체가 없어도 인터페이스만으로 호출이 가능
	static void chargeBattery(){
		System.out.println("리모컨 건전지를 교환해 주세요.");
	}
	
	//private 메소드 :     구현 객체가 필요한 메소드
	//private 정적 메소드 : 구련 객체가 필요없는 메소드
	// 인터페이스에서 private메소드의 용도는 디폴트와 정적메소드들의 중복 코드를 줄이기 위해서 사용
	
	
	

}
