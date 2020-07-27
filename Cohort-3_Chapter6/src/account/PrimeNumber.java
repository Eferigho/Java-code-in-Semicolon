package account;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String...strings) {
		
		max(2,6.0);
		
	}
	
	private static void max(int a, int b) {
		int max = 0;
		if(a > b) {
			max = a;
		}
		else {
			max = b;
		}
		System.out.println(max);
	}
	
	private static void max(int a, double b) {
		int max = 0;
		if(a > b) {
			max = a;
		}
		else {
			max = (int) b;
		}
		System.out.println(max);
	}
}
