
public class EnhancedForExample {

	public static void main(String[] args) {
		
		
		int [] arrayFor = {10,30,1,21, 23,55,45};
		int  total = 0;
		for(int number : arrayFor) {
			total += number; 
			System.out.printf(" %d%n", number);
			
		}
		System.out.println(total);
		
		


	}

}
