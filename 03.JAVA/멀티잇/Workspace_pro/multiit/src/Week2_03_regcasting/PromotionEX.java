package Week2_03_regcasting;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D extends C{
	
}
// 가장 막내이자 메모리가 가장 큰 E
class E extends D{
	
}



public class PromotionEX
{

	public static void main(String[] args)
	{
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;  // 지동 타입 변환 (상속관계 있음)
		

		B b2 = (B)a1;
		C c2 = (C)b;
		

	}

}
