import java.util.Arrays;

public class GradesBook 
{
	public static void main(String[] args) 
	{
		int [][]  Allarray = {{1,3,6,4,5,2},
							  {7,8,9,10,11,12},
							  {13,14,15,16,17,18},
							  {19,20,21,23,24,45}};
		int sum = 0;
		for(int [] array : Allarray) 
		{
			for(int value : array) 
			{
				sum += value;
			}
		}
//		System.out.println(sum);
//		System.out.println(highestNumber(Allarray));
//		System.out.println(lowestNumber(Allarray));
		System.out.println(Arrays.deepToString(sortedArray(Allarray)));
		
		int [] firstArray = {1,2,3,4,5,6,7,8,9,10,20,34};
		int []secondArray = new int[34];
		for(int count = 0; count < firstArray.length; count++) {
			secondArray[count] = firstArray[count];
		}
		
//		System.out.println(Arrays.toString(secondArray));
	}
	
	public static int highestNumber(int [][]array) {
		int highest = 0;
		for(int [] sigleArray : array) {
			for(int value : sigleArray) {
				if(value > highest) {
					highest = value;
				}
			}
		}
	
		return highest;
	}
	
	public static int lowestNumber(int [][]array) {
		int smallest = array[0][0];
		for(int [] sigleArray : array) {
			for(int value : sigleArray) {
				if(value < smallest) {
					smallest = value;
				}
			}
		}
	
		return smallest;
	}
	
	public static int[][] sortedArray(int[][]array) {
		int [][]sortedArray = array;
		int temp = 0;
		for(int[]sigleArray : array) {
			for(int index = 0; index < array.length; index++) {
				
				for(int innerIndex = index; innerIndex < sortedArray.length; innerIndex++) {
					if(sigleArray[index] > sigleArray[innerIndex]) {
						temp = sigleArray[index];
						 sigleArray[index] = sigleArray[innerIndex];
						 sigleArray[innerIndex] = temp;
					}
				}
				for(int ind = 0; ind < array.length; ind++) {
					sortedArray[ind] = sigleArray;
				}
			}
			
		}
		return sortedArray;
	}
}
