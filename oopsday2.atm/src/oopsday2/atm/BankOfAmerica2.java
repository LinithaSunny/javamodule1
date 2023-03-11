package oopsday2.atm;

public class BankOfAmerica2 implements BankingIface2 {
	
	private Account[] accounts = new Account[5];
	private int accountIndex = 0;
	
	
	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double withdraw(double amount,int actno) {
		double tempBal = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() == actno)
			{
				tempBal = accounts[i].getBalance();
				tempBal-= amount;
				accounts[i].setBalance(tempBal);
				break;
				
			}
		}
		return tempBal;
			
	}

	@Override
	public double deposit(double amount,int actno) {
		double tempBal = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() == actno)
			{
				tempBal = accounts[i].getBalance();
				tempBal+= amount;
				accounts[i].setBalance(tempBal);
				break;
				
			}
		}
		return tempBal;
			
	}

	@Override
	public double balanceEnquiry(int actno) {
		double tempBal = 0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() == actno)
			{
				tempBal = accounts[i].getBalance();
				break;
			}
		}
		return tempBal;
	}
	public void addAccount(Account account)
	{
		if(this.accountIndex < accounts.length) {
			accounts[this.accountIndex++] = account;
		}
		else
		{
			System.out.println("invalid operation");
		}
		
	}


	public Account[] getAccount() {
		return accounts;
	}


	public void setAccount(Account[] account) {
		this.accounts = account;
	}
	

}
