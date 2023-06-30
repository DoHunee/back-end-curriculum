
package Week2_03_regcasting_Quiz;

abstract class Shape
{
	double area;
	String name;

	public Shape()
	{
	}

	public Shape(String name)
	{
		this.name = name;
	}

	// getter 선언 public String getter() { return name; }

	// setter 선언 public void setter(String name) { this.name = name; }

	abstract void calculationArea();

	public abstract void print();

}



class Rectangular extends Shape
{

	private double width;
	private double height;

	public Rectangular(String name, double width, double height)
	{
		super.name = name;
		this.width = width;
		this.height = height;
	}

	void calculationArea()
	{
		area = width * (double) height;

	}

	@Override
	public void print()
	{
		System.out.println("직사각형의 면적은 " + area);
	}

}




class Circle extends Shape
{
	private double radius;

	public Circle(String name,double radius)
	{
		super.name = name;
		this.radius = radius;

	}

	@Override
	void calculationArea()
	{
		area = radius * radius * 3.14;

	}

	@Override
	public void print()
	{
		System.out.println("원의 면적은 " + area);
	}

}




public class TestShape
{

	public static void main(String[] args)
	{
		Rectangular a = new Rectangular("1빠", 2.0, 3.0);
		a.calculationArea();
		a.print();
		
		Circle b = new Circle("2빠", 2.0);
		b.calculationArea();
		b.print();

	}

}

/*생성자
객체 생성할때 호출되는 특수한 메소드
new 연산자가 객체가 생성자를 이용하여 객체를 생성
Book book = new Book();

생성자의 특징
1) 생성자명은 클래스명과 동일
2)메서드이지만 반환형이 없는 형태입니다.

디폴트 생성자는
1) 생성자명이 클래스명과 같다.
2)생성자 오버로딩이 않을시에
   컴파일할때 자동으로 디폴트 생성자를 생성해준다.
   단) 생성자 오버로딩이 되있다면
        반드시 개발자는 디폴트생성자를 만들어줘야 한다.


6.9 필드와 메서드
선언방법에 따라 인스턴스 멤버와 정적멤버로 분류
- 인스턴스멤버로 선언이 되면
  객체 생성 후 사용할 수 있다.
  객체에 소속된 멤버 = 인스턴스멤버

  this 키워드
  객체 내부에서는 인스턴스 멤버에 접근하기 위해
  사용되는 명령어이다.
  객체 자신을 'this'  가리킨다.
  인스턴스 필드를 의미

- 정적멤버 선언되면 객체생성 없이 사용할 수 있다.
- final 타입 필드 = 초기값;
1. 필드 선언시 초기값 대입
2. 생성자에서 초기값 대입


상수(불변의 값) : 객체마다 저장할 필요 없다.
static final 타입 상수 = 초기값;
- 캡슐화 , 정보의 은닉화를 위해 접근제한자를 이용
객체의 필드를 외부에서 변경하거나, 메소드를
호출할 수 없도록 막아야 할 필요가 있다.
중요한 필드나 메소드가 외부로 노출되지 않도록
객체의 무결성을 유지하기 위한 방법


- 상속
이미 잘 개발된 클래스를 재사용해서
새로운 클래스를 만들기 때문에 중복되는 코드를
줄 일 수 있어 개발시간을 단축시키며
유지관리의 효율성을 높일 수 있다.


- 메소드 오버로딩(Overloading)
  메소드 이름은 같고 매개변수(타입, 매개변수 순서,개수)
  를 다르게 정의하여  같은 이름의 메소드를
  다양한 형태로 사용하는 방법


- 메소드 오버라이딩(Overriding)
  상속에서 사용하는 다형성 기법 으로 메소드 재정의
-다형성
 사용방법은 동일하지만 실행 결과가 다양하게 나오는 성질
예) 자동차의 부품을 교환하면 성능이 다르게 나온다.
 객체는 부품과 같아서 프로그램을 구성하는 객체를 바꾸면
프로그램의 실행 성능이 다양하게 나 올 수 있다.*/


/*
 * package Javaday2_03_regcasting_Quiz;
 * 
 * 
 * abstract class Shape{ private double area; private String name;
 * 
 * Shape(){} Shape(String n){ this.name=n; }
 * 
 * public double getArea() { return area; } public void setArea(double a) {
 * this.area = a; } public String getName() { return name; } public void
 * setName(String n) { this.name = n; } abstract void calculationArea();
 * 
 * void print() { System.out.println(name+"의 면적은"+area); }
 * 
 * }
 * 
 * 
 * 
 * class Circle extends Shape{ Circle c; double radius;
 * 
 * @Override void calculationArea() { double pi=3.141592653589793; double
 * d=pi*(radius*radius); setArea(d); }
 * 
 * 
 * Circle(String a,int b){ setName(a); radius=b; }
 * 
 * 
 * }
 * 
 * 
 * 
 * class Rectangular extends Shape{
 * 
 * Rectangular r; double width; String hight;
 * 
 * public Rectangular() {
 * 
 * @Override 
 * 
 * void calculationArea() { 
 * double h=Double.valueOf(hight); double
 * d=(double)(width*h); setArea(d); }
 * 
 * Rectangular(String a,int b,int c){
 * 
 * setName(a); width=(double)b; hight=String.valueOf(c); }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * public class TestShape {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 */