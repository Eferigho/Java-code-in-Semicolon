/**
 * 
 */
package chapter7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class arrayTest {

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
		int [] tallMen = new int[7];
		int [] shortMen = {2,1,4,3,2};
		assertEquals(7,tallMen.length);
		assertEquals(4,shortMen.length-1);
		
		assertEquals(5,shortMen.length);
		
		
		
		for(int i= 0; i < shortMen.length; i++) {
			System.out.println("Index " + i +  "=" + shortMen[i]);	
		}
		System.out.println();
		System.out.println();
		System.out.println("Tall men is");
	}
	
	@Test
	void finalVariablrTest() {
		final int size = 9;
		
		int [] ages = new int[size];
		assertEquals(9,ages.length);
		
		int myNumber = 7;
		int [] students = new int[myNumber];
		myNumber = 5;
		assertEquals(7,students.length);
		assertEquals(5,myNumber);
		
	}

	void exceptionTest() {
		String[] semicolonWomenInTech = {"Teni","Cynthia","Esther","Debbie","Nonye","Jeminant","Tope","Oma"};
		
		try {
			assertTrue(semicolonWomenInTech.length == 9);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("An exception is being handled...");
			System.out.println(ex.getStackTrace());
			
		}
	}
	void enhancedForTest() {
		String[] semicolonWomenInTech = {"Teni","Cynthia","Esther","Debbie","Nonye","Jeminant","Tope","Oma"};
		
		for(String techBabe : semicolonWomenInTech) {
			System.out.println(techBabe);
		}
	}
	
	@Test
	void multiDimensionalArrayTest() {

		String [][] cohortsAndPriests = new String[4][2];
		
		cohortsAndPriests[0][0] = "pastor Brown";
		cohortsAndPriests[0][1] = "Dipo";
		cohortsAndPriests[1][0] = "Kayode";
		cohortsAndPriests[1][1] = "Moby";
		cohortsAndPriests[2][0] = "Tega";
		cohortsAndPriests[2][1] = "Orama";
		cohortsAndPriests[3][0] = "Deborah";
		cohortsAndPriests[3][1] = "Victor";
		
		for(int i= 0; i < cohortsAndPriests.length; i++) {
			
			for(int j = 0; j < cohortsAndPriests[i].length; j++) {
				System.out.println(cohortsAndPriests[i][j]);
			}
		}
	}
	
	void arrayListTest() {
		ArrayList<String> semicolonWomenInTech = new ArrayList<>();
		semicolonWomenInTech.add("Oroma");
		semicolonWomenInTech.add("Cynthia");
		assertEquals(2, semicolonWomenInTech.size());
		semicolonWomenInTech.remove(0);
		assertEquals(2, semicolonWomenInTech.size());
	}
}
