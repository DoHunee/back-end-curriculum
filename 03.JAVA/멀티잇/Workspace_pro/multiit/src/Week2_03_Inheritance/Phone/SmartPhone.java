package Week2_03_Inheritance.Phone;

public class SmartPhone extends Phone
{
  public boolean wifi;
  
  public SmartPhone(String model, String color){
	  super(model,color);   //생략가능 (컴파일시 자동 추가됨) : 부모의 생성자를 호출하는 특수 메소드 
	  this.model = model;
	  this.color = color;    //Phone으로 부터 상속받은 필드를 내것처럼 사용
	  System.out.println("SmartPhone(String model, String color)생성자 실행완료!");
  }
  
  
}
