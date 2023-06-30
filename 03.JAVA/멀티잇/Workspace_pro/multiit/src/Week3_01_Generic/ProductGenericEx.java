package Week3_01_Generic;


class Product<K,M>{  //타입 파라미터를 K(kind)와 M(model)으로 정의 
	private K kind;
	private M model;     //타입파라미터를 필드 타입으로 정의 
	/**
	 * @return the kind
	 */
	public K getKind()
	{
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(K kind)
	{
		this.kind = kind;
	}
	/**
	 * @return the model
	 */
	public M getModel()
	{
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(M model)
	{
		this.model = model;
	}
	
	
}      

class Tv{
	
}

class Car{
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class Home{
	
	public void turnOnLight() {
		System.out.println("전등불을 켰습니다.");
	}
}

class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent()
	{
		// TODO Auto-generated method stub
		return new Home();
	}
	
}

class Radio{}

public class ProductGenericEx 
{

	public static void main(String[] args)
	{
		//Product 클래스에 K는 Tv로 Model은 String 으로 대체하여 p1제품을 생성하세요!
		Product<Tv,String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트삼성파브");
		 Tv tv = p1.getKind();
		 System.out.println(tv.toString());
         System.out.println(p1.getModel());
   
         
       //Product 클래스에 K는 Car로 Model은 String 으로 대체하여 p2제품을 생성하세요!
       //p2를 이용하여 자동차(Car)를 생성하고 모델명은 "SUV-NEW카니발" 로 생성하세요
         
       Product<Car,String> p2 = new Product();
       
       p2.setKind(new Car());
       p2.setModel("SUV-NEW카니발");

       ShopManger carrent = new ShopManger();
       Car car = carrent.rent();
       car.run();
       
       // ProductGenericEx 렌탈 숍에 가서 HomeAgency에게 집(Home) 렌트rent()를 요청했습니다.
       //  HomeAgency는 요청에 따라 집을 렌트해주었습니다.
       //  사용자는 렌트한 집에 가서 전등불을 켰습니다.  "전등불을 켰습니다."
       
       HomeAgency homerent = new HomeAgency();
       Home home = homerent.rent();
       home.turnOnLight();
       
       
	}
    
	
}


   










