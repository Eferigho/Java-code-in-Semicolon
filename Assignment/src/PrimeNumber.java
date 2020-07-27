import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to check if it's prime number");
		int number = scan.nextInt();
		if((number == 1) || (number <= 0)) {
			System.out.println(number+" is not a prime number");
		}
		else {
			if(number < 10) {
				if(number == 2) {
					System.out.println(number+" is a prime number");
				}else {
					if(number % 2 == 0) {
						System.out.println(number+" is not a prime number");
					}
					else {
						System.out.println(number+" is  a prime number");
					}
				}
				
			}
			else if (number < 20){
				if((number % 2 == 0) || (number % 3 == 0)) {
						System.out.println(number+" is not a prime number");
				}
				else {
					System.out.println(number+" is  a prime number");
				}
			}
			else if(number < 30) {
				if((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0)) {
					System.out.println(number+" is not a prime number");
				}
				else {
				System.out.println(number+" is  a prime number");
				}
			}
			else if (number > 30){
				if((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0) ||
						(number % 7 == 0) || (number % 11 == 0)|| (number % 13 == 0) || (number % 17 == 0)) {
					System.out.println(number+" is not a prime number");
				}
				else {
				System.out.println(number+" is  a prime number");
				}
			}
		}
	}

}
