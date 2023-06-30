// Main이 없는 라이브러리 클래스
package Week2_02;

public class Student2
{
	String name;   //필드 : 객체의 데이터가 저장되는곳
	int age;
	
	Student2(){}  //생성자 : 객체 생성시 초기화 역할을 담당하는 특수한 메소드
	
	
	//메소드 : 객체의 동작으로 호출(이름을 불러줌)할 때 실행하는 블록
	// name을 저장하는 setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age ) {
		this.age = age;
	}
	
  // name 잘 저장되었는지 확인 getter 매소드
    
	public String getName( ) {
		return this.name;
	}
	
	public int getAge( ) {
		return this.age;
	}
	
	public void printInfo() {
		System.out.println(this.name+"학생의 나이는 "+this.age);
	}
	

	
	
	
}
