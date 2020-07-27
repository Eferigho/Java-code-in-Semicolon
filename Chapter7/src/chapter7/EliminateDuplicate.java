package chapter7;
import java.util.Arrays;
import java.util.Scanner;
public class EliminateDuplicate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] eliminateDuplicate = new int[5];
		
		
		for(int count = 0; count < eliminateDuplicate.length; count++) {
			System.out.println("Enter value into array");
			int newValue = scan.nextInt();
			int countCheck = count;
			while(countCheck>= 0) {
				
				
					
					if( (countCheck > 0)&&(eliminateDuplicate[count-1] == newValue)) {
						System.out.println(eliminateDuplicate[count-1]);
						eliminateDuplicate[count] = 0;
					}
					else {
						eliminateDuplicate[count] = newValue;
					}
				
				
				countCheck--;
			}
			
		}

		System.out.println(Arrays.toString(eliminateDuplicate));
	}

}
