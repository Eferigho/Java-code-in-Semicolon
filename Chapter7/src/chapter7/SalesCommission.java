/**
 * 
 */
package chapter7;

/**
 * @author user
 *
 */
public class SalesCommission {

	private final int weeklyPayment = 200;
	private final double standardCommission = 0.09;
	
	private int[] employeeGrossSales = {2050, 3600,4000,500,2000,3000};
	private int[] arrayOfCounters = new int[9];
	
	public int getGrossSales(int index) {
		return employeeGrossSales[index];
	}
	
	public int getSalary(int index) {
		int salary = (int) (employeeGrossSales[index] * standardCommission + weeklyPayment);
		return salary;
	}
}
