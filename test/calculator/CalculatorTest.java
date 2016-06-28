package calculator;

import calculator.Calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;





public class CalculatorTest {
 	
	Calculator cal;
	
	
	
	@Before
	public void setup() {
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		int result = cal.add(3,  4);
//		System.out.println(result);
		
		assertEquals(7, result);
	}
	
	@Test
	public void testMultiply() {
		
		Calculator cal = new Calculator();
		int result = cal.multiply(3, 4);
		
		assertEquals(12, result);
	}
	
	@After
	public void tearDown() {
		System.out.println("teardown");
	}
}
