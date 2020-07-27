package account;
//import java.util.Scanner;
public class Largest {
	private int numb1;
	private int numb2;
	private int numb3;
	private int numb4;
	
	//Scanner scan = new Scanner(System.in);
	private int largestAmongTwo;
	private int largestAmongThree;
	private int largestAmongFour;
	
	public int getNumb1() {
		return numb1;
	}
	public void setNumb1(int numb1) {
		this.numb1 = numb1;
	}
	public int getNumb2() {
		return numb2;
	}
	public void setNumb2(int numb2) {
		this.numb2 = numb2;
	}
	public int getNumb3() {
		return numb3;
	}
	public void setNumb3(int numb3) {
		this.numb3 = numb3;
	}
	public int getNumb4() {
		return numb4;
	}
	public void setNumb4(int numb4) {
		this.numb4 = numb4;
	}
	
	public int getLargestInFirstTwo(int numb1, int numb2) {
		if(numb1 > numb2) {
			largestAmongTwo = numb1;
		}
		else {
			largestAmongTwo = numb2;
		}
		return largestAmongTwo;
		
	}
	
	public int getLargestInFirstThree(int largestAmongTwo, int numb3) {
		if(largestAmongTwo > numb3) {
			largestAmongThree= largestAmongTwo;
		}
		else {
			largestAmongThree = numb3;
		}
		return largestAmongThree;
		
	}
	
	public int getLargestInFirstFour(int largestAmongThree, int numb4) {
		if(largestAmongThree > numb4) {
			largestAmongFour= largestAmongThree;
		}
		else {
			largestAmongFour = numb4;
		}
		return largestAmongFour;
		
	}
	public void setNumbers() {
		
	}

}
