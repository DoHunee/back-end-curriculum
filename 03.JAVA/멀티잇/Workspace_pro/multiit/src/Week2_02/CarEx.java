package Week2_02;

public class CarEx
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Car 클래스 타입 myCar을 1대 생성
		Car myCar = new Car();
		
		//초기값 할당이 됐는지 확인~~
		System.out.println(myCar.model+" "+myCar.start+" "+myCar.speed);
		
		
		//myCar의 모델명은 EV9
		myCar.model = "EV9";
		//start값은 true
		myCar.start = true;
		//speed는 70값으로 세팅
		myCar.speed = 70;
		System.out.println(myCar.model+" "+myCar.start+" "+myCar.speed);
		//도트.연산자 : 객체가 가지고 있는 필드나 메소드에 접근하고자 할 때 참조변수 뒤에 붙인다

	}

}
