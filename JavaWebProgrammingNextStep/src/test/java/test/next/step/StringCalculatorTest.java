package test.next.step;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator cal;
	
	@Before
	public void setup() {
		cal = new StringCalculator();
	}
	
	@Test
	public void test1() {
		assertEquals(3, cal.returnNumber("//:\n1:2"));
	}
	
	
}


