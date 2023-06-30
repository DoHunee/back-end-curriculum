package Week2_03_Overriding;

public class Calculator extends Object
{
	static final double PI = 3.14;
  
	public double areaCircle(double r) {
	   System.out.println("Calculator의 areaCircle()실행");
	  return  r*r*PI;
  }
}
