package exceptionsday6;

public class ExeceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("program begins");
		try
		{
		
		int b = Integer.parseInt(args[0]); // command line arguments
		int a = Integer.parseInt(args[1]);//"10" "20"
		int c = b/a;
		String name = args[2];
		int data[] = {a,b};
		System.out.println("Program is over");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
