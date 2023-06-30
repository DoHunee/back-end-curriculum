//접근제한자
package Week2_03_Access;

public class Main
{

	public static void main(String[] args)
	{
		//정적 메소드를 호출해서 싱글톤 객체를 얻어온다.
		SingleToneTest obj1 = SingleToneTest.getInstance();
		SingleToneTest obj2 = SingleToneTest.getInstance();
		
		
		if(obj1 == obj2) {
			System.out.println("같은 객체값");
		}else System.out.println("다른 객체값");
		

	}

}
