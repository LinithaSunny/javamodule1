package firsttest;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAdd.class, TestCalculator.class, TestSub.class })
public class AllTests {

}
