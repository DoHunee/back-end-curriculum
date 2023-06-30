// 다형성 문제!!!
package Week2_03_regcasting_review;

class Person{
	public String name;
	
	Person(){}
	Person(String name){
		this.name = name;
	}
	

	public void walk() {
		System.out.println("걷습니다");
	}
	
}

class Student extends Person{
	public int StuNo;
	
	// 학생 이름과 학생번호를 전달 받아 초기화 하는 생성자 선언해 주세요!
	Student(String name,int StuNo){
		super(name); //부모꺼니까
		this.StuNo = StuNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다");
	}
}


public class InstanceOfEx
{
	
	public static void personInfo(Person person) {
		//데이터 타입을 검증하는 기능
		System.out.println("name : " + person.name);
		person.walk();
		
		// person이 참조하는 객체가 Student 타입인지 확인
		if(person instanceof Student student) {
			System.out.println("stuNo:" + student.StuNo);
			student.study();
		}
	}

	public static void main(String[] args)
	{
		//Person 객체를 매개값으로 제공하고 personInfo() 호출한다
		Person p1 = new Person("김홍도");
		personInfo(p1); // 학생인지 확인@@@ >> 그냥 person으로 나오겠지!!~
		
		
		Person p2 = new Student("김길동",10);
		personInfo(p2);
		

	}

}
