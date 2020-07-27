/**
 * 
 */
package account;

/**
 * @author user
 *
 */
public class RoundedNumbers {

	public double number;
	public static final double tenth = 10;
	public static final int hundredth = 100;
	public static final int thousandth = 1000;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	public void setNumber(double number, double tenth) {
		if(tenth == 10) {
			this.number = Math.round(number * RoundedNumbers.tenth + 0.5)/RoundedNumbers.tenth;
		}
		
		else if(tenth == 100) {
			this.number = Math.round(number * RoundedNumbers.hundredth + 0.5)/RoundedNumbers.hundredth;
		}
		else if(tenth == 1000) {
			this.number = Math.round(number * RoundedNumbers.thousandth + 0.5)/RoundedNumbers.thousandth;
		}
	}
}
