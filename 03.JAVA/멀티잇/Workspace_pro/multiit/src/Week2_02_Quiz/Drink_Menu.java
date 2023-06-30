//상속
package Week2_02_Quiz;

class Drink
{
	// 필드 선언 
	// 이제부터는 필드는 항상 private로 
    String name; //상품명
    int price;  //단가
    int count;  //수량
	
   
    public Drink() {}
   
    // 멤버 변수를 초기화하는 샡성자 메서드
	public Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
		
	}
	
	// 금액
	public int getTotalPrice() {
		int totalPrice = this.price * this.count;
		return totalPrice;
	  }
	
	// 상품의 타이틀
	// return 없으니까 void!!!
	public static void printTitle() {
		System.out.printf("%8s%8s%8s%8s%n","상품명","단가","수량","금액");
	}

	
	// 상품의 정보
	public void printData() {
		 System.out.printf("%8s%8d%8d%d%n",name,price,count,getTotalPrice());
	}

	

}


class Alcohol extends Drink
{
	//말했다 필드는 private라고!!
	private double alcper;
	
	public Alcohol() {}
	public Alcohol(String name, int price, int count,double alcper){
		//부모에서 private하면 super가 안 먹으니까 풀어줘!
		// 부모에 있으니 super
		super.name = name;
		super.price = price;
		super.count = count;
		
		this.alcper = alcper;
		
	}
	// 마우스 우클릭 >> 소스 >> 오버라이드할 메소드 선택
	
	public static void printTitle()
	{
		System.out.printf("%8s%8s%8s%-3s%n","상품명(도수[%])","단가","수량","금액");
	}
	
	@Override
	public void printData()
	{
		System.out.printf("%s   %d   %d %d%n",name+"("+alcper+")",price,count,getTotalPrice());
	}


	

}


public class Drink_Menu
{
	public static void main(String[] args){

		// drink 는 이름 가격 수량
		Drink coffee = new Drink("커피",1500,4);
		Drink tea = new Drink("녹차",1100,7);
		
		// Alcohol은 는 이름 가격 수량 도수
		Alcohol wine = new Alcohol("와인", 5000, 3, 15.1);
		
		
		System.out.println("***** 매 출 전 표 ***** ");
		
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		System.out.println();
		
		// 내용이 변경됐네!
		Alcohol.printTitle();
		wine.printData();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + wine.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");

     }
}
