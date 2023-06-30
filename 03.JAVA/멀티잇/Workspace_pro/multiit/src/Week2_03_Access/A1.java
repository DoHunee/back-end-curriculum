package Week2_03_Access;

public class A1
{
  //필드 선언
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);
	A1 a3 = new A1("문자열");
	
	public int f1;
	int f2;
	private int f3;
	
	public int getF3()
	{
		return f3;
	}

	public void setF3(int f3)
	{
		this.f3 = f3;
	}

	public A1() {
		/*
		 * f1 = 1; f2 = 1; f3 = 1;
		 */
		
		method1();
		method2();
		method3();
		
	}
	
	public void method1() {}
	
	       void method2() {}
	       
	private void method3() {}
	
	
	
	
	
	//public 접근 제한 생성자 선언 
	public A1(boolean b) {}
	
	//default 접근 제한 생성자 선언
	A1(int a) {}
	
	//private 접근 제한 생성자 선언
	private A1(String s) {}
	
}
