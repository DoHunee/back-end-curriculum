package Week2_04_Exception;

public class Account  //은행계좌
{
  private long balance;
  
  public Account() {}
  
  public long getBalance() {
	  return this.balance;
  }
  //입금 기능
  public void deposit(int money) {
	  balance += money;
  }
  //출금 기능   잔고보다 큰 금액은 출금할 수 없다. 
  public void withdraw(int money) throws InsufficientException{
	  if(balance < money) {
		  throw new InsufficientException("잔고부족:"+ (money-balance)+"금액 부족합니다.");
	  }
	  balance -= money;
  }
  
}
