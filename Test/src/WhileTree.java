
public class WhileTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		while(counter <= 7) {
			int counter1 = 1;
			
			int sp = 7;
			while(sp >= counter) {
				System.out.print(' ');
				sp--;
			}
			
			while(counter1 <= counter) {
				System.out.printf("%d",counter - counter1 +1);
				counter1++;
			}
			
			int j = 2;
			while(j <= counter) {
				System.out.print(j);
				j++;
			}
			
			counter++;
			System.out.println();
			
		}
	}

}
