//이것이 자바다 6장 확인문제 19번 
package Week2_02_Quiz;

class Account1
{
	
		int balance = 0;
		static final int MIN_BALANCE = 0;
		static final int  MAX_BALANCE = 1000000;
		
		
		public Account1(){}
		
	    public void setBalance(int balance)
		{   if(balance >= MIN_BALANCE && balance <= MAX_BALANCE )
	    	this.balance = balance;

		}
	    
	    public int getBalance()
		{
	    	return this.balance;
		}
	    
		
		
}


public class Account1EX
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Account1 account = new Account1();
		
		account.setBalance(10000);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고 : "+ account.getBalance());

		account.setBalance(300000);
		System.out.println("현재잔고 : "+ account.getBalance());


	}

}
