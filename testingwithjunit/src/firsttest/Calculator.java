package firsttest;

public class Calculator {
	
	public int power(int b, int e)
	{
		int p = 1;
		int i = 1;
		
		if(b == 0 || e == 0)
			return 0;
		else
		{
			while(i<=e)
			{
				p *= b;
			}
		}
		return p;
		
	}
	
	public int add(int n1, int n2)
	{
		int sum=0;
		if(n1==0 || n2==0)
			return 0;
		else
			sum = n1+n2;
			return sum;
			
	}
	public int sub(int n1, int n2)
	{
		int s=0;
		if(n1==0 || n2==0)
			return 0;
		else
			s = n1-n2;
			return s;
			
	}
	
	
	
	


}
