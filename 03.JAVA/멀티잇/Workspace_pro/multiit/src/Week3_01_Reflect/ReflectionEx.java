package Week3_01_Reflect;


import java.lang.reflect.Constructor;

class Car{
	private String model;
	private String owner;
	
	public Car(){}
	public Car(String model){ this.model = model;}
	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}
	/**
	 * @return the owner
	 */
	public String getOwner()
	{
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	
}


public class ReflectionEx
{

	public static void main(String[] args)
	{
		Class classmedata = Car1.class;   //Car클래스의 메타정보 받아오기 
		
		//Class classmedata1 = Class.forName("javastudy.reflect.Car");
		System.out.println("패키지 :" + classmedata.getPackage().getName());
		System.out.println("클래스 간단 이름 :" + classmedata.getSimpleName());
		System.out.println("클래스 전체 이름 :" + classmedata.getName());
		
		System.out.println("생성자 정보=========");
		Constructor[]  con = classmedata.getDeclaredConstructors();
		for(Constructor car : con) {
			System.out.println(car.getName() + "(");
			Class[] param = car.getParameterTypes();
			System.out.println(param);
			System.out.println(")");
			
		}
		
		String path1 = classmedata.getResource("./img.photo1.jpg").getPath();
		System.out.println(path1);
		

	}

}
