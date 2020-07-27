
public class ArrayOf15Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 1;
		int sum = 0;
		
		for(; counter < 15; counter++) {
			int [] element = new int[counter];
			
			element[counter-1] = counter;
			sum += element[counter-1];
		}
		System.out.println(sum);
	}

}
