import java.util.Scanner;
public class SortNumbers {

	public static void main(String...strings) {
		Scanner scan = new Scanner(System.in);
		
		sortNumbers(12,51,109,33);
	}
	
	public static void sortNumbers(int a, int b, int c, int d) {
		int num = 0;
		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		int smallest = 0;
		for(int i = 1; i <= 4; i++) {
			if(i == 1) {
				num = a;
				if(num > largest ) {
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = largest;
					largest = num;
				}
				else if ((num < largest) && (num > secondLargest)){
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num > thirdLargest)) {
					smallest = thirdLargest;
					thirdLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num < thirdLargest) && ( num > smallest)){
					smallest = num;
				}
			}
			
			else if(i == 2) {
				num = b;
				if(num > largest ) {
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = largest;
					largest = num;
				}
				else if ((num < largest) && (num > secondLargest)){
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num > thirdLargest)) {
					smallest = thirdLargest;
					thirdLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num < thirdLargest) && ( num > smallest)){
					smallest = num;
				}
			}
			
			else if(i == 3) {
				num = c;
				if(num > largest ) {
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = largest;
					largest = num;
				}
				else if ((num < largest) && (num > secondLargest)){
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num > thirdLargest)) {
					smallest = thirdLargest;
					thirdLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num < thirdLargest) && ( num > smallest)){
					smallest = num;
				}
			}
			
			else if(i == 4) {
				num = d;
				if(num > largest ) {
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = largest;
					largest = num;
				}
				else if ((num < largest) && (num > secondLargest)){
					smallest = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num > thirdLargest)) {
					smallest = thirdLargest;
					thirdLargest = num;
				}
				else if ((num < largest) && (num < secondLargest) && (num < thirdLargest) && ( num > smallest)){
					smallest = num;
				}
			}
		}
		System.out.printf(" largest is: %d 	second largest is: %d 	third largest is :%d	 smallest is: %d",largest,secondLargest,thirdLargest,smallest);
	}
	
}
