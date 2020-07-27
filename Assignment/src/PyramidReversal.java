
public class PyramidReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<= 5; i++) {
			
			for(int sp = 5; sp >= i; sp--) {
				System.out.print(' ');
			}
			
			for(int y = 1; y <= i; y++) {
				System.out.print(i-y+1);
			}
			for(int j = 2; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
