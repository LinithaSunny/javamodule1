package oopsday3.atm.menu;

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
		// TODO Auto-generated constructor stub
	}
	
	public InsufficientFundsException(String msg) {
		super(msg);
	}
	
	public String getMessage()
	{
		return super.getMessage();
	}

}
