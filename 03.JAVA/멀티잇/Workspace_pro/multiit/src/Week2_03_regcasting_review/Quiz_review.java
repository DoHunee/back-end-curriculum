//상속 퀴즈 7번@@
// 다형성 문제!!!

package Week2_03_regcasting_review;

class Parent{ //2번 접근
	String nation;
	
	Parent(){ //3번 접근
		this("대한민국");
		System.out.println("Parent() call");
	}
	Parent(String nation){
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent{
	String name;
	
	Child(){   //1번 접근
		this("홍길동");
	    System.out.println("child() call");
	}
	
	Child(String name){ //4번 접근
		this.name = name;
	    System.out.println("child(String name) call");
	}
	
}


public class Quiz_review
{
	public static void main(String[] args)
	{
		Child child = new Child();
		
	}

}
