package Week2_02_EX02;

public class CarEx
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//1. Car 객체 생섵
		Car mycar = new Car();
		
		Car1 yourcar = new Car1();
		System.out.println(yourcar);
	
		//2. gas 주입
		mycar.set(5);
		
				
		//3. run 실행
		if (mycar.isLeftGas()) {
			System.out.println("출발합니다");
			mycar.run();
		}
		
		System.out.println("gas 새로 주입해주세요");
		

	}

}
