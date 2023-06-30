package Week3_01_Generic;


class Box<T>{
	public T content;   //2시 5분 시작
	
}

class Student{}


public class GenericEx
{
      //제너릭 정의 :  결정되지 않은 타입을 파라미터로 처리하고 실제 사용할때 
	 // 파라미터를 구체적인 타입으로 대체시키는 기능 
	public static void main(String[] args)
	{
		
		//Box클래스를 이용하여 box를 1개 생성해 주세요 
		//Box box1 = new Box(); 
		Box1<String> box1 = new Box1<String>();
		box1.content ="안녕하세요";
		String str = box1.content;
		System.out.println(str);
		box1.content = String.valueOf(1);

        Box1<Integer> box2 = new Box1<>();
        box2.content = Integer.valueOf(3);
        
        box2.content = Integer.valueOf("2");
        
       Box1  stu = new Box1();
       stu.content = new Student();
       stu.content = new Student();
       stu.content = new String("장마시작");
       stu.content = Integer.valueOf(3);
	}

}
