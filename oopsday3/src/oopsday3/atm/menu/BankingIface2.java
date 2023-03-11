package oopsday3.atm.menu;

public interface BankingIface2 {
	
	public double withdraw(double amount,int actno) throws InsufficientFundsException;
	public double deposit(double amount,int actno);//throws InsufficientFundsException
	public double balanceEnquiry(int actno);//throws NegativeAmountException



}