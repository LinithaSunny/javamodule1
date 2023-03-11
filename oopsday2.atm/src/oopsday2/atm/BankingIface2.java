package oopsday2.atm;

public interface BankingIface2 {
	
	public double withdraw(double amount,int actno);
	public double deposit(double amount,int actno);
	public double balanceEnquiry(int actno);

}
