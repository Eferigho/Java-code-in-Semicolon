package codewar2;

import java.util.Arrays;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(gameWon() == gameWon1() &&(gameWon() ==gameWon2())) {
			System.out.println("True");
		}
		
		
		
	}
public static boolean gameWon() {
	gameWon1();
	int [] game = new int[3];
	game[1] = 1;
	game[1] = 1;
	game[0] = 0;
	game[0]= 1;
	game[1] = 1;
	game[1] = 0;
	game[1] = 0;
	
	System.out.println(Arrays.toString(game));
	
	return true;
}

public static boolean gameWon1() {
	gameWon2();
	int [] game = new int[3];
	game[0] = 0;
	game[0] = 1;
	game[0] = 0;
	game[0]= 1;
	game[1] = 1;
	game[1] = 0;
	game[1] = 0;
	
	System.out.println(Arrays.toString(game));
	return true;
}

public static boolean gameWon2() {
	int [] game = new int[3];
	game[0] = 1;
	game[0] = 1;
	game[0] = 1;
	game[0]= 1;
	game[1] = 1;
	game[1] = 0;
	game[1] = 0;
	
	System.out.println(Arrays.toString(game));
	return true;
}
}
