/**
 * 
 */
package calculator;

/**
 * @author user
 *
 */
public class Calculator {

//	public int add(int i, int j) {
//		return i+j;
//	}
	
	public double add(double i, double j) {
		return i+j;
	}
	
	public int subtract(int numberOne, int numberTwo) {
		if(numberOne > numberTwo) {
			return numberOne - numberTwo;
		}
		else {
		   return  numberTwo - numberOne;
		}
	}
	
	public float subtract(double firstNumber, double secondNumber) {
		float numberOne = (float) firstNumber;
		float numberTwo = (float) secondNumber;
		if(numberOne > numberTwo) {
			return numberOne - numberTwo;
		}
		else {
		   return  numberTwo - numberOne;
		}
		
	}
}
