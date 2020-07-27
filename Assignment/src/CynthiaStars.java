
public class CynthiaStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i <= 5; i++) {
			
			for(int sp = 5; sp> i; sp--) {
				System.out.print(' ');
			}
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		for(int i = 5; i >= 0; i--) {
			
			for(int sp = 5; sp> i; sp--) {
				System.out.print(' ');
			}
			for(int j = 0; j < i; j++) {
				System.out.print("");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}

}
