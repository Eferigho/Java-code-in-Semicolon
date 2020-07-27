package account;
import java.util.Scanner;
public class LargestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int numb1, numb2,numb3, numb4;
		
		System.out.println("Enter value for number 1");
		numb1 = scan.nextInt();
		
		System.out.println("Enter value for number 2");
		numb2 = scan.nextInt();
		
		System.out.println("Enter value for number 3");
		numb3 = scan.nextInt();
		
		System.out.println("Enter value for number 4");
		numb4 = scan.nextInt();
		
		Largest lgest = new Largest();
		lgest.setNumb1(numb1);
		lgest.setNumb2(numb2);
		lgest.setNumb3(numb3);
		lgest.setNumb4(numb4);
		
		int largestNumber  = lgest.getLargestInFirstFour(lgest.getLargestInFirstThree(lgest.getLargestInFirstTwo(lgest.getNumb1(), lgest.getNumb2()), lgest.getNumb3()), lgest.getNumb4());
		System.out.println(largestNumber);
	}

}
