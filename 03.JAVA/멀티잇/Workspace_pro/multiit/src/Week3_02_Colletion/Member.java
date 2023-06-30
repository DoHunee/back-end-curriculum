package Week3_02_Colletion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Member extends Object
{
   //회원정보는 이름과 나이를 갖는다. 
	private String name;
	private int age;

	
   //생성자를 통해 회원의 이름과 나이를 초기화한다.
	public Member(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
   //Object 클래스의 hashCode() 재정의 (name과 age값이 같으면 동일한 hashCode가 리턴(name.hashCode()+age)리턴 

	public String getName()
	{
		return name;
	}


	public int getAge()
	{
		return age;
	}


	@Override
	public int hashCode()
	{
		return this.name.hashCode() + age;
	}
	
   //Object 클래스의 equals()	재정의 (name과 age값이 같으면 true 리턴되도록 합니다.)
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Member target) {
			return target.name.equals(this.name) && (target.age == this.age);
		}else {
			return false;
		}
	}

	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",20));
		
		System.out.println(set.size());  
		// set은 인덱스가 존재하지 않기 떄문에 , get(i) 기능이 없다.
		// 반복자 iterator
		
		
		//중요!!
		//iterator 패턴 익혀주세요
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member element = it.next();
			System.out.println(element.getName() + element.getAge());
		}
		
		for(Member m : set) System.out.println(m.getName() + " "+m.getAge());
	}




}
