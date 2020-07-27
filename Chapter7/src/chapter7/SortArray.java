package chapter7;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []tryArray = {19,7,5,0,36,1,6,9,56};
		
		int[] sortedArray = sortArray(tryArray);
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static int[] sortArray(int[] yourArray) {
		int temp = 0;
		for(int start = 0; start < yourArray.length; start++) {
			
			for(int end = 1; end < yourArray.length; end++) {
				if(yourArray[start] < yourArray[end]) {
					temp = yourArray[start];
					yourArray[start] = yourArray[end];
					yourArray[end] = temp;
				}
			}
		}
		
		return yourArray;
	}

}
