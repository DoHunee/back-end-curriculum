// 초상 클래스
package Week2_04;

abstract class Animal{
	
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	public void eat() {
		System.out.println("먹습니다");
	}
	
	public abstract void sound(); // {body}가 없는 메소드를 추상메소드	
}



class Dog extends Animal{

	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("멍멍");
		
	}

	@Override
	public void breathe()
	{
		// TODO Auto-generated method stub
		System.out.println("강아지가 숨을 쉽니다");
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("뼈다귀를 먹습니다");
	}
	
	
}

class Cat extends Animal{

	@Override
	public void sound()
	{
		// TODO Auto-generated method stub
		System.out.println("애옹");
		
	}
	

	@Override
	public void breathe()
	{
		// TODO Auto-generated method stub
		System.out.println("고양이가 숨을 쉽니다");
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("생선을 먹습니다");
	}
	
}



//
//// 전달받은 동물의 타입에 맞추어 소리(sound()) 실행 하도록 작성
// static void AnimalSound(Animal animal) {
//	animal.sound();
//}
//


// 추상클래스를 상속할 떄, 추상클래스 안에 추상메소드가 있다면 자식클래스에서는 반드시 추상메소드를 정의해주어야 한다 
abstract class AbstractEx{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Dog dog = new Dog();
		 dog.sound();
		 dog.breathe();
		 dog.eat();
		 
		 Cat cat = new Cat();
		 cat.sound();
		 cat.breathe();
		 cat.eat();
 
//		 AnimalSound(dog);
//		 AnimalSound(cat);

	}

}
