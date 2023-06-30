package Week2_02_EX02;

public class Calculator
{
	
	   int a;
	   int b;
	   int sum=0;
	   static double pi = 3.14159; //static 키워드 붙어지면 정적멤버
	                              //this 안하고 바로 Ex에서 직접호출 가능!!!
	   
	 
	   Calculator(int a,int b){
		   this.a = a;
		   this.b = b;
		   
		   
	   }
	   
	   // 이렇게도 선언 가능~~~~~
//	   Calculator(){
//		   this(10,20)
//	   }
	   
	   
	   public void add() {
		   sum = this.a + this.b;
		   System.out.println("add : "+sum); }
	       //= return sum
	   
	   public void sub() {
		   sum = this.a - this.b;
		   System.out.println("sub : "+sum); }
	   
	   public void multi() {
		   sum = this.a * this.b;
		   System.out.println("multi : "+sum); }
	   
	   public void div() {
		   sum = this.a / this.b;
		   System.out.println("div : "+sum); }
	   
	   void powerOn() {
		   System.out.println("전원을 켭니다.");
	   }
	   
	   void powerOff() {
		   System.out.println("전원을 끕니다.");
	   }
	   
	  
		

}
