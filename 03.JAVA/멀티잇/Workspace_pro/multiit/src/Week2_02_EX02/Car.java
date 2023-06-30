
package Week2_02_EX02;

public class Car
{
	int gas;

	void set(int gas)
	{ // return 값이 없는 메소드 매개변수 gas를 받아서 개체변수 gas에 저장
		this.gas = gas;
	}

	// 리턴값이 boolean인 isLeftGas() 메소드를 작성하세요
	// gas 필드값이 0이면 false 0이아니면 true 리턴하는
	boolean isLeftGas()
	{
		if (gas == 0)
		{
			System.out.println("gas가 없습니다");
			return false;
		} else
		{
			System.out.println("gas가 있습니다");
			return true;
		}
	}

	// 리턴이 없는 매소드로 run() ,gas필드값이 0이면 , return 문으로 메소드를 종료시키세요
	void run()
	{
		while (true)
		{
			if (gas > 0)
			{
				System.out.println("달립니다. (gas 잔량 : )" + this.gas);
				gas -= 1;
			} else
			{
				System.out.println("멈춥니다.(gas 잔량 : )" + this.gas);
				return;
			}

		}

	}

}
