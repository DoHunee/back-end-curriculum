package Week2_05_basemodule;

import java.util.HashSet;

class Student extends Object{
	
	 private int no;
	 private String name;
	 
	 public Student(int no, String name) {
		 this.no = no;
		 this.name = name;
	 }
   //Student 객체를 동등비교하기 위해 hashCode() , equals()메소드를 재정의 
	//학생번호와 이름으로 해시코드 생성하고, 학생번호와 이름이 동일할 경우에만 equals() 가 true 리턴 
	/*
	 * @Override public int hashCode() { int hashCode = no + name.hashCode(); //내가
	 * 원하는 형태의 해시코드로 재설정 return hashCode; }
	 */

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student target) {   //obj Student타입인지 검사하고 타입 변환 후 target변수 대입
			if(no == target.getNo() && name.equals(target.getName())) return true;     //학생번호, 학생이름 
		}
		return false;
	}

	/**
	 * @return the no
	 */
	public int getNo()
	{
		return no;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	 
	 
	 
}



public class HashCodeEx
{

	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		
		
		Student s1 = new Student(1, "김멀티");
		hashSet.add(s1);
		System.out.println("저장된 객체 수 " + hashSet.size());
		Student s2 = new Student(1, "김멀티");
		hashSet.add(s2);
		System.out.println("저장된 객체 수 " + hashSet.size());   
		
		Student s3 = new Student(2, "이강수");
		hashSet.add(s3);
		System.out.println("저장된 객체 수 " + hashSet.size());
		
		
		if(s1.hashCode() == s2.hashCode()) {
			
			if(s1.equals(s2)) {
				System.out.println("학생번호와 이름이 같으므로 동등객체");
				System.out.println(s1.hashCode() + "   " + s2.hashCode());
				System.out.println(s1.toString()  + " " + s2.toString());
			} else {
			
			System.out.println("학생번호와 이름이 다르므로 동등객체가 아니다.");
			System.out.println(s1.hashCode() + "   " + s2.hashCode());
			}
			
			
		}else {
			System.out.println("해시코드가 다르므로 동등객체가 아니다.");
			System.out.println(s1.hashCode() + "   " + s2.hashCode());
			System.out.println(s1.toString()  + " " + s2.toString());
		}

	}

}
