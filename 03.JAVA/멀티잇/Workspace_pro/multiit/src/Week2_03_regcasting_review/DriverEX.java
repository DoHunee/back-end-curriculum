// 다형성 문제!!!
package Week2_03_regcasting_review;

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle{

	@Override
	public void run()
	{
		System.out.println("버스가 달립니다.");
		}
	
}

class Taxi extends Vehicle{

	@Override
	public void run()
	{
		System.out.println("택시가 달립니다.");
	}	
}
	


class Driver{
	public void drive(Vehicle v) //클래스 타입의 매개변수로 값을 전달 받는다
	{
		v.run();
	}
	
}



//굉장히 중요!!!
public class DriverEX
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//운전자한테 버스를 운전
		//1.운전자 객체 생성
		Driver driver = new Driver();
		
		//2.운전자에게 버스객체 전달
		Bus bus = new Bus();
		if (bus instanceof Vehicle) {
			driver.drive(bus);
		}
		
		
		
		//운전자한테 택시를 운전
		//1.운전자 객체 생성
		Taxi taxi = new Taxi();
		if (taxi instanceof Vehicle) {
		driver.drive(taxi);
		//2.운전자한테 택시를 운전 
		}

	}

}
