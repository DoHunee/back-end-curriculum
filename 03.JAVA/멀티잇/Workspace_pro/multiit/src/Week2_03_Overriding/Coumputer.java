package Week2_03_Overriding;

public class Coumputer extends Calculator
{

	@Override //컴파일 단계에서 정확히 오버라이딩이 되었는지 체크 ,에러시 컴파일에러 출력해 준다.
	public double areaCircle(double r)
	{
		double result = super.areaCircle(r);   //super();부모의 생성자 호출
		System.out.println("부모의 areaCircle결과 확인" + result);
		System.out.println("Computer의 areaCircle()실행");
		return r * r * Math.PI;
	}
	// 메소드 오버라이딩
	/*
	 * public double areaCircle(double r) {
	 * System.out.println("Computer의 areaCircle()실행"); return r*r*Math.PI; }
	 */

}
