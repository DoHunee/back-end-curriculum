package Week2_04_Exception;


public class AccountEx
{

	public static void main(String[] args)
	{
		Account account = new Account();
		
		//예금하기 
		account.deposit(10000);
		System.out.println("현재 잔고 :"+ account.getBalance());
		
		//출금
		try
		{
			account.withdraw(5000);
			System.out.println("현재 잔고 :"+ account.getBalance());
			account.withdraw(7000);
		} catch (InsufficientException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
