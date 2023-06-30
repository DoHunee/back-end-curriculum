package Week2_03_Access;

public class B1
{
    //필드 선언
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);
	//A1 a3 = new A1("문자열");  private 생성자 제한으로 접근 불가 컴파일에러  
	
	
	
	//필드값 변경 
	
	public void method() {
		A1 b = new A1();
		
		b.f1 = 2;
		b.f2 = 3;
		//b.f3 = 4;
		b.setF3(4);
		b.getF3();
		
		
		//메소드 호출
		b.method1();
		b.method2();
		//b.method3(); private 메소드 
	}
	
	
}
