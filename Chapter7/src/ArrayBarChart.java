
public class ArrayBarChart {

	public static void main(String[] args) {
		
		int [] barChart = {0,1,2,3,4,5,4,3,2,1,0};
		
		for(int counter= 0; counter < barChart.length; counter++) {
			
			
			for(int counter1 = 0; counter1 <= barChart[counter]; counter1++ ) {
				System.out.printf("%5s","*");
			}
			//System.out.println();
			for(int sp = 2; sp >= 0; sp--) {
				System.out.print(' ');
			}
			
			for(int counter1 = 0; counter1 <= barChart[counter]; counter1++ ) {
				System.out.printf("%s","*");
			}
			System.out.println();
			
			
		}

	}

}
