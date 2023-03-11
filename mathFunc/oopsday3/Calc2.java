package oopsday3;

public class Calc2 implements mathIface {
	
	private Calc num = new Calc(50);

	@Override
	public int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f = f*i;
		}
		return f;
	}

//	S