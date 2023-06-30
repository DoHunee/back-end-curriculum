package Week2_02_Quiz;


public class Member
{
	String name;
	String id;
	String password;
	int age;
	
	Member(){}
	Member(String id, String password){
		this.id = id;
		this.password = password;
	}
 
	boolean login(String id, String password) {
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 하셨습니다.");
	}	
		
	
}
