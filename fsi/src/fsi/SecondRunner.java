package fsi;
import java.util.Scanner;
public class SecondRunner {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				System.out.print(' ');
				if((j-i == 0) || (j+i == 9) || (i == 5)){
					System.out.print('*');
				}
				
			}
			
			System.out.println();
		}
		

	}
	
	public static void palidrome(String sentence) {
		
		int palidromeCount = 0;
		//if((sentence == null) || (sentence.length() < 1)) //return 0; 
			
		for(int count = 0; count < sentence.length(); count++) {
			//System.out.println(sentence);
			char charFirst = sentence.charAt(count);
			char charSecond = sentence.charAt(charFirst);
			sentence =sentence.replace(charFirst, 'e');
			System.out.println(sentence);
		}
		
		
		//return  sentence.length();
	}

}
