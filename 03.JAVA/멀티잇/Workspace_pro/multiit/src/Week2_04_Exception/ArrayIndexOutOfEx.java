package Week2_04_Exception;

public class ArrayIndexOutOfEx
{
	public static void arryEx(String[] array) {
		
		for(int i = 0 ; i < array.length; i++ ) 
			try
			{
				System.out.println(array[i]);
				int value = Integer.parseInt(array[i]);
				
			} catch (ArrayIndexOutOfBoundsException | NumberFormatException e )
			{
				System.out.println(e.getMessage());
			} /*
				 * catch(NumberFormatException e1) { System.out.println(e1.getMessage()); }
				 */
			
				
		
	}

	public static void main(String[] args)
	{
		String[] array = {"100","200","300","1ooo"};
		arryEx(array);
		System.out.println("프로그램 종료");
	}

}
