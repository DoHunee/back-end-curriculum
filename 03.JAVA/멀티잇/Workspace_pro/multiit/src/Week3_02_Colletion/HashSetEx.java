package Week3_02_Colletion;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx
{

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		
		//객체저장 
		set.add("Java");
		set.add("Java");   //중복객체이므로 저장하지 않음 
		set.add("JDBC");
		set.add("JSP");
		set.add("Springboot");
		
		//저장된 객체 수 출력 
		System.out.println(set.size());
		

	}

}













