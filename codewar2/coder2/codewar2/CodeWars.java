package codewar2;

import java.util.Arrays;
import java.util.Scanner;

public class CodeWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		boolean RowWin = false;
		boolean columnWin = false;
		System.out.println("Enter the length of the array row");
		int rowLength = input.nextInt();
		
		System.out.println("Enter the length of the array column");
		int columnLength = input.nextInt();
		int sum = 0;
		int [][]myArray = new int[columnLength][rowLength];
		
		for(int columnCount = 0; columnCount < myArray.length; columnCount++) {
			int [] subArray = new int[rowLength];
			int cell = 0;
			for(; cell < subArray.length; cell++) {
				int check = 0;
				
				System.out.println("Fill table array with values");
				subArray[cell] = input.nextInt();
				if(cell >0) {
					if(subArray[cell-1] == subArray[cell]) {
						RowWin = true;
					}
					
				}
				
				sum += subArray[cell];
				
			}
			RowWin = false;
			myArray[columnCount] = subArray;
			
			//if(columnCount > 1) {
				System.out.println(myArray[columnCount][cell]);
				if(myArray[columnCount-1][subArray[cell-1]] == myArray[columnCount][subArray[cell]]) {
					columnWin = true;
				}
			//}
			System.out.println(Arrays.toString(subArray)+RowWin+columnWin);
			
		}
		System.out.println(Arrays.deepToString(myArray)+ " The sum of the Array is : "+sum);

		
	}

}
