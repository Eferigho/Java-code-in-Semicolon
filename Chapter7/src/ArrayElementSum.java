
public class ArrayElementSum {

	public static void main(String[] args) {
		
		int [] arraySum = new int[10];
		int totalSum = 0;
		for(int counter = 0; counter < arraySum.length; counter++) {
			arraySum[counter] = 3 * counter;
			
			
			totalSum = totalSum + arraySum[counter];
			System.out.printf("%5d  *  3 	= %8d%n", counter, arraySum[counter]);
		}
		System.out.printf("The sum of the Array: %5d",totalSum);

	}

}