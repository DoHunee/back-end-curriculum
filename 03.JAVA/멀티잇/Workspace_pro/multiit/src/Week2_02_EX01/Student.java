package Week2_02_EX01;


public class Student
{
   String name;
   String subject;
   int fee;
   double returnFee;
   
   Student(){}  //기본생성자    
   //메소드 오버로딩: 파라미터의 개수나, 
   //타입을 다르게 설정해서 같은 이름의 메소드를 
   //다양한 형태로 사용하는 기법
   Student(String name,String subject,int fee){
	   this.name = name;
	   this.subject = subject;
	   this.fee = fee;
   }
   
   public void calcReturnFee() {
	   if (this.subject.equals("javaprogram")) {
			returnFee = this.fee / 4;
		} else if (this.subject.equals("jspprogram")) {
			returnFee = this.fee / 5;
		} else {
			System.out.println("그런 과정명은 없습니다.");
			System.exit(0);  //프로그램 종료 명령어
		}
	   
   }
   
   public void print() {
	   System.out.println(
				this.name + "씨의 과정명은 " + this.subject + "이고, 교육비는 " + this.fee + "이며, 환급금은 " + returnFee + "입니다.");
   }
	
   
   
   
   
}
