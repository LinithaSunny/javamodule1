package oopsday3.atm.menu;


import java.util.Scanner;
public class BankMenu {
	
	// 1.display account 2.deposit 3.withdraw 4.balance enquiry 5.exit
	
	BankOfAmerica2 boa = new BankOfAmerica2();
	public BankMenu() {
		Account a1 = new Account(101,"John Doe","savings",500);
		Account a2 = new Account(102,"Ja Doe","savings",700);
		Account a3 = new Account(103,"Jo Doe","savings",850);
		Account a4 = new Account(104,"Jon Doe","savings",250);
		Account a5 = new Account(105,"Joh Doe","savings",650);
		
		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
	}
	public void menu()
	{
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		loop: do
		{
			System.out.println("Enter Your Choice 1...5");
			System.out.println("1.Display account");
			System.out.println("2.Deposit cash");
			System.out.println("3.withdraw cash");
			System.out.println("4.Balance enquiry");
			System.out.println("5.Exit");
			
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
				
				{
					System.out.println("Enter the account number");
					int actno = scanner.nextInt();	
					boa.displayAccount(actno);
					break;
				}
				case 2:
				
				{
					System.out.println("Enter the account number");
					int actno = scanner.nextInt();		
					System.out.println("Enter the amount to be deposited");
					int amount = scanner.nextInt();		
					double balanceAmnt = boa.deposit(amount,actno);
					System.out.println(balanceAmnt);
					break;
				}
				case 3:
				
				{
					System.out.println("Enter the account number");
					int actno = scanner.nextInt();		
					System.out.println("Enter the amount to be withdrawn");
					int amount = scanner.nextInt();
					double withdrawAmnt = 0;
					double balance = 0;
					try {
						withdrawAmnt = boa.withdraw(amount,actno);
					} catch (InsufficientFundsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(withdrawAmnt);
					break;	
				}
				case 4:
				
				{
					System.out.println("Enter the account number whose balance is to be known");
					int actno = scanner.nextInt();
					double balanceAmnt = boa.balanceEnquiry(actno);
					System.out.println(balanceAmnt);
					break;
				}
				case 5:
				
				{
					System.out.println("exiting");
					break loop;
				}
			
			}
		}while(choice!=5);
	}
	
	
						
	

}
