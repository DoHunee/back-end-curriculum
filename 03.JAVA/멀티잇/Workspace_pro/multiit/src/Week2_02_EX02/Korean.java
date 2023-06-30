package Week2_02_EX02;

public class Korean
{
	// 인스턴스 final 필드 선언
	final String nation ="대한민국";  //final이 있으니까 수정불가
    final String ssn;
    static final double PI = 3.14;
    
    //인스턴스 필드 name 선언
    String name;
    
    //생성자 선언
    public Korean (String ssn,String name) {
    	this.ssn = ssn;
    	this.name = name;
    }
}

