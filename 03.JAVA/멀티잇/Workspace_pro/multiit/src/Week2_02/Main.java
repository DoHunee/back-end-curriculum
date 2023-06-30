package Week2_02;

//객체선언의 가장 기본 틀!!!

//라이브러리 클래스
class Student{
	//데이터 
	String name;
	
	//기능1 : 이름을 전달받아서 저장 기능
	public void setName(String name) {
		this.name = name;
	}
	
	//기능2 : 이름을 출력하는 기능
	public String getName() {
		return this.name;
	}
		
}		
		



public class Main
{

	public static void main(String[] args)
	{
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.setName("김자바");          //이름 전달받아서 저장하는 기능
		String name1 = stu1.getName();  //이름 출력하는 기능
		System.out.println(name1);
		
		stu2.setName("장자바");          //이름 전달받아서 저장하는 기능
		String name2 = stu2.getName();  //이름 출력하는 기능
		System.out.println(name2);

	}

}
