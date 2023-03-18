package javaenums;

public class TestEnum {
	
	public static void main(String[] args) {
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is "+ today.getName());
		
		//output:saturday
		
		switch(today) {
		
		case MONDAY:
					System.out.println("Work hard");
					break;
					
		case TUESDAY:
			System.out.println("Work little");
			break;
			
		case WEDNESDAY:
			System.out.println("Work work little more");
			break;
			
		case THURSDAY:
			System.out.println("Work WORK MORE,WEEKEND IS AROUND");
			break;
			
		case FRIDAY:
			System.out.println("WEEKEND IS HERE,PARTY HARD");
			break;
		
		case SATURDAY:
			System.out.println("ENJOY MRNG COFFEE, GO FOR SHOPPING");
			break;
			
		case SUNDAY:
			System.out.println("GO CHURCH AND PRAY");
			break;
			
		
		}
	}

}
