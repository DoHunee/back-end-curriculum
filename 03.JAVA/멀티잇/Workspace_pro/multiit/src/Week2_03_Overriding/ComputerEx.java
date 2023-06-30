package Week2_03_Overriding;

public class ComputerEx
{

	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		System.out.println(cal.areaCircle(5.5));

		Coumputer cal1 = new Coumputer();
		System.out.println(cal1.areaCircle(5.5));

	}

}
