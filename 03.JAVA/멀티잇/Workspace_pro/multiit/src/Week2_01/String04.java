package Week2_01;

public class String04
{

	public static void main(String[] args)
	{
		//문자열 찾기 기능  : 문자열에서 특정 문자열의 위치를 찾고자 할때 indexOf() 사용
		//indexOf() 는 주어진 문자열이 시작되는 인덱스를 리턴한다. 
		
		String subject = "자바 프로그래밍은 배우면 재미있습니다. 유용하며 활용도가 높습니다.";
		int index = subject.indexOf("유용");
		
		if(index  == -1) {
			System.out.println("해당 문자열이 존재하지 않습니다.");
		}else {
			String result = subject.substring(index);
			System.out.println(result);
			
		}
		//주어진 문자열이 단순히 포함되어 있는지 없는지 여부 조사 : contains() 
		
		boolean result2 = subject.contains("프로그래밍");
		System.out.println(result2);
		
		
	}

}
