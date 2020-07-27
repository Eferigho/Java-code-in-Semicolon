package fsi;
import java.util.ArrayList;

import java.util.Scanner;

public class Tweets {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of tweets");
		int n = input.nextInt();
		int counter = 0;
		input.nextLine();
		String[] tweets = new String[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter Tweet");
			tweets[i] = input.nextLine();
		}
		
		for(String tweet : tweets ) {
			String processedTweet = tweet.replaceAll("[^a-zA-Z]", " ").toLowerCase();
			String[] spliTweet = processedTweet.split(" ");
			// System.out.println("This is split tweet"+ Arrays.deepToString(spliTweet));
			for(String countTweet : spliTweet  ) {
				// System.out.println("This is count tweet"+ countTweet);
				if(countTweet.equals("hackerrank")) {
					counter = counter+1;
				}
			}
		}
		System.out.println(counter);
		input.close();
	}

}
