import java.util.Scanner;
public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = scan.nextInt();
		for(int i = 1; i <= 12; i++) {
			int result = number * i;
			System.out.printf("%d * %d = %d%n",i,number,result);
		}
	}

}
