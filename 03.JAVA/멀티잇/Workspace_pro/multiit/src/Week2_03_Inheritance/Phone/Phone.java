package Week2_03_Inheritance.Phone;

public class Phone
{
  //필드 선언
	public String model;
	public String color;
	
	public Phone(){
		System.out.println("Phone() 생성자 실행");
	}
	public Phone(String model, String color){
		System.out.println("Phone(String model, String color) 생성자 실행");
	}
	
}
