package Week2_02_Quiz;

public class Student
{

	// 문제 2
	// 1.다음과 같은 필드를 가지고
	// 필드는 private
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	// 2. 다음과 같은 생성자를 가진다
	// 생성자와 메소드는 public
	public Student(String name, String subject, int fee)
	{
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

    // // 생성자와 메소드는 public
	// 3-1. 
	public void calcReturnFee()
	{
		if (this.subject.equals("javaprogram"))
		{
			returnFee = this.fee / 4; // 25%
		} else if (this.subject.equals("jspprogram"))
		{
			returnFee = this.fee / 5; // 20%
		} else
		{
			System.out.println("그런 과정명은 없습니다.");
			System.exit(0); // 프로그램 종료 명령어
		}

	}
	
	// 생성자와 메소드는 public
	// 3-2.
	public void print()
	{
		System.out.println(
				this.name + "씨의 과정명은 " + this.subject + "이고, 교육비는 " + this.fee + "이며, 환급금은 " + returnFee + "입니다.");
	}

	
	
	
	public static void main(String args[])
	{
		Student stu = new Student("장동건", "jspprogram", 500000);
		stu.calcReturnFee();
		stu.print();
	}
}