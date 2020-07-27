package chapter11;

import java.util.InputMismatchException;

public class Calculator {
	
	public static int divide(int numerator, int denominator) {
		int result = 0;
		try {
			result = numerator / denominator;
			
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			throw ex;
			//throw new ArithmeticException("Cannot divide with 0 as the denominator");
		}
		catch(InputMismatchException im){
			System.out.print(im + " is not a valid input");
		}
		return result ;
	}

	public static double divide(double numerator, double denominator) throws ArithmeticException {
			return numerator / denominator;
		
	}
}
