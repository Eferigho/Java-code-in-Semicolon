package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceRollingTest {

	Dice newDice;
	int sum;
	@BeforeEach
	void setUp() throws Exception {
		 newDice = new Dice();
	}

	@Test
	void testSumNotNull() {
		sum = newDice.getFirstDie() + newDice.getSecondDie();
		assertNotNull(sum);
	}
	
	@Test
	void testSumLessThanOrEqualTo12() {
		newDice.setFirstDie();
		newDice.setSecondDie();
		sum = newDice.getFirstDie() + newDice.getSecondDie();
		assertTrue(sum <= 12);	
		
	}

}
