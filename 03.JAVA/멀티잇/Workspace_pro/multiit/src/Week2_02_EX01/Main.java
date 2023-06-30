package Week2_02_EX01;

public class Main
{

	public static void main(String[] args)
	{
		Student stu = new Student("장우건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();

		Student stu1 = new Student("서유미", "javaprogram", 460000);
		stu1.calcReturnFee();
		stu1.print();
		
		Student stu2 = new Student("김성태","English",580000);
		stu2.calcReturnFee();
		stu2.print();


	}

}
