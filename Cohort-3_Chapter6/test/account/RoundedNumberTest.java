/**
 * 
 */
package account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class RoundedNumberTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
 
	@Test
	void test() {
		RoundedNumbers myRoundedNumbers = new RoundedNumbers();
		myRoundedNumbers.setNumber(4.1,1000);
		assertEquals(4,myRoundedNumbers.getNumber());
		
	}
	@Test
	void testTenth() {
		assertEquals(1000,RoundedNumbers.thousandth);
	}

}
