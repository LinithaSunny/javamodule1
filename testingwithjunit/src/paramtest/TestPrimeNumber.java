package paramtest;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeNumber {
	private final Integer inputNumber;
	private final Boolean expectedResult;
	private PrimeNumber primeNumber;
	@Before
	public void initialise()
	{
		PrimeNumber primenumber = new PrimeNumber();
		
	}
	
	public TestPrimeNumber(Integer inputNumber,Boolean expectedResult)
	{
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	

	@Test
	public void test() {
		
		
		public static Collection primeNumbers()
		{
			return Arrays.asList(new Object[][])
					{
				{2,true},
				{6,true},
				{19,true},
				{22,true},
				{23,true},
				{24,true}
					
			);
					}
		}
	}

}
