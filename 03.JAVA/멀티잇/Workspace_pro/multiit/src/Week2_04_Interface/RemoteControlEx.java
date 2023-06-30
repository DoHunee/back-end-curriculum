package Week2_04_Interface;


//인터페이스(interface)
//두 장치를 연결하는 접속기
//두 장치를 서로 다른 객체로 본다면,
//두 객체를 연결하는 역할

//- 객체A는 인터페이스를 통해서 객체B를 사용 할 수 있다.

//- 객체A가 인터페이스의 메소드를 호출하면
//  인터페이스는 객체B의 메소드를 호출하고
//  그 결과를 받아 객체A로 전달해준다.

//- 인터페이스는 ~.java
//            ~.class  물리적 형태는 클래스와 동일

//- public static final 특성을 갖는 불변의 상수 필드 값을 멤버로 가진다.
//  인터페이스의 선언된 필드는 모두 public static final 특징을 갖는다.
//  상수명은 대문자로 작성하되, 서로 다른 단어로 구성시  "_" 로 연결하는 것을 권장

//- Radio , WaterMachine setVolume을 재정의하여 주시고
//  각 장치들의  setVolume 을 동작시켜 주세요!
//
// 인터페이스는 상속이 아닌 적용의 개념!!
// 다중상속을 위해 인터페이스를 사용한다



public class RemoteControlEx
{
	
//  인터페이스로 구현 객체를 사용하면 인터헤이스 변수를 선언하고 구현객체를 대입하여 사용한다.
//	인터페이스 변수는 참조 타입이기 떄문에 구현객체가 대입되면 구현 객체의 번지를 저장한다
//	구현객체가 대입되면 인터페이스 변수로 추상메소드를 호출할 수 있게 된다 
//	이때, 어떤 구현 객체가 대입되었는지에 따라 실행 내용이 달라진다

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		rc = new Tv();
		rc.trunOn();
		rc.setVolume(10);
		rc.setMute(false);
		RemoteControl.chargeBattery();
		rc.trunOff();
		
		
		System.out.println("\n");
		rc = new Radio();
		rc.trunOn();
		rc.trunOff();
		rc.setVolume(7);
		rc.setVolume(50);
		
		//상수는
		System.out.println("리모컨의 최대 불륨은" + RemoteControl.MAX_VOLUME);
		System.out.println("리모컨의 최소 불륨은" + RemoteControl.MIN_VOLUME);
	

	}

}
