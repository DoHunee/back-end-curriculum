package Week2_03_Inheritance.Phone;

 class SmartPhoneEx
{

	public static void main(String[] args)
	{
		//SmartPhone 객체 생성 model :갤럭시 color: white
		 	
		 SmartPhone myPhone = new SmartPhone("갤럭시","white");
		
		//Phone으로부터 상속받은 필드 읽기 출력
		  System.out.println(myPhone.model);
		  System.out.println(myPhone.color);
		
		  //교재 310~324 페이지 읽고 다시 개념정리 해 주세요! 
		  
		
	}

}
