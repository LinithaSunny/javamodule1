package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSub {
	static Calculator calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
		
		System.out.println("Before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testSub() {
		
			int a=4;
			int b=5;
			int expectedValue=-1;
			int actualValue=calc.sub(a,b);
			assertEquals(expectedValue,actualValue);
		}
		
		//fail("Not yet implemented");
	

}
