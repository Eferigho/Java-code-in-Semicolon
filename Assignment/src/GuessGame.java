import java.security.SecureRandom;
import java.util.Scanner;
public class GuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom random = new SecureRandom();
		
		
		int counter = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Guess Number");
		int number = scan.nextInt();

			while(counter != -1) {
				int randomNumber = random.nextInt(1000);
									
			if(number > randomNumber) {
				System.out.println("Too high, Try Again  : "+randomNumber);
				System.out.println("Enter Guess Number");
				 number = scan.nextInt();
			}
			else if(number < randomNumber){
					System.out.println("Too low, Try Again  : "+randomNumber);
					System.out.println("Enter Guess Number");
					number = scan.nextInt();
			}
			else {
				System.out.println("You Guess Right!!!  : "+randomNumber);
			}
			counter++;
		}
		
		
		
	}

}
