package chapter11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testDivide() {
		int result = Calculator.divide(4, 0);
	}
	
	@Test
	void testDivideDouble() {
		double result = Calculator.divide(4.0, 0);
	}

}
