package turtle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArraysTest {
	String hotBabe;

	@Test
	void arrayLengthTest() {
		int[] tallMen = new int[7];
		//tallMen[] = {11, 10, 12, 14, 9, 8, 10};
		int[] shortMen = {2, 1, 4, 3, 2};
		
		assertEquals(7, tallMen.length);  //assert length of the array
		assertEquals(6, tallMen.length-1); //assert highest index of the array
		
		assertEquals(5, shortMen.length);
		assertEquals(4, shortMen.length-1);
		
		for(int i = 0; i < shortMen.length; i++) {
			System.out.println("Index " + i + " = " + shortMen[i]);
		}
		
		System.out.println(); System.out.println();
		
		System.out.println("Tall men is " + tallMen);
		System.out.println("Short men is " + shortMen);
		
		System.out.println(); System.out.println();
		
		for(int i : tallMen) {
			System.out.println("Index " + i + " = " + tallMen[i]);
		}
	}

	@Test
	void finalVariableTest() {
		final int SIZE = 9;
		int[] ages = new int[SIZE];
		
		assertEquals(9, ages.length);
		
		int theLength = 7;
		int[] students = new int[theLength];
		theLength = 5;
		assertEquals(7, students.length);
		assertEquals(5, theLength);
	}

	@Test
	void exceptionTest() {
		String[] semicolonWomenInTech = {"Teni", "Cynthia", "Esther", "Debbie", "Nonye", "Jeminat", "Oma", "Evangelina", "Tope"};
		try {
			assertTrue(semicolonWomenInTech.length == 9);
			hotBabe.strip();
			String badBabe = semicolonWomenInTech[10];
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("An exception is being handled...");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}catch(NullPointerException ex) {
			System.out.println("Null pointer exception is being handled...");
			System.out.println(ex.getMessage());
		}
	}

	@Test
	void enhancedForTest() {
		String[] semicolonWomenInTech = {"Teni", "Cynthia", "Esther", "Debbie", "Nonye", "Jeminat", "Oma", "Evangelina", "Tope"};
		System.out.println("Printing with enhanced for loop....");
		for(String techBabe : semicolonWomenInTech) {
			System.out.println(techBabe);
		}
		System.out.println();
		
		System.out.println("Printing with normal for loop....");
		for(int i = 0; i < semicolonWomenInTech.length; i++) {
			System.out.println(semicolonWomenInTech[i]);
		}
	}

	@Test
	void passToMethodTest() {
		String[] semicolonWomenInTech = {"Teni", "Cynthia", "Esther", "Debbie", "Nonye", "Jeminat", "Oma", "Evangelina", "Tope"};
		
		String womanInTech = ArraysTest.getTechBabe(semicolonWomenInTech);
		assertEquals("Teni", womanInTech);
		assertNotEquals("Tope", semicolonWomenInTech[semicolonWomenInTech.length-1]);
		assertEquals("Oroma", semicolonWomenInTech[semicolonWomenInTech.length-1]);
		
		System.out.println("Women in tech in test method are:");
		for(String woman : semicolonWomenInTech) {
			System.out.println(woman);
		}
	}
	
	public static String getTechBabe(String[] womenInTech) {
		String[] nonSemicolonWomenInTech = {"Ire", "Adia", "Ada"};
		String result = womenInTech[0];
		System.out.println("Woman in last index position is " + womenInTech[womenInTech.length-1]);
		womenInTech[womenInTech.length-1] = "Oroma";
		System.out.println("Woman now in last index position is " + womenInTech[womenInTech.length-1]);
		
		System.out.println("Number of women in Tech is " + womenInTech.length);
		womenInTech = nonSemicolonWomenInTech;
		System.out.println("Now number of women in Tech is " + womenInTech.length);
		for(String woman : womenInTech) {
			System.out.println(woman);
		}
		return result;
	}
	
	@Test
	void multiDimensionalArrayTest() {
		String[][] cohortsAndPriests = new String[4][2];
		
		cohortsAndPriests[0][0] = "Pastor Brown";
		cohortsAndPriests[0][1] = "Dipo";
		cohortsAndPriests[1][0] = "Kayode";
		cohortsAndPriests[1][1] = "Moby";
		cohortsAndPriests[2][0] = "Tega";
		cohortsAndPriests[2][1] = "Oroma";
		cohortsAndPriests[3][0] = "Deborah";
		cohortsAndPriests[3][1] = "Victor";
		
		//String[][] cohortPriests = {{"Brown", "Dipo"}, {"Kayode", "Moby"}};
		
		for(int i = 0; i < cohortsAndPriests.length; i++) {
			for(int j = 0; j < cohortsAndPriests[i].length; j++) {
				System.out.println(cohortsAndPriests[i][j]);
			}
		}
		
		System.out.println();
		for(String[] cohortPriests : cohortsAndPriests) {
			for(String priest : cohortPriests) {
				System.out.println(priest);
			}
		}
	}

	@Test
	void arrayListTest() {
		ArrayList<String> semicolonWomenInTech = new ArrayList<>();
		semicolonWomenInTech.add("Oroma");
		semicolonWomenInTech.add("Teni");
		assertEquals(2, semicolonWomenInTech.size());
		semicolonWomenInTech.remove(0);
		assertEquals(1, semicolonWomenInTech.size());
	}
}
