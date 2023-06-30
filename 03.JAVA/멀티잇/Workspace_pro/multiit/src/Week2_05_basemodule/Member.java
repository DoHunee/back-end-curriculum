package Week2_05_basemodule;

public class Member extends Object  //회원
{
	
	@Override
	public boolean equals(Object obj)   //Object의 equals()메소드 재정의 
	{
		if(obj instanceof Member target) {   //obj Member타입인지 검사하고 타입 변환 후 target변수 대입
			if(id.equals(target.id) && pwd.equals(target.pwd)) return true;     //id문자열이 같은지 비교 
		}
		return false;
	}

	public String id;
	public String pwd;
	
	public Member(String id){
		this.id = id;
	}
	
	public Member(String id, String pwd){
		this.id = id;
		this.pwd = pwd;
	}
	
	
	

}
