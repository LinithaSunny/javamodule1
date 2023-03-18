package Atm;

import java.util.Scanner;

public class AtmFun  {
	
	public AtmFun() {
		int attempt =4;
		while (attempt != 0) {
			
			int i50 =0;
			NoteCount n = new NoteCount();
			System.out.println("Enter the amount to withdraw");
			Scanner sc = new Scanner(System.in);
			
			int amount = sc.nextInt();
			
			System.out.println(" Denominations available are of: \n\n 1.100 \n 2.50");
			System.out.println(" Enter the number of 100 notes");
			int i100 = sc.nextInt();
			if(i100*100 < amount) {
			System.out.println(" Enter the number of 50 notes");
			 i50 = sc.nextInt();
			}
			
			if(i100*100 + i50*50 == amount ) {
				
				if((n.getFifty() - i50)>=0) {
				
				 int fifbal =n.getFifty() - i50;
				 n.setFifty(fifbal);}else {
					 System.out.println("insufficient 50 notes");
				 }
				if((n.getHundred() - i100)>=0) {
				
				 int hunbal =n.getHundred() - i100;
				 n.setHundred(hunbal);}else {
					 System.out.println("insufficient 100 notes");
					 
				 }
				
				System.out.println("fifnotes left in machine =" + n.getFifty());//for admin
				System.out.println("hunnotes left in machine =" + n.getHundred());//for admin
				System.out.println("Rupees "+ amount+ " withdrawn successfully :) with " + i100+ " $100 notes and "+i50 + " $50 notes");
				attempt=0;
			}else {
				 attempt = attempt -1 ;
				 System.out.println("Invalid operation!! You have " + attempt + " attempts left");
				 
			}
			
			}
		
		
	}
	

}
