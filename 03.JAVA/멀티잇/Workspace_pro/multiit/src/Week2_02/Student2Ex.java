// 실행 클래스!!
package Week2_02;

public class Student2Ex
{

	public static void main(String[] args)
	{
		// student2 라이브러리 클래스에서 가져오는거네~~~~
		Student2 stu1 = new Student2();
		Student2 stu2 = new Student2();

		stu1.setName("김선비");
		stu2.setName("최단비");
		stu1.setAge(15);
		stu2.setAge(17);
		
		stu1.printInfo();
		stu2.printInfo();


	}

}
