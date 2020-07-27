package account;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortNumbers(13,9,17,18);
	}
	
	public static void sortNumbers(int a, int b, int c, int d) {
		int largest = 3, secondLargest = 2, thirdLargest = 1, smallest = 0;
		
		if((a > largest) && (a > secondLargest) && (a > thirdLargest) && (a > smallest)) {
			smallest = thirdLargest;
			thirdLargest = secondLargest;
			secondLargest = largest;
			largest = a;
			
		}
		else if((b > largest) && (b > a) && (b > c) && (b > d)) {
			largest = b;
		}
		else if((c > largest) && (c > a) && (c > b) && (c > d)) {
			largest = c;
		}
		else if((d > largest) && (d > a) && (d > b) && (d > c)) {
			largest = d;
		}
		
		
	   System.out.printf("%d	%d",largest,secondLargest);
	}
}
