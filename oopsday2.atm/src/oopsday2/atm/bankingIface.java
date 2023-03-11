package oopsday2.atm;

public interface bankingIface {
	
	public abstract double withdraw(double amount);
	public abstract double deposit(double amount);
	public abstract double balanceEnquiry(int actno);

}