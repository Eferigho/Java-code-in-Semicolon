package chapter7;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise479 {

	public static void main(String[] args) {
		int[][] t = new int[2][3];
//		int index1 = t[0][0];
//		int index2 = t[0][1];
//		int index3 = t[0][2];
//		
//		int index4 = t[0][1];
//		int index5 = t[1][1];
//		
//		t[0][1] = 0;
//		Scanner input = new Scanner(System.in);
//		for(int [] valuet : t) {
//			for(int value = 0; value < valuet.length; value++) {
//				valuet[value] = input.nextInt();
//			}
//			
//		}
//		System.out.println(Arrays.deepToString(t));
//		
		System.out.printf("%d %d %d%n", t[0][0],t[0][1],t[0][2]);
		System.out.printf("%d%n",t[0][2] + t[1][2] );
	}

}
