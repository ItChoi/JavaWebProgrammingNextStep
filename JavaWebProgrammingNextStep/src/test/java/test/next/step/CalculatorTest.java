package test.next.step;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void test1() {
		// assertEquals(6, cal.returnNumber("1,2"));
		cal.returnNumber("//;\n1;2");
	}
	
	
}

class Calculator {
	
	public int returnNumber(String number) {
		String test = "";
		if (number.startsWith("//") && number.indexOf("\n") != -1) {
			test = number.substring(number.lastIndexOf("/") + 1, number.indexOf("\n"));
		}
		
		String[] split = number.split(",|:|" + test);
		for (String a : split) {
			System.out.println(a);
		}
		
		return 0;
	}
	
	
}

