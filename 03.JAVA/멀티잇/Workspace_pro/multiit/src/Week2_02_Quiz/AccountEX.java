package Week2_02_Quiz;

import java.util.Scanner;

class Account
{
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 계좌번호
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	
	// 계좌주
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	// 금액
	public int getBalance() {
		return balance;
	}
      
	public void setBalance(int balance) { //금액이니까 int로 받고!!
		this.balance = balance;
	}
	
	
}



public class AccountEX{
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.println("선택 > ");

            int selectNo = sc.nextInt();
            
            switch(selectNo){
            case 1:
            	createAccount(); //1.계좌 생성
                break;
                
            case 2:
            	 accountList(); //2. 계좌 목록
                break;
                
            case 3:
            	deposit(); //3. 예금
                break;
                
            case 4:
            	 withdraw(); //4. 출금
                 break;
            
            case 5:
				 System.out.println("프로그랩 종료");
				 run = false; // while문 종료
				 break;
		
            }}}
            

	private static void circlePrintln01()
	{

		System.out.println("-------------");
		System.out.println("계좌 생성");
		System.out.println("-------------");

	}

	private static void circlePrintln02()
	{
		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");

	}

	private static void circlePrintln03()
	{
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
	}

	private static void circlePrintln04()
	{
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
	}

	// 계좌 생성하기
	private static void createAccount()
	{

		circlePrintln01();

		System.out.println("계좌번호(000-000형식) : ");
		String accountNum = sc.next();
		System.out.println("계좌주 : ");
		String accountOwner = sc.next();
		System.out.println("초기 입금액 : ");
		int accountBal = sc.nextInt();

		Account newAccount = new Account(accountNum, accountOwner, accountBal);

		for (int i = 0; i < accountArray.length; i++)
		{
			if (accountArray[i] == null)
			{
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	  //계좌목록보기
    private static void accountList(){
    	circlePrintln02();
        //변수 account = accountArray에 있던 계좌  (대입)
        for(int i =0; i <accountArray.length; i++){
         Account account = accountArray[i];
            //account가 null이 아닐때 [즉 계좌가 있을때]
            //계좌정보를 print해준다.
             if(account != null){
             System.out.print(account.getAno());
             System.out.print("  ");
             System.out.print(account.getOwner());
             System.out.print("  ");
             System.out.print(account.getBalance());
             System.out.println();
         }
        }
    }
	
    // 예금하기
	private static void deposit()
	{

		circlePrintln03();

		System.out.println("계좌 번호(000-000형식) : ");
		String accountNum = sc.next();
		System.out.println("예금액 : ");
		int accountBal = sc.nextInt();

		Account account = findAccount(accountNum);

		if (account == null)
		{
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		if (!account.getAno().equals(accountNum))
		{
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
			return;
		}

		account.setBalance(account.getBalance() + accountBal);
		System.out.println("예금이 성공되었습니다.");

	}

	// 출금하기
	private static void withdraw()
	{

		circlePrintln04();

		System.out.println("계좌번호(000-000형식) : ");
		String accountNum = sc.next();
		System.out.println("출금액 : ");
		int accountBal = sc.nextInt();

		Account account = findAccount(accountNum);

		if (account == null)
		{
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		if (!account.getAno().equals(accountNum))
		{
			System.out.println("계좌번호를 잘못 입력하셨습니다.");
			return;
		}
		if (account.getBalance() == 0 || account.getBalance() < accountBal || account.getBalance() - accountBal < 0)
		{
			System.out.println("잔액이 부족합니다.");
			return;
		}

		account.setBalance(account.getBalance() - accountBal);
		System.out.println("출금이 성공되었습니다.");

	}

	private static Account findAccount(String ano)
	{

		Account account = null;

		for (int i = 0; i < accountArray.length; i++)
		{
			if (accountArray[i] != null)
			{
				String accountNum = accountArray[i].getAno();
				if (accountNum.equals(ano))
				{
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
	}

	
}
	