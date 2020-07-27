import java.util.Scanner;
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter -1 to turn Off TV Or 1  to turn ON TV");
		int turnOn = scan.nextInt();
		
		while((turnOn > -1) && (turnOn < 2)) {
			Television lg = new Television();
			lg.setTvSate();
		}
			
		
		
		
	}

}
