package Week2_05_basemodule;


public class MemberEx
{

	public static void main(String[] args)
	{
		Member obj1 = new Member("blue1111","1111");
		Member obj2 = new Member("blue1111","1111");
		Member obj3 = new Member("red2222");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 다릅니다.");
		}
		
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 다릅니다.");
		}
		
	}

}
