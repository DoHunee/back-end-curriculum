package Week1_02_scope;

public class VariableScopeEx1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0;
		
		if (v1 >10){
			 //int v2 = v1 - 10;
			v2 = v1 -10;
			
		} 
		int v3 = v1 + v2 +5;
 
	}

}
