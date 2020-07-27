package chapter7;
import java.security.SecureRandom;

public class Dice {

	private int firstDie;
	private int secondDie;
	
	SecureRandom secure = new SecureRandom();
	
	
	public int getFirstDie() {
		return firstDie;
	}
	public void setFirstDie() {
		
		this.firstDie = 1 + secure.nextInt(6);
	}
	
	public int getSecondDie() {
		return secondDie;
	}
	public void setSecondDie() {
		this.secondDie = 1 + secure.nextInt(6);
	}
	
	
}
