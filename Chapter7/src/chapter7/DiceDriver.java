package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class DiceDriver {
	
	 
	public static void main(String[] args) {
		
		
		
		int [][] diceCombi = new int[6][6];
		int[] indexCounter = new int[11];
		int sum = 0;
		Dice dice = new Dice();
		for( int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				
				diceCombi[i][j] = i + j + 2;
				
				System.out.printf("%d   ",diceCombi[i][j] );
			}
			System.out.println();
		}
		
		for(int count = 1; count < 36_000_000; count++) {
			dice.setFirstDie();
			dice.setSecondDie();
			sum = dice.getFirstDie() + dice.getSecondDie();
			if(sum == 2) {
				indexCounter[0]++;
			}
			else if( sum == 3) {
				indexCounter[1]++;
			}
			else if( sum == 4) {
				indexCounter[2]++;
			}
			else if( sum == 5) {
				indexCounter[3]++;
			}
			else if( sum == 6) {
				indexCounter[4]++;
			}
			else if( sum == 7) {
				indexCounter[5]++;
			}
			else if( sum == 8) {
				indexCounter[6]++;
			}
			else if( sum == 9) {
				indexCounter[7]++;
			}
			else if( sum == 10) {
				indexCounter[8]++;
			}
			else if( sum == 11) {
				indexCounter[9]++;
			}
			else if( sum == 12) {
				indexCounter[10]++;
			}
			
		}
		System.out.printf("dice sum of 2 occur =  %d%n", indexCounter[0]);
		System.out.printf("dice sum of 3 occur =  %d%n", indexCounter[1]);
		System.out.printf("dice sum of 4 occur =  %d%n", indexCounter[2]);
		System.out.printf("dice sum of 5 occur =  %d%n", indexCounter[3]);
		System.out.printf("dice sum of 6 occur =  %d%n", indexCounter[4]);
		System.out.printf("dice sum of 7 occur =  %d%n", indexCounter[5]);
		System.out.printf("dice sum of 8 occur =  %d%n", indexCounter[6]);
		System.out.printf("dice sum of 9 occur =  %d%n", indexCounter[7]);
		System.out.printf("dice sum of 10 occur =  %d%n", indexCounter[8]);
		System.out.printf("dice sum of 11 occur =  %d%n", indexCounter[9]);
		System.out.printf("dice sum of 12 occur =  %d%n", indexCounter[10]);
	}

}
