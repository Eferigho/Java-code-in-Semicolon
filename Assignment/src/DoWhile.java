import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int check = 0;
		do {
			System.out.println("Enter Number one");
			int numb1 = scan.nextInt();
			System.out.println("Enter Number two");
			int numb2 = scan.nextInt();
			
			int result = numb1 + numb2;
			System.out.println("The Result is : "+result);
			
			System.out.println("Enter -1 to terminate or any other number continue");
			 check= scan.nextInt();
		}
		while(check != -1);
			
		
		
	}

}
