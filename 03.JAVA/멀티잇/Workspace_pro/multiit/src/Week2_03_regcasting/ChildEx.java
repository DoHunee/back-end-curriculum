
///다형성 부분 (사용 방법은 동일하지만 실행결과가 다르다)
// 어려우니 교재보고 이해!!
//강사님 너무 폭주함

package Week2_03_regcasting;

public class ChildEx
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// 자식 객체 생성
		Child child = new Child();
		
		//
		Parent parent = new Child();
		System.out.println(parent.field1);
		parent.method1();
		parent.method2();
		
		// parent.field2; 접근 불가능 
		// parent.method3(); 접근 불가능
		
		Child child1 = (Child)parent;  //자식으로 강제형변환을 통해 접근하도록
		child.field2 = "data2";
		child1.method3();
		
		
		//부모를 자식으로 자동타입 변환
		//Parent parent = child;
		
		parent.method1(); // parent에서 바로
		parent.method2(); // parent 에서 child 걸쳐서 변형돼서 왔다
		//parent.method(); //호출 불가능
		
		child.method3(); // child에서 바로!

	}

}
