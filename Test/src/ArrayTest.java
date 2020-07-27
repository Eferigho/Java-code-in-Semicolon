import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int [] score = new int[2];
		int x = 0;
		int questionId = x;
		int answer;
		String question;
		while(x < score.length) {
			switch(questionId) {
			
			case 0:
				question = "\n What is the name of your Country \n  1 (Nigeria)	\n  2 (Germany)	\n  3 (France)";
				System.out.println(question);
				answer = input.nextInt();
				if(answer == 1) {
					score[x] = 1;
					x++;
						
				}
			case 1:
				question = "\n Which year did Nigeria gain Independent \n 	1 (1980) 2 (1990) \n 3(1960) ";
				answer = input.nextInt();
				if(answer == 3) {
					score[x] = 1;
					x++;
				}
			}
			
			
			
			
			
		}
		System.out.println(Arrays.toString(score));
	}

}
