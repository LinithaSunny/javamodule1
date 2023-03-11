package oopsday2.atm;

public class BankTransactions {

	public static void main(String[] args) {
		bankingIface bom = new BankOfAmerica();
		double balance = bom.deposit(250);
		System.out.println("balance after deposit= " +balance);
		balance = bom.withdraw(175.25);
		System.out.println("balance after withdrawal= " +balance);
		

	}

}