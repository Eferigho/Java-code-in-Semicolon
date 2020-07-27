/**
 * 
 */
package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class StudentGradeTest {

	StudentGrade studentGrade;
	@BeforeEach
	void setUp() throws Exception {
		studentGrade = new StudentGrade();
	}

	@Test
	void ArrayCanTakeScoresTest() {
		int [] ArrayOfGrades = {2,8,8,1,20};	
		studentGrade.setStudentGrade(ArrayOfGrades);
		assertEquals(2,studentGrade.getStudentGrade()[0]);
	}

}
